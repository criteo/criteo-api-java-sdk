import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.ApiResponse;
import com.criteo.api.retailmedia.preview.api.OAuthApi;
import com.criteo.api.retailmedia.preview.model.AccessTokenModel;

public class OAuthApiTest {
    private static String clientId = System.getenv("TEST_CLIENT_ID");
    private static String clientSecret = System.getenv("TEST_CLIENT_SECRET");
    private static String applicationId = System.getenv("TEST_APPLICATION_ID");

    @Before
    public void setUp() {
        assertNotNull(clientId);
        assertNotNull(clientSecret);
        assertNotNull(applicationId);
    }
 
    @Test
    public void testGetTokenShouldSucceedWithValidCredentials() throws ApiException {
        // Arrange
        OAuthApi api = new OAuthApi();
        String grantType = "client_credentials";

        // Act
        ApiResponse<AccessTokenModel> httpResponse = api.getTokenWithHttpInfo(grantType, clientId, clientSecret, null, null, null);

        // Assert
        assertEquals(200, httpResponse.getStatusCode());
        assertNotNull(httpResponse.getData().getAccessToken());
    }

    @Test
    public void testGetTokenShouldFailWithInvalidCredentials() {
        // Arrange
        OAuthApi api = new OAuthApi();
        String grantType = "client_credentials";

        // Act & Assert
        ApiException exception = assertThrows(ApiException.class, () -> {
            api.getTokenWithHttpInfo(grantType, "invalid-client-id", "invalid-client-secret", null, null, null);
        });
        assertEquals(401, exception.getCode());
    }
}

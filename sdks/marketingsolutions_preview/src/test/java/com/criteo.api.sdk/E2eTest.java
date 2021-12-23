import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.api.OAuthApi;
import com.criteo.api.marketingsolutions.preview.ApiResponse;
import com.criteo.api.marketingsolutions.preview.model.AccessTokenModel;

public class E2eTest {
    private ApiClient client;

    private static String clientId = System.getenv("TEST_CLIENT_ID");
    private static String clientSecret = System.getenv("TEST_CLIENT_SECRET");

    @Before
    public void setUp() {
        client = Configuration.getDefaultApiClient();
    }
 
    @Test
    public void testGetApplicationInfoShouldSucceedWithValidToken() throws ApiException {
        // Arrange
        OAuthApi apiInstance = new OAuthApi(client);
        String grantType = "client_credentials";

        // Act
        AccessTokenModel apiResponse = apiInstance.createToken(clientId, clientSecret, grantType);

        // Assert
        assertNotNull(apiResponse.getAccessToken());
    }

    @Test
    public void testGetApplicationInfoShouldFailWithInvalidToken() throws ApiException {
        // Arrange
        String invalidToken = "invalidToken";
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.*;

import com.criteo.api.marketingsolutions.preview.ApiClient;
import com.criteo.api.marketingsolutions.preview.ApiException;
import com.criteo.api.marketingsolutions.preview.Configuration;
import com.criteo.api.marketingsolutions.preview.api.GatewayApi;
import com.criteo.api.marketingsolutions.preview.ApiResponse;
import com.criteo.api.marketingsolutions.preview.model.ApplicationSummaryModelResponse;

public class GatewayApiTest {
    private ApiClient client;

    private static String clientId = System.getenv("TEST_CLIENT_ID");
    private static String clientSecret = System.getenv("TEST_CLIENT_SECRET");
    private static String applicationId = System.getenv("TEST_APPLICATION_ID");

    @Before
    public void setUp() {
        assertNotNull(clientId);
        assertNotNull(clientSecret);
        assertNotNull(applicationId);

        client = Configuration.getDefaultApiClient();
        client.setUsername(clientId);
        client.setPassword(clientSecret);
    }
 
    @Test
    public void testGetCurrentApplicationShouldSucceedWithValidToken() throws ApiException {
        // Arrange
        GatewayApi api = new GatewayApi(client);

        // Act
        ApiResponse<ApplicationSummaryModelResponse> httpResponse = api.getCurrentApplicationWithHttpInfo();

        // Assert
        assertEquals(200, httpResponse.getStatusCode());

        ApplicationSummaryModelResponse response = httpResponse.getData();
        assertEquals(applicationId, response.getData().getId());
    }

    @Test
    public void testGetCurrentApplicationShouldSucceedWithRenewedInvalidToken() throws ApiException {
        // Arrange
        String invalidToken = "invalid.access.token";
        client.setAccessToken(invalidToken);
        GatewayApi api = new GatewayApi(client);

        // Act
        ApiResponse<ApplicationSummaryModelResponse> httpResponse = api.getCurrentApplicationWithHttpInfo();

        // Assert
        assertEquals(200, httpResponse.getStatusCode());

        ApplicationSummaryModelResponse response = httpResponse.getData();
        assertEquals(applicationId, response.getData().getId());
    }

    @Test
    public void testGetCurrentApplicationShouldFailWithoutToken() throws ApiException {
        // Arrange
        GatewayApi api = new GatewayApi(new ApiClient());

        // Act & Assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            api.getCurrentApplication();
        });
        assertEquals("username or password is not present.", exception.getMessage());
    }
}
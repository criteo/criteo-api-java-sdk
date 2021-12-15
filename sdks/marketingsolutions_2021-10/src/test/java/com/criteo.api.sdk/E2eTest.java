import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.criteo.api.marketingsolutions.v2021_10.ApiClient;
import com.criteo.api.marketingsolutions.v2021_10.ApiException;
import com.criteo.api.marketingsolutions.v2021_10.Configuration;
import com.criteo.api.marketingsolutions.v2021_10.api.OAuthApi;
import com.criteo.api.marketingsolutions.v2021_10.ApiResponse;
import com.criteo.api.marketingsolutions.v2021_10.model.JwtModel;
import com.criteo.api.marketingsolutions.v2021_10.model.ApplicationSummaryModel;

public class E2eTest {
    private ApiClient client;

    private static String clientId = System.getenv("TEST_CLIENT_ID");
    private static String clientSecret = System.getenv("TEST_CLIENT_SECRET");
    private static String grantType = "client_credentials";

    @Before
    public void setUp() {
        assertNotNull(clientId);
        assertNotNull(clientSecret);
        client = Configuration.getDefaultApiClient();
    }

    @Test
    public void testPostTokenShouldSucceedWithValidCredentials() throws ApiException {
        // Arrange
        OAuthApi apiInstance = new OAuthApi(client);

        // Act
        JwtModel apiResponse = apiInstance.createToken(clientId, clientSecret, grantType);

        // Assert
        assertNotNull(apiResponse.getAccessToken());
    }

    @Test
    public void testPostTokenShouldFailWithInvalidCredentials() {
        // Arrange
        OAuthApi apiInstance = new OAuthApi(client);

        // Act & Assert
        assertThrows(ApiException.class, () -> {
            apiInstance.createToken("invalid_client_id", "invalid_client_secret", grantType);
        });
    }

    public void testGetApplicationInfoShouldSucceedWithValidToken() throws ApiException {
        // Arrange
        OAuthApi apiInstance = new OAuthApi(client);

        // Act
        JwtModel apiResponse = apiInstance.createToken(clientId, clientSecret, grantType);

        String accessToken = apiResponse.getAccessToken();

        // Assert
        assertNotNull(apiResponse.getAccessToken());

        // Act
        // ApplicationSummaryModelResponse getMeResponse = apiInstance.getCurrentApplication();

        // Assert
        // ApplicationSummaryModel applicationSummary = getMeResponse.getData().getAttributes();
        // assertNotNull(applicationSummary.getName());
        // assertNotNull(applicationSummary.getOrganizationId());
        // assertNotNull(applicationSummary.getDescription());
        // assertNotNull(applicationSummary.getCriteoService());
    }

    public void testGetApplicationInfoShouldFailWithInvalidToken() throws ApiException {
        // Arrange
        String invalidToken = "invalidToken";
        OAuthApi apiInstance = new OAuthApi(client);

        // Act & Assert
        assertThrows(ApiException.class, () -> {
            apiInstance.getCurrentApplication();
        });
    }
}


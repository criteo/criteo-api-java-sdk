import org.junit.jupiter.api.Test;
 
import com.criteo.api.marketingsolutions.v2020_10.ApiClient;
import com.criteo.api.marketingsolutions.v2020_10.ApiException;
import com.criteo.api.marketingsolutions.v2020_10.Configuration;
import com.criteo.api.marketingsolutions.v2020_10.api.AdvertiserApi;
import com.criteo.api.marketingsolutions.v2020_10.ApiResponse;
import com.criteo.api.marketingsolutions.v2020_10.model.GetPortfolioResponse;

import static org.junit.jupiter.api.Assertions.*;
 
public class E2eTest {
    private ApiClient client;
 
    @Test
    public void testShouldGetPortofolio() throws ApiException {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setUsername("44e3c39ad28848d5a9ddb72158683a4b");
        client.setPassword("fwAf1MdvQ1gRnBhC4oESTXJPoJ4PMtoeFB9GUbvQTC+h");

        AdvertiserApi apiInstance = new AdvertiserApi(client);
 
        ApiResponse<GetPortfolioResponse> apiResponse = apiInstance.apiPortfolioGetWithHttpInfo();
 
        int statusCode = apiResponse.getStatusCode();
        GetPortfolioResponse data = apiResponse.getData();
 
        assertEquals(200, statusCode);
        // This might need to be updated in case the portfolio is not empty
        assertEquals(0, data.getData().size());

    }
}

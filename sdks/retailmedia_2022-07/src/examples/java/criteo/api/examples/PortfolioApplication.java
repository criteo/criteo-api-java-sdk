package com.criteo.marketing.examples;

import com.criteo.api.retailmedia.v2022_07.ApiClient;
import com.criteo.api.retailmedia.v2022_07.ApiException;
import com.criteo.api.retailmedia.v2022_07.Configuration;
import com.criteo.api.retailmedia.v2022_07.api.AdvertiserApi;
import com.criteo.api.retailmedia.v2022_07.model.GetPortfolioResponse;


public class PortfolioApplication {
    public static void main(String[] args) {
        ApiClient client = Configuration.getDefaultApiClient();
        client.setUsername("client-id");
        client.setPassword("client-secret");

        // Uncomment the following line to enable debugging logs.
        // client.setDebugging(true);

        AdvertiserApi myApi = new AdvertiserApi(client);
        try {
            GetPortfolioResponse response = myApi.apiPortfolioGet();
        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getResponseBody());
        }
    }
}

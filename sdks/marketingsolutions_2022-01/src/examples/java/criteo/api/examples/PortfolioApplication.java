package com.criteo.marketing.examples;

import com.criteo.api.marketingsolutions.v2022_01.ApiClient;
import com.criteo.api.marketingsolutions.v2022_01.ApiException;
import com.criteo.api.marketingsolutions.v2022_01.Configuration;
import com.criteo.api.marketingsolutions.v2022_01.api.AdvertiserApi;
import com.criteo.api.marketingsolutions.v2022_01.model.GetPortfolioResponse;


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

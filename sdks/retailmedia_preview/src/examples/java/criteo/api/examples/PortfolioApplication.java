package com.criteo.marketing.examples;

import com.criteo.api.retailmedia.preview.ApiClient;
import com.criteo.api.retailmedia.preview.ApiClientBuilder;
import com.criteo.api.retailmedia.preview.ApiException;
import com.criteo.api.retailmedia.preview.Configuration;
import com.criteo.api.retailmedia.preview.api.AdvertiserApi;
import com.criteo.api.retailmedia.preview.model.GetPortfolioResponse;


public class PortfolioApplication {
    public static void main(String[] args) {
        
        String clientId = "client-id";
        String clientSecret = "client-secret";

        ApiClient client = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);

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

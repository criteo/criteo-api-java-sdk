package com.criteo.api.marketingsolutions.v2025_07;

import java.util.Map;
import java.util.HashMap;

public class ApiClientBuilder{
    public static ApiClient ForClientCredentials(String clientId, String clientSecret){
        Map<String, String> parametersMap = new HashMap<>();
        parametersMap.put("grant_type", "client_credentials");

        return new ApiClient(clientId, clientSecret, parametersMap);
    }
}
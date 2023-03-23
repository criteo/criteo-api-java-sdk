package com.criteo.marketing.examples;

import com.criteo.api.marketingsolutions.v2022_04.ApiClient;
import com.criteo.api.marketingsolutions.v2022_04.ApiClientBuilder;
import com.criteo.api.marketingsolutions.v2022_04.ApiException;
import com.criteo.api.marketingsolutions.v2022_04.ApiResponse;
import com.criteo.api.marketingsolutions.v2022_04.Configuration;
import com.criteo.api.marketingsolutions.v2022_04.api.AnalyticsApi;
import com.criteo.api.marketingsolutions.v2022_04.model.StatisticsReportQueryMessage;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class StatisticsApplication {
    public static void main(String[] args) {
        String clientId = "client-id";
        String clientSecret = "client-secret";

        ApiClient client = ApiClientBuilder.ForClientCredentials(clientId, clientSecret);

        // Uncomment the following line to enable debugging logs.
        // client.setDebugging(true);

        AnalyticsApi myApi = new AnalyticsApi(client);
        List<StatisticsReportQueryMessage.DimensionsEnum> dimensions = Arrays.asList(StatisticsReportQueryMessage.DimensionsEnum.ADSET);
        List<String> metrics = Arrays.asList("Clicks");
        OffsetDateTime startDate = OffsetDateTime.parse("2022-07-01T00:00:00+01:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        OffsetDateTime endDate = OffsetDateTime.parse("2022-07-31T00:00:00+01:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        StatisticsReportQueryMessage statisticsReportQueryMessage = new StatisticsReportQueryMessage();

        statisticsReportQueryMessage.dimensions(dimensions);
        statisticsReportQueryMessage.metrics(metrics);
        statisticsReportQueryMessage.startDate(startDate);
        statisticsReportQueryMessage.endDate(endDate);
        statisticsReportQueryMessage.currency("EUR");
        statisticsReportQueryMessage.format("Csv");
        try {
            ApiResponse<byte[]> response = myApi.getAdsetReportWithHttpInfo (statisticsReportQueryMessage);
        } catch (ApiException e) {
            System.out.println(e.getCode());
            System.out.println(e.getResponseBody());
        }
    }
}
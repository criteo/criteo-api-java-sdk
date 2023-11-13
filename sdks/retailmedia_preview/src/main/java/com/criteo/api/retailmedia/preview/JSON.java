/*
 * Criteo API
 * Criteo API - RetailMedia
 *
 * The version of the OpenAPI document: Preview
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.criteo.api.retailmedia.preview;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ApplicationSummaryModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ApplicationSummaryModelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ApplicationSummaryModelResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncCampaignsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncCampaignsReportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncCampaignsReportResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncLineItemsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncLineItemsReportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncLineItemsReportResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.AsyncReportResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Brand.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.BrandPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.BrandPreviewListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CampaignBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CampaignDailyBudgetOverride.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CampaignMonthlyBudgetOverride.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Category.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Category202204.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ChoiceOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ChoiceVariableSpecification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ChoiceVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ColorVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CommonError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CommonProblem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CommonStatusCodeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CommonWarning.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CpcRateCardPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CpcRateCardPreviewResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CreateUserBehaviorSegmentV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Creative202210.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Creative202210ListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Creative202210Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CreativeCreateModel202207.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CreativeUpdateModel202207.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.CustomerListDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.DailyLineItemBudgetOverride.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExportReportColumn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExportReportMetaData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalBrand.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalCatalogRequestPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalCatalogStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalProductButtonRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalProductButtonResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ExternalRetailer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.FilesVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.FilesVariablesSpecification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.GetPageOfAudiencesByAccountIdResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.HyperlinkVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.InputKeywords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithIdOfInt64AndAccountAndAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithIdOfInt64AndBrandAndBrand.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithIdOfInt64AndCatalogStatusAndCatalogStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithIdOfInt64AndLineItemBidMultipliersAndLineItemBidMultipliers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithIdOfInt64AndRetailerAndRetailer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiBodyWithoutIdOfCatalogRequestAndCatalogRequestPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiPageResponseOfAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiPageResponseOfBrand.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiPageResponseOfRetailer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiRequestOfCatalogRequestPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiSingleResponseOfCatalogStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.JsonApiSingleResponseOfLineItemBidMultipliers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Keywords.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.LineItemBidMultipliers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.LineItemBidMultipliersRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.LineItemBidMultipliersResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.LineItemBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.MonthlyLineItemBudegetOverride.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.PageMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.PageTypeEnvironment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.PlacementPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.PlacementPreviewListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ProductButtonListRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ProductButtonListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ProductButtonRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RecommendedKeywordsResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ReportDataResponseResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ReportOutcome.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ReportResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceCollectionOutcomeOfSkuSearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfBrandPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfCpcRateCardPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfCreative202210.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfLineItemBidMultipliers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfPlacementPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfProductButtonRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfProductButtonResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSellerPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuDataPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSearchRequestPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSearchRequestSlimPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSearchRequestSlimV2Preview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSlimDataPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfSkuSlimDataV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ResourceOfTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaAudience.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaAudienceAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaAudienceV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaAudienceV2Attributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaAudienceV2ListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1AddRemoveKeywordModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1AddRemoveKeywordsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1AddRemoveKeywordsModelRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1AddRemoveKeywordsModelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1InputKeywordsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1KeywordDataModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1KeywordsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1KeywordsModelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1KeywordsModelResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1ProblemDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1ProposalStatusModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1ProposalStatusModelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1ProposalStatusModelResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1ResourceOutcome.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1SetBidModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1SetBidsModel.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1SetBidsModelRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.RetailMediaExternalv1SetBidsModelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Section.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SellerPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SellerPreviewResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuDataPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuDataPreviewListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestPreviewRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestSlimPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestSlimPreviewRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestSlimV2Preview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchRequestSlimV2PreviewRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSlimDataPreview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSlimDataPreviewListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSlimDataV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SkuSlimDataV2ListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.StatusResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.StatusResponseResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncAttributedTransactionsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncAttributedTransactionsReportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncAttributedTransactionsReportResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncCampaignsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncCampaignsReportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncCampaignsReportResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncLineItemsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncLineItemsReportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.SyncLineItemsReportResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.Template.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TemplateListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TemplateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TemplateVariable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TemplateVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TextVariableSpecification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.TextVariableValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.UserBehaviorDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.UserBehaviorDetailsV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceInputOfCampaignBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceInputOfLineItemBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOfCampaignBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOfLineItemBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOfRecommendedKeywordsResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOutcomeOfCampaignBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOutcomeOfLineItemBudgetOverrides.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.criteo.api.retailmedia.preview.model.ValueResourceOutcomeOfRecommendedKeywordsResult.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}

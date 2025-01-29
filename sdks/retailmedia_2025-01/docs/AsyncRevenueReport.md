

# AsyncRevenueReport

Async Revenue report body request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ids** | **List&lt;String&gt;** | Supply account ids to report on |  [optional] |
|**id** | **String** | Supply account id to report on |  [optional] |
|**retailerIds** | **List&lt;String&gt;** | Retailer ids to filter |  [optional] |
|**accountIds** | **List&lt;String&gt;** | Account ids to filter |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | Campaign ids to filter |  [optional] |
|**lineItemIds** | **List&lt;String&gt;** | Line item ids to filter |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Type of report |  [optional] |
|**revenueType** | [**RevenueTypeEnum**](#RevenueTypeEnum) | Type of revenue |  [optional] |
|**soldBy** | [**SoldByEnum**](#SoldByEnum) | Filter on the seller: Indirect Sold, Direct Sold or Private Market |  [optional] |
|**buyType** | [**BuyTypeEnum**](#BuyTypeEnum) | Filter on buy type: Auction, Preferred Deals or Sponsorship |  [optional] |
|**advertiserTypes** | [**List&lt;AdvertiserTypesEnum&gt;**](#List&lt;AdvertiserTypesEnum&gt;) | Filter on the type of advertiser: retailer, brand, seller |  [optional] |
|**skuRelations** | [**List&lt;SkuRelationsEnum&gt;**](#List&lt;SkuRelationsEnum&gt;) | Filter on sku relations: Same SKU, Same Parent SKU, Same Category, Same Brand or Same Seller |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Format of the output |  [optional] |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Filter the type of campaigns to report on: sponsoredProducts or onSiteDisplays |  [optional] |
|**salesChannel** | [**SalesChannelEnum**](#SalesChannelEnum) | Filter on specific sales channel: offline or online |  [optional] |
|**clickAttributionWindow** | [**ClickAttributionWindowEnum**](#ClickAttributionWindowEnum) | Click attribution window |  [optional] |
|**viewAttributionWindow** | [**ViewAttributionWindowEnum**](#ViewAttributionWindowEnum) | View attribution window |  [optional] |
|**dimensions** | [**List&lt;DimensionsEnum&gt;**](#List&lt;DimensionsEnum&gt;) | List of dimensions to report on |  [optional] |
|**metrics** | [**List&lt;MetricsEnum&gt;**](#List&lt;MetricsEnum&gt;) | List of metrics to report on |  [optional] |
|**startDate** | **OffsetDateTime** | Start date |  |
|**endDate** | **OffsetDateTime** | End date |  |
|**timezone** | **String** | Time zone : see criteo developer portal for supported time zones |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| ADVERTISER | &quot;advertiser&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| PAGETYPE | &quot;pageType&quot; |
| PRODUCTCATEGORY | &quot;productCategory&quot; |
| BRAND | &quot;brand&quot; |



## Enum: RevenueTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERRED | &quot;preferred&quot; |



## Enum: SoldByEnum

| Name | Value |
|---- | -----|
| DIRECTSOLD | &quot;directSold&quot; |
| INDIRECTSOLD | &quot;indirectSold&quot; |
| PRIVATEMARKET | &quot;privateMarket&quot; |



## Enum: BuyTypeEnum

| Name | Value |
|---- | -----|
| AUCTION | &quot;auction&quot; |
| PREFERREDDEALS | &quot;preferredDeals&quot; |
| SPONSORSHIP | &quot;sponsorship&quot; |



## Enum: List&lt;AdvertiserTypesEnum&gt;

| Name | Value |
|---- | -----|
| RETAILER | &quot;retailer&quot; |
| BRAND | &quot;brand&quot; |
| SELLER | &quot;seller&quot; |



## Enum: List&lt;SkuRelationsEnum&gt;

| Name | Value |
|---- | -----|
| SAMESKU | &quot;sameSku&quot; |
| SAMEPARENTSKU | &quot;sameParentSku&quot; |
| SAMECATEGORY | &quot;sameCategory&quot; |
| SAMEBRAND | &quot;sameBrand&quot; |
| SAMESELLER | &quot;sameSeller&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| JSON | &quot;json&quot; |
| JSON_COMPACT | &quot;json-compact&quot; |
| JSON_NEWLINE | &quot;json-newline&quot; |
| CSV | &quot;csv&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| SPONSOREDPRODUCTS | &quot;sponsoredProducts&quot; |
| ONSITEDISPLAYS | &quot;onSiteDisplays&quot; |



## Enum: SalesChannelEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| OFFLINE | &quot;offline&quot; |
| ONLINE | &quot;online&quot; |



## Enum: ClickAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: ViewAttributionWindowEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| _1D | &quot;1D&quot; |
| _7D | &quot;7D&quot; |
| _14D | &quot;14D&quot; |
| _30D | &quot;30D&quot; |



## Enum: List&lt;DimensionsEnum&gt;

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| HOUR | &quot;hour&quot; |
| PARENTACCOUNT | &quot;parentAccount&quot; |
| ACCOUNTID | &quot;accountId&quot; |
| ACCOUNTNAME | &quot;accountName&quot; |
| ACCOUNTTYPENAME | &quot;accountTypeName&quot; |
| ADVERTISERTYPE | &quot;advertiserType&quot; |
| CAMPAIGNID | &quot;campaignId&quot; |
| CAMPAIGNNAME | &quot;campaignName&quot; |
| CAMPAIGNTYPENAME | &quot;campaignTypeName&quot; |
| CAMPAIGNSTARTDATE | &quot;campaignStartDate&quot; |
| CAMPAIGNENDDATE | &quot;campaignEndDate&quot; |
| LINEITEMID | &quot;lineItemId&quot; |
| LINEITEMNAME | &quot;lineItemName&quot; |
| LINEITEMSTARTDATE | &quot;lineItemStartDate&quot; |
| LINEITEMENDDATE | &quot;lineItemEndDate&quot; |
| LINEITEMSTATUS | &quot;lineItemStatus&quot; |
| RETAILERID | &quot;retailerId&quot; |
| RETAILERNAME | &quot;retailerName&quot; |
| BRANDID | &quot;brandId&quot; |
| BRANDNAME | &quot;brandName&quot; |
| PLACEMENTID | &quot;placementId&quot; |
| PLACEMENTNAME | &quot;placementName&quot; |
| PAGETYPENAME | &quot;pageTypeName&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| PAGECATEGORY | &quot;pageCategory&quot; |
| ADVPRODUCTID | &quot;advProductId&quot; |
| ADVPRODUCTNAME | &quot;advProductName&quot; |
| ADVPRODUCTGTIN | &quot;advProductGtin&quot; |
| ADVPRODUCTMPN | &quot;advProductMpn&quot; |
| BUYTYPE | &quot;buyType&quot; |
| SOLDBY | &quot;soldBy&quot; |
| SALECHANNEL | &quot;saleChannel&quot; |
| SALESCHANNEL | &quot;salesChannel&quot; |
| ATTRIBUTIONSETTINGS | &quot;attributionSettings&quot; |
| ACTIVITYTYPE | &quot;activityType&quot; |
| KEYWORD | &quot;keyword&quot; |
| SKURELATION | &quot;skuRelation&quot; |
| RETAILERCATEGORYID | &quot;retailerCategoryId&quot; |
| RETAILERCATEGORYNAME | &quot;retailerCategoryName&quot; |
| TAXONOMYBREADCRUMB | &quot;taxonomyBreadcrumb&quot; |
| TAXONOMY1ID | &quot;taxonomy1Id&quot; |
| TAXONOMY1NAME | &quot;taxonomy1Name&quot; |
| TAXONOMY2ID | &quot;taxonomy2Id&quot; |
| TAXONOMY2NAME | &quot;taxonomy2Name&quot; |
| TAXONOMY3ID | &quot;taxonomy3Id&quot; |
| TAXONOMY3NAME | &quot;taxonomy3Name&quot; |
| TAXONOMY4ID | &quot;taxonomy4Id&quot; |
| TAXONOMY4NAME | &quot;taxonomy4Name&quot; |
| TAXONOMY5ID | &quot;taxonomy5Id&quot; |
| TAXONOMY5NAME | &quot;taxonomy5Name&quot; |
| TAXONOMY6ID | &quot;taxonomy6Id&quot; |
| TAXONOMY6NAME | &quot;taxonomy6Name&quot; |
| TAXONOMY7ID | &quot;taxonomy7Id&quot; |
| TAXONOMY7NAME | &quot;taxonomy7Name&quot; |



## Enum: List&lt;MetricsEnum&gt;

| Name | Value |
|---- | -----|
| NUMBEROFCAMPAIGNS | &quot;numberOfCampaigns&quot; |
| NUMBEROFLINEITEMS | &quot;numberOfLineItems&quot; |
| NUMBEROFSKUS | &quot;numberOfSkus&quot; |
| SKUPRICE | &quot;skuPrice&quot; |
| PAGEVIEWS | &quot;pageViews&quot; |
| IMPRESSIONS | &quot;impressions&quot; |
| PRODUCTCLICKS | &quot;productClicks&quot; |
| PLACEMENTCLICKS | &quot;placementClicks&quot; |
| CLICKS | &quot;clicks&quot; |
| SALES | &quot;sales&quot; |
| UNITS | &quot;units&quot; |
| TRANSACTIONS | &quot;transactions&quot; |
| ASSISTEDSALES | &quot;assistedSales&quot; |
| ASSISTEDUNITS | &quot;assistedUnits&quot; |
| REVENUE | &quot;revenue&quot; |
| OPENAUCTIONREVENUE | &quot;openAuctionRevenue&quot; |
| PREFERREDDEALSREVENUE | &quot;preferredDealsRevenue&quot; |
| CTR | &quot;ctr&quot; |
| CR | &quot;cr&quot; |
| CPC | &quot;cpc&quot; |
| CPM | &quot;cpm&quot; |
| ROAS | &quot;roas&quot; |
| WORKINGMEDIA | &quot;workingMedia&quot; |
| NETREVENUE | &quot;netRevenue&quot; |
| VIDEOVIEWS | &quot;videoViews&quot; |
| VIDEOSSTARTED | &quot;videosStarted&quot; |
| VIDEOSPLAYEDTO25 | &quot;videosPlayedTo25&quot; |
| VIDEOSPLAYEDTO50 | &quot;videosPlayedTo50&quot; |
| VIDEOSPLAYEDTO75 | &quot;videosPlayedTo75&quot; |
| VIDEOSPLAYEDTO100 | &quot;videosPlayedTo100&quot; |
| VIDEOPLAYINGRATE | &quot;videoPlayingRate&quot; |
| VIDEOCOMPLETIONRATE | &quot;videoCompletionRate&quot; |
| VIDEOIMPRESSIONS | &quot;videoImpressions&quot; |
| VIDEOMUTED | &quot;videoMuted&quot; |
| VIDEOUNMUTED | &quot;videoUnmuted&quot; |
| VIDEORESUMED | &quot;videoResumed&quot; |
| VIDEOPAUSED | &quot;videoPaused&quot; |
| VIDEOAVGINTERACTIONRATE | &quot;videoAvgInteractionRate&quot; |
| VIDEOVIEWABILITY | &quot;videoViewability&quot; |
| VIDEOSTARTINGRATE | &quot;videoStartingRate&quot; |
| VIDEOCPC | &quot;videoCPC&quot; |
| VIDEOCPCV | &quot;videoCPCV&quot; |
| UNIQUEVISITORS | &quot;uniqueVisitors&quot; |
| FREQUENCY | &quot;frequency&quot; |




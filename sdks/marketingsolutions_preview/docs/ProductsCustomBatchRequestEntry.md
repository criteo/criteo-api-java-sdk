

# ProductsCustomBatchRequestEntry

A product event for a batch request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchId** | **Long** | An entry ID, unique within the batch request. |  [optional]
**merchantId** | **Integer** | The ID of the managing account. Criteo: the partnerId. | 
**method** | [**MethodEnum**](#MethodEnum) | The method of the batch entry. | 
**productId** | **String** | The Product ID to delete. Only defined if the method is delete. |  [optional]
**product** | [**Product**](Product.md) |  |  [optional]
**feedId** | **String** | Not used by Criteo. |  [optional]



## Enum: MethodEnum

Name | Value
---- | -----
DELETE | &quot;delete&quot;
INSERT | &quot;insert&quot;




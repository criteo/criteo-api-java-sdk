

# TargetingErrorModel

A machine-readable format for specifying errors in Targeting.API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | A machine-readable error code string. | 
**detail** | **String** | A human-readable detailed explanation specific to this occurrence of the problem. |  [optional]
**instance** | **String** | A machine-readable URI reference that identifies the specific occurrence of the problem. | 
**source** | **Object** | A machine-readable structure to reference to the exact location(s) causing the error(s). |  [optional]
**title** | **String** | A short, human-readable summary of the problem type. |  [optional]
**traceId** | **String** | The machine-readable correlation Id provided by the gateway. | 
**type** | **String** | A machine-readable code specifying error category. This information is used on client side to focus on certain type of error,  to either retry some processing or display only certain type of errors. | 




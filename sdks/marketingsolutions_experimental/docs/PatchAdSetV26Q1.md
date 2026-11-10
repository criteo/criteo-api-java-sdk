

# PatchAdSetV26Q1

Model for patching an ad set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionConfiguration** | [**PatchAdSetAttributionConfigurationV26Q1**](PatchAdSetAttributionConfigurationV26Q1.md) |  |  [optional] |
|**bidding** | [**PatchAdSetBiddingV26Q1**](PatchAdSetBiddingV26Q1.md) |  |  [optional] |
|**budget** | [**PatchAdSetBudgetV26Q1**](PatchAdSetBudgetV26Q1.md) |  |  [optional] |
|**name** | **String** | Name of the ad set. |  [optional] |
|**scheduledBudget** | [**PatchAdSetScheduledBudgetV26Q1**](PatchAdSetScheduledBudgetV26Q1.md) |  |  [optional] |
|**scheduling** | [**PatchAdSetSchedulingV26Q1**](PatchAdSetSchedulingV26Q1.md) |  |  [optional] |
|**serverToServerTrackings** | [**List&lt;ServerToServerTrackingV26Q1&gt;**](ServerToServerTrackingV26Q1.md) | MMP server-to-server tracking URLs. Only allowed for app retargeting ad sets. Replaces the existing URLs when provided, clears them when empty, and leaves them unchanged when omitted |  [optional] |
|**targeting** | [**AdSetTargetingV26Q1**](AdSetTargetingV26Q1.md) |  |  [optional] |




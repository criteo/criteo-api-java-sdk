

# RetailMediaExternalv1ProposalStatusModel

The proposal status includes the state of the proposal, the status of the booking and approval, as well as any comments explaining why it might have been rejected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negotiationState** | [**NegotiationStateEnum**](#NegotiationStateEnum) |  | 
**bookingStatus** | [**BookingStatusEnum**](#BookingStatusEnum) |  | 
**runnableStatus** | [**RunnableStatusEnum**](#RunnableStatusEnum) |  | 
**comment** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]



## Enum: NegotiationStateEnum

Name | Value
---- | -----
INVALID | &quot;Invalid&quot;
MODIFIED | &quot;Modified&quot;
SUBMITTED | &quot;Submitted&quot;
REVIEWED | &quot;Reviewed&quot;
APPROVED | &quot;Approved&quot;



## Enum: BookingStatusEnum

Name | Value
---- | -----
NOTSUBMITTED | &quot;NotSubmitted&quot;
SUBMITTED | &quot;Submitted&quot;
REJECTED | &quot;Rejected&quot;
APPROVED | &quot;Approved&quot;



## Enum: RunnableStatusEnum

Name | Value
---- | -----
NOTSUBMITTED | &quot;NotSubmitted&quot;
SUBMITTED | &quot;Submitted&quot;
REJECTED | &quot;Rejected&quot;
APPROVED | &quot;Approved&quot;




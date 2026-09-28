

# UpdateCoupon

Entity to edit a Coupon

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **String** | The date when we will stop showing this coupon, which must come after the start date. If the  end date is not specified (i.e. null) then the coupon will go on forever.  String must be in ISO8601 format, more precisely \&quot;yyyy-MM-ddTHH:mm:ss.fffZ\&quot;: a UTC timestamp whose  three millisecond digits and trailing \&quot;Z\&quot; are both required, for example \&quot;2026-10-01T09:00:00.000Z\&quot;.  No other ISO8601 layout is accepted, neither a UTC offset such as \&quot;2026-10-01T11:00:00+02:00\&quot; nor a  second-precision \&quot;2026-10-01T09:00:00Z\&quot;.  A date that does not fall on a whole hour is rounded up to the next one, so  \&quot;2026-10-01T09:30:00.000Z\&quot; is stored as \&quot;2026-10-01T10:00:00.000Z\&quot;. |  [optional] |
|**id** | **String** |  |  [optional] |
|**startDate** | **String** | The date when the coupon will be launched. It must be a date in the future, and it must not  move earlier than the start date the coupon already has.  String must be in ISO8601 format, more precisely \&quot;yyyy-MM-ddTHH:mm:ss.fffZ\&quot;: a UTC timestamp whose  three millisecond digits and trailing \&quot;Z\&quot; are both required, for example \&quot;2026-10-01T09:00:00.000Z\&quot;.  No other ISO8601 layout is accepted, neither a UTC offset such as \&quot;2026-10-01T11:00:00+02:00\&quot; nor a  second-precision \&quot;2026-10-01T09:00:00Z\&quot;.  A date that does not fall on a whole hour is rounded up to the next one, so  \&quot;2026-10-01T09:30:00.000Z\&quot; is stored as \&quot;2026-10-01T10:00:00.000Z\&quot;. |  |




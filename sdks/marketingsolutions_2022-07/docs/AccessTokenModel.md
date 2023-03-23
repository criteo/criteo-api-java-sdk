

# AccessTokenModel

Access Token to be used with other services

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The access token issued by the authorization server. |  [optional] |
|**tokenType** | **String** | The type of the token issued. |  [optional] |
|**refreshToken** | **String** | The refresh token issued by the authorization server. |  [optional] |
|**expiresIn** | **Integer** | The lifetime in seconds of the access token.For example, the value \&quot;3600\&quot; denotes that the access token will expire in one hour from the time the response was generated. If omitted, the authorization server SHOULD provide the expiration time via other means or document the default value. |  [optional] |




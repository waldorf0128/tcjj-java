# UserApi

All URIs are relative to *http://andrew.tcjj.net/Api/Main*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](UserApi.md#changePassword) | **POST** /changePassword | 修改密码
[**checkVarcode**](UserApi.md#checkVarcode) | **POST** /checkVarcode | 验证码校验
[**getPhoneVarcode**](UserApi.md#getPhoneVarcode) | **POST** /getPhoneVarcode | 获取验证码
[**login**](UserApi.md#login) | **POST** /login | 用户登录操作
[**register**](UserApi.md#register) | **POST** /register | 用户注册操作
[**retrievePassword**](UserApi.md#retrievePassword) | **POST** /retrievePassword | 重置密码


<a name="changePassword"></a>
# **changePassword**
> ServerResponse changePassword(changePassword)

修改密码

修改密码

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
ChangePasswordRequest changePassword = new ChangePasswordRequest(); // ChangePasswordRequest | 修改密码
try {
    ServerResponse result = apiInstance.changePassword(changePassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePassword** | [**ChangePasswordRequest**](ChangePasswordRequest.md)| 修改密码 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="checkVarcode"></a>
# **checkVarcode**
> ServerResponse checkVarcode(checkVarcode)

验证码校验

判断用户输入的验证码是否正确

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
CheckVarcodeRequest checkVarcode = new CheckVarcodeRequest(); // CheckVarcodeRequest | 判断用户输入的验证码是否正确
try {
    ServerResponse result = apiInstance.checkVarcode(checkVarcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#checkVarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkVarcode** | [**CheckVarcodeRequest**](CheckVarcodeRequest.md)| 判断用户输入的验证码是否正确 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getPhoneVarcode"></a>
# **getPhoneVarcode**
> ServerResponse getPhoneVarcode(getPhoneVarcode)

获取验证码

获取验证码

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
GetPhoneVarcodeRequest getPhoneVarcode = new GetPhoneVarcodeRequest(); // GetPhoneVarcodeRequest | 获取验证码
try {
    ServerResponse result = apiInstance.getPhoneVarcode(getPhoneVarcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getPhoneVarcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPhoneVarcode** | [**GetPhoneVarcodeRequest**](GetPhoneVarcodeRequest.md)| 获取验证码 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="login"></a>
# **login**
> ServerResponse login(login)

用户登录操作

登录

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
LoginRequest login = new LoginRequest(); // LoginRequest | 登录
try {
    ServerResponse result = apiInstance.login(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | [**LoginRequest**](LoginRequest.md)| 登录 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="register"></a>
# **register**
> ServerResponse register(register)

用户注册操作

注册

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
RegisterRequest register = new RegisterRequest(); // RegisterRequest | 注册
try {
    ServerResponse result = apiInstance.register(register);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **register** | [**RegisterRequest**](RegisterRequest.md)| 注册 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="retrievePassword"></a>
# **retrievePassword**
> ServerResponse retrievePassword(retrievePassword)

重置密码

忘记密码，进行重置

### Example
```java
// Import classes:
//import swagger.client.api.UserApi;

UserApi apiInstance = new UserApi();
RetrievePasswordRequest retrievePassword = new RetrievePasswordRequest(); // RetrievePasswordRequest | 重置密码
try {
    ServerResponse result = apiInstance.retrievePassword(retrievePassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#retrievePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retrievePassword** | [**RetrievePasswordRequest**](RetrievePasswordRequest.md)| 重置密码 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


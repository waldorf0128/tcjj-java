# BaseApi

All URIs are relative to *http://andrew.tcjj.net/Api/Main*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemCurrency**](BaseApi.md#getSystemCurrency) | **POST** /getSystemCurrency | 获取系统的金币名称


<a name="getSystemCurrency"></a>
# **getSystemCurrency**
> ServerResponse getSystemCurrency(getSystemCurrency)

获取系统的金币名称

APP获取系统货币名称

### Example
```java
// Import classes:
//import swagger.client.api.BaseApi;

BaseApi apiInstance = new BaseApi();
GetSystemCurrencyRequest getSystemCurrency = new GetSystemCurrencyRequest(); // GetSystemCurrencyRequest | APP获取系统货币名称
try {
    ServerResponse result = apiInstance.getSystemCurrency(getSystemCurrency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseApi#getSystemCurrency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getSystemCurrency** | [**GetSystemCurrencyRequest**](GetSystemCurrencyRequest.md)| APP获取系统货币名称 |

### Return type

[**ServerResponse**](ServerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


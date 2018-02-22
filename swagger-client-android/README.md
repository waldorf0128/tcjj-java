# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import swagger.client.api.BaseApi;

public class BaseApiExample {

    public static void main(String[] args) {
        BaseApi apiInstance = new BaseApi();
        GetSystemCurrencyRequest getSystemCurrency = new GetSystemCurrencyRequest(); // GetSystemCurrencyRequest | APP获取系统货币名称
        try {
            ServerResponse result = apiInstance.getSystemCurrency(getSystemCurrency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BaseApi#getSystemCurrency");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://andrew.tcjj.net/Api/Main*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BaseApi* | [**getSystemCurrency**](docs/BaseApi.md#getSystemCurrency) | **POST** /getSystemCurrency | 获取系统的金币名称
*UserApi* | [**changePassword**](docs/UserApi.md#changePassword) | **POST** /changePassword | 修改密码
*UserApi* | [**checkVarcode**](docs/UserApi.md#checkVarcode) | **POST** /checkVarcode | 验证码校验
*UserApi* | [**getPhoneVarcode**](docs/UserApi.md#getPhoneVarcode) | **POST** /getPhoneVarcode | 获取验证码
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /login | 用户登录操作
*UserApi* | [**register**](docs/UserApi.md#register) | **POST** /register | 用户注册操作
*UserApi* | [**retrievePassword**](docs/UserApi.md#retrievePassword) | **POST** /retrievePassword | 重置密码


## Documentation for Models

 - [ChangePasswordModel](docs/ChangePasswordModel.md)
 - [ChangePasswordRequest](docs/ChangePasswordRequest.md)
 - [CheckVarcodeModel](docs/CheckVarcodeModel.md)
 - [CheckVarcodeRequest](docs/CheckVarcodeRequest.md)
 - [GetPhoneVarcodeModel](docs/GetPhoneVarcodeModel.md)
 - [GetPhoneVarcodeRequest](docs/GetPhoneVarcodeRequest.md)
 - [GetSystemCurrencyModel](docs/GetSystemCurrencyModel.md)
 - [GetSystemCurrencyRequest](docs/GetSystemCurrencyRequest.md)
 - [LoginModel](docs/LoginModel.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [RegisterModel](docs/RegisterModel.md)
 - [RegisterRequest](docs/RegisterRequest.md)
 - [RetrievePasswordModel](docs/RetrievePasswordModel.md)
 - [RetrievePasswordRequest](docs/RetrievePasswordRequest.md)
 - [ServerResponse](docs/ServerResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://petstore.swagger.io/oauth/dialog
- **Scopes**: 
  - read:pets: read your pets
  - write:pets: modify pets in your account


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




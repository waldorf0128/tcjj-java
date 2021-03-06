/**
 * 同城家教 API
 * 同城家教 接口文档, V1.0
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ChangePasswordModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChangePasswordModel>>(){}.getType();
    }
    
    if ("ChangePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChangePasswordRequest>>(){}.getType();
    }
    
    if ("CheckVarcodeModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckVarcodeModel>>(){}.getType();
    }
    
    if ("CheckVarcodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CheckVarcodeRequest>>(){}.getType();
    }
    
    if ("GetPhoneVarcodeModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetPhoneVarcodeModel>>(){}.getType();
    }
    
    if ("GetPhoneVarcodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetPhoneVarcodeRequest>>(){}.getType();
    }
    
    if ("GetSystemCurrencyModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetSystemCurrencyModel>>(){}.getType();
    }
    
    if ("GetSystemCurrencyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<GetSystemCurrencyRequest>>(){}.getType();
    }
    
    if ("LoginModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginModel>>(){}.getType();
    }
    
    if ("LoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginRequest>>(){}.getType();
    }
    
    if ("RegisterModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<RegisterModel>>(){}.getType();
    }
    
    if ("RegisterRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<RegisterRequest>>(){}.getType();
    }
    
    if ("RetrievePasswordModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<RetrievePasswordModel>>(){}.getType();
    }
    
    if ("RetrievePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<RetrievePasswordRequest>>(){}.getType();
    }
    
    if ("ServerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ServerResponse>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ChangePasswordModel".equalsIgnoreCase(className)) {
      return new TypeToken<ChangePasswordModel>(){}.getType();
    }
    
    if ("ChangePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChangePasswordRequest>(){}.getType();
    }
    
    if ("CheckVarcodeModel".equalsIgnoreCase(className)) {
      return new TypeToken<CheckVarcodeModel>(){}.getType();
    }
    
    if ("CheckVarcodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CheckVarcodeRequest>(){}.getType();
    }
    
    if ("GetPhoneVarcodeModel".equalsIgnoreCase(className)) {
      return new TypeToken<GetPhoneVarcodeModel>(){}.getType();
    }
    
    if ("GetPhoneVarcodeRequest".equalsIgnoreCase(className)) {
      return new TypeToken<GetPhoneVarcodeRequest>(){}.getType();
    }
    
    if ("GetSystemCurrencyModel".equalsIgnoreCase(className)) {
      return new TypeToken<GetSystemCurrencyModel>(){}.getType();
    }
    
    if ("GetSystemCurrencyRequest".equalsIgnoreCase(className)) {
      return new TypeToken<GetSystemCurrencyRequest>(){}.getType();
    }
    
    if ("LoginModel".equalsIgnoreCase(className)) {
      return new TypeToken<LoginModel>(){}.getType();
    }
    
    if ("LoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<LoginRequest>(){}.getType();
    }
    
    if ("RegisterModel".equalsIgnoreCase(className)) {
      return new TypeToken<RegisterModel>(){}.getType();
    }
    
    if ("RegisterRequest".equalsIgnoreCase(className)) {
      return new TypeToken<RegisterRequest>(){}.getType();
    }
    
    if ("RetrievePasswordModel".equalsIgnoreCase(className)) {
      return new TypeToken<RetrievePasswordModel>(){}.getType();
    }
    
    if ("RetrievePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<RetrievePasswordRequest>(){}.getType();
    }
    
    if ("ServerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ServerResponse>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};

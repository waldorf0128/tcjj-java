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

package swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetSystemCurrencyModel {
  
  @SerializedName("consume")
  private String consume = null;
  @SerializedName("revenue")
  private String revenue = null;

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getConsume() {
    return consume;
  }
  public void setConsume(String consume) {
    this.consume = consume;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getRevenue() {
    return revenue;
  }
  public void setRevenue(String revenue) {
    this.revenue = revenue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSystemCurrencyModel getSystemCurrencyModel = (GetSystemCurrencyModel) o;
    return (this.consume == null ? getSystemCurrencyModel.consume == null : this.consume.equals(getSystemCurrencyModel.consume)) &&
        (this.revenue == null ? getSystemCurrencyModel.revenue == null : this.revenue.equals(getSystemCurrencyModel.revenue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.consume == null ? 0: this.consume.hashCode());
    result = 31 * result + (this.revenue == null ? 0: this.revenue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSystemCurrencyModel {\n");
    
    sb.append("  consume: ").append(consume).append("\n");
    sb.append("  revenue: ").append(revenue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
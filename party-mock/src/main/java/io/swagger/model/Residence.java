package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Residence
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class Residence   {
  @JsonProperty("uprn")
  private Integer uprn = null;

  /**
   * only if care home or hotel
   */
  public enum CategoryEnum {
    HOTEL("HOTEL"),
    
    CARE_HOME("CARE HOME");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("category")
  private CategoryEnum category = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("estabType")
  private String estabType = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("townName")
  private String townName = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("outputArea")
  private String outputArea = null;

  @JsonProperty("lsoaArea")
  private String lsoaArea = null;

  @JsonProperty("msoaArea")
  private String msoaArea = null;

  @JsonProperty("ladCode")
  private String ladCode = null;

  @JsonProperty("regionCode")
  private String regionCode = null;

  @JsonProperty("eastings")
  private Integer eastings = null;

  @JsonProperty("northings")
  private Integer northings = null;

  @JsonProperty("htc")
  private Integer htc = null;

  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  public Residence uprn(Integer uprn) {
    this.uprn = uprn;
    return this;
  }

   /**
   * Unique Property Reference Number.
   * @return uprn
  **/
  @ApiModelProperty(value = "Unique Property Reference Number.")
  public Integer getUprn() {
    return uprn;
  }

  public void setUprn(Integer uprn) {
    this.uprn = uprn;
  }

  public Residence category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * only if care home or hotel
   * @return category
  **/
  @ApiModelProperty(value = "only if care home or hotel")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Residence type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Address type CE, HH, I.
   * @return type
  **/
  @ApiModelProperty(value = "Address type CE, HH, I.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Residence estabType(String estabType) {
    this.estabType = estabType;
    return this;
  }

   /**
   * Communal Establishment type.
   * @return estabType
  **/
  @ApiModelProperty(value = "Communal Establishment type.")
  public String getEstabType() {
    return estabType;
  }

  public void setEstabType(String estabType) {
    this.estabType = estabType;
  }

  public Residence addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Address details.
   * @return addressLine1
  **/
  @ApiModelProperty(value = "Address details.")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Residence addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Address details.
   * @return addressLine2
  **/
  @ApiModelProperty(value = "Address details.")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Residence townName(String townName) {
    this.townName = townName;
    return this;
  }

   /**
   * Postal town name.
   * @return townName
  **/
  @ApiModelProperty(value = "Postal town name.")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public Residence postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Postal Code.
   * @return postcode
  **/
  @ApiModelProperty(value = "Postal Code.")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Residence outputArea(String outputArea) {
    this.outputArea = outputArea;
    return this;
  }

   /**
   * Geography Output Area code.
   * @return outputArea
  **/
  @ApiModelProperty(value = "Geography Output Area code.")
  public String getOutputArea() {
    return outputArea;
  }

  public void setOutputArea(String outputArea) {
    this.outputArea = outputArea;
  }

  public Residence lsoaArea(String lsoaArea) {
    this.lsoaArea = lsoaArea;
    return this;
  }

   /**
   * Lower Layer Super Output Area code.
   * @return lsoaArea
  **/
  @ApiModelProperty(value = "Lower Layer Super Output Area code.")
  public String getLsoaArea() {
    return lsoaArea;
  }

  public void setLsoaArea(String lsoaArea) {
    this.lsoaArea = lsoaArea;
  }

  public Residence msoaArea(String msoaArea) {
    this.msoaArea = msoaArea;
    return this;
  }

   /**
   * Middle layer Super Output Area code.
   * @return msoaArea
  **/
  @ApiModelProperty(value = "Middle layer Super Output Area code.")
  public String getMsoaArea() {
    return msoaArea;
  }

  public void setMsoaArea(String msoaArea) {
    this.msoaArea = msoaArea;
  }

  public Residence ladCode(String ladCode) {
    this.ladCode = ladCode;
    return this;
  }

   /**
   * GSS nine character LAD code.
   * @return ladCode
  **/
  @ApiModelProperty(value = "GSS nine character LAD code.")
  public String getLadCode() {
    return ladCode;
  }

  public void setLadCode(String ladCode) {
    this.ladCode = ladCode;
  }

  public Residence regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * GSS nine character Region geography code.
   * @return regionCode
  **/
  @ApiModelProperty(value = "GSS nine character Region geography code.")
  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public Residence eastings(Integer eastings) {
    this.eastings = eastings;
    return this;
  }

   /**
   * Easting or x-coordinate.
   * @return eastings
  **/
  @ApiModelProperty(value = "Easting or x-coordinate.")
  public Integer getEastings() {
    return eastings;
  }

  public void setEastings(Integer eastings) {
    this.eastings = eastings;
  }

  public Residence northings(Integer northings) {
    this.northings = northings;
    return this;
  }

   /**
   * Northing or y-coordinate.
   * @return northings
  **/
  @ApiModelProperty(value = "Northing or y-coordinate.")
  public Integer getNorthings() {
    return northings;
  }

  public void setNorthings(Integer northings) {
    this.northings = northings;
  }

  public Residence htc(Integer htc) {
    this.htc = htc;
    return this;
  }

   /**
   * Hard to count code.
   * @return htc
  **/
  @ApiModelProperty(value = "Hard to count code.")
  public Integer getHtc() {
    return htc;
  }

  public void setHtc(Integer htc) {
    this.htc = htc;
  }

  public Residence latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Position North or South of Equator.
   * @return latitude
  **/
  @ApiModelProperty(value = "Position North or South of Equator.")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public Residence longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Position East or West of Greenwich Meridian.
   * @return longitude
  **/
  @ApiModelProperty(value = "Position East or West of Greenwich Meridian.")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Residence residence = (Residence) o;
    return Objects.equals(this.uprn, residence.uprn) &&
        Objects.equals(this.category, residence.category) &&
        Objects.equals(this.type, residence.type) &&
        Objects.equals(this.estabType, residence.estabType) &&
        Objects.equals(this.addressLine1, residence.addressLine1) &&
        Objects.equals(this.addressLine2, residence.addressLine2) &&
        Objects.equals(this.townName, residence.townName) &&
        Objects.equals(this.postcode, residence.postcode) &&
        Objects.equals(this.outputArea, residence.outputArea) &&
        Objects.equals(this.lsoaArea, residence.lsoaArea) &&
        Objects.equals(this.msoaArea, residence.msoaArea) &&
        Objects.equals(this.ladCode, residence.ladCode) &&
        Objects.equals(this.regionCode, residence.regionCode) &&
        Objects.equals(this.eastings, residence.eastings) &&
        Objects.equals(this.northings, residence.northings) &&
        Objects.equals(this.htc, residence.htc) &&
        Objects.equals(this.latitude, residence.latitude) &&
        Objects.equals(this.longitude, residence.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uprn, category, type, estabType, addressLine1, addressLine2, townName, postcode, outputArea, lsoaArea, msoaArea, ladCode, regionCode, eastings, northings, htc, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Residence {\n");
    
    sb.append("    uprn: ").append(toIndentedString(uprn)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    estabType: ").append(toIndentedString(estabType)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    outputArea: ").append(toIndentedString(outputArea)).append("\n");
    sb.append("    lsoaArea: ").append(toIndentedString(lsoaArea)).append("\n");
    sb.append("    msoaArea: ").append(toIndentedString(msoaArea)).append("\n");
    sb.append("    ladCode: ").append(toIndentedString(ladCode)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    eastings: ").append(toIndentedString(eastings)).append("\n");
    sb.append("    northings: ").append(toIndentedString(northings)).append("\n");
    sb.append("    htc: ").append(toIndentedString(htc)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class Address   {
  @JsonProperty("saon")
  private String saon = null;

  @JsonProperty("paon")
  private String paon = null;

  @JsonProperty("street")
  private String street = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("town")
  private String town = null;

  @JsonProperty("postcode")
  private String postcode = null;

  public Address saon(String saon) {
    this.saon = saon;
    return this;
  }

   /**
   * The Secondary Addressable Object - this is usually something like a flat number or any other sub unit
   * @return saon
  **/
  @ApiModelProperty(example = "Office 2a", value = "The Secondary Addressable Object - this is usually something like a flat number or any other sub unit")
  public String getSaon() {
    return saon;
  }

  public void setSaon(String saon) {
    this.saon = saon;
  }

  public Address paon(String paon) {
    this.paon = paon;
    return this;
  }

   /**
   * The Primary Addressable Object - this is usually a house number or a building name
   * @return paon
  **/
  @ApiModelProperty(example = "Unit 5", value = "The Primary Addressable Object - this is usually a house number or a building name")
  public String getPaon() {
    return paon;
  }

  public void setPaon(String paon) {
    this.paon = paon;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

   /**
   * The street where the building office resides
   * @return street
  **/
  @ApiModelProperty(example = "Milton Street", value = "The street where the building office resides")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Sometimes, an address is associated with a locality, which identifies the address with a smaller geographical area than the Post Town (see town)
   * @return locality
  **/
  @ApiModelProperty(example = "Green Industrial Park", value = "Sometimes, an address is associated with a locality, which identifies the address with a smaller geographical area than the Post Town (see town)")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Address town(String town) {
    this.town = town;
    return this;
  }

   /**
   * This is the Post Town where the address is located. This usually corresponds to the sorting office that handles the mail for the address, as may take in many smaller towns, urban districts and villages (see locality).
   * @return town
  **/
  @ApiModelProperty(example = "New Town", value = "This is the Post Town where the address is located. This usually corresponds to the sorting office that handles the mail for the address, as may take in many smaller towns, urban districts and villages (see locality).")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * This is the Postcode for the address. Currently a postcode is needed for Sorting Office to begin parsing the address.
   * @return postcode
  **/
  @ApiModelProperty(example = "NT23 7TN", value = "This is the Postcode for the address. Currently a postcode is needed for Sorting Office to begin parsing the address.")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.saon, address.saon) &&
        Objects.equals(this.paon, address.paon) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.locality, address.locality) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.postcode, address.postcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saon, paon, street, locality, town, postcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    saon: ").append(toIndentedString(saon)).append("\n");
    sb.append("    paon: ").append(toIndentedString(paon)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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


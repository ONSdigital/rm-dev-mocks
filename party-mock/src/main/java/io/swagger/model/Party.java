package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Attributes;

/**
 * Party
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class Party   {
  @JsonProperty("sampleUnitType")
  private String sampleUnitType = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("attributes")
  private Attributes attributes = null;

  public Party sampleUnitType(String sampleUnitType) {
    this.sampleUnitType = sampleUnitType;
    return this;
  }

   /**
   * Sample Unit Type [ B | H ]
   * @return sampleUnitType
  **/
  @ApiModelProperty(example = "B", value = "Sample Unit Type [ B | H ]")
  public String getSampleUnitType() {
    return sampleUnitType;
  }

  public void setSampleUnitType(String sampleUnitType) {
    this.sampleUnitType = sampleUnitType;
  }

  public Party reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The reference of the sample unit ( <RUREF> | <URPN> )
   * @return reference
  **/
  @ApiModelProperty(example = "49900001234", value = "The reference of the sample unit ( <RUREF> | <URPN> )")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Party id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the Party. This will not be required when posting
   * @return id
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:business:00123456789", value = "The id of the Party. This will not be required when posting")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Party attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Party party = (Party) o;
    return Objects.equals(this.sampleUnitType, party.sampleUnitType) &&
        Objects.equals(this.reference, party.reference) &&
        Objects.equals(this.id, party.id) &&
        Objects.equals(this.attributes, party.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleUnitType, reference, id, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Party {\n");
    
    sb.append("    sampleUnitType: ").append(toIndentedString(sampleUnitType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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


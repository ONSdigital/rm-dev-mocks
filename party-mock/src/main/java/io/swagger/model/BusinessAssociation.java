package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Enrolment;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * BusinessAssociation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class BusinessAssociation   {
  @JsonProperty("effectiveFrom")
  private DateTime effectiveFrom = null;

  @JsonProperty("effectiveTo")
  private DateTime effectiveTo = null;

  @JsonProperty("businessId")
  private String businessId = null;

  @JsonProperty("respondentId")
  private String respondentId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    ENDED("ENDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("enrolments")
  private List<Enrolment> enrolments = new ArrayList<Enrolment>();

  public BusinessAssociation effectiveFrom(DateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @ApiModelProperty(example = "2010-11-17T00:00:00Z", value = "")
  public DateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(DateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public BusinessAssociation effectiveTo(DateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

   /**
   * Get effectiveTo
   * @return effectiveTo
  **/
  @ApiModelProperty(example = "", value = "")
  public DateTime getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(DateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public BusinessAssociation businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Get businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:business:001.234.56789", value = "")
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public BusinessAssociation respondentId(String respondentId) {
    this.respondentId = respondentId;
    return this;
  }

   /**
   * Get respondentId
   * @return respondentId
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:respondent:001.234.56789", value = "")
  public String getRespondentId() {
    return respondentId;
  }

  public void setRespondentId(String respondentId) {
    this.respondentId = respondentId;
  }

  public BusinessAssociation status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BusinessAssociation enrolments(List<Enrolment> enrolments) {
    this.enrolments = enrolments;
    return this;
  }

  public BusinessAssociation addEnrolmentsItem(Enrolment enrolmentsItem) {
    this.enrolments.add(enrolmentsItem);
    return this;
  }

   /**
   * Get enrolments
   * @return enrolments
  **/
  @ApiModelProperty(value = "")
  public List<Enrolment> getEnrolments() {
    return enrolments;
  }

  public void setEnrolments(List<Enrolment> enrolments) {
    this.enrolments = enrolments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAssociation businessAssociation = (BusinessAssociation) o;
    return Objects.equals(this.effectiveFrom, businessAssociation.effectiveFrom) &&
        Objects.equals(this.effectiveTo, businessAssociation.effectiveTo) &&
        Objects.equals(this.businessId, businessAssociation.businessId) &&
        Objects.equals(this.respondentId, businessAssociation.respondentId) &&
        Objects.equals(this.status, businessAssociation.status) &&
        Objects.equals(this.enrolments, businessAssociation.enrolments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveFrom, effectiveTo, businessId, respondentId, status, enrolments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAssociation {\n");
    
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    respondentId: ").append(toIndentedString(respondentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    enrolments: ").append(toIndentedString(enrolments)).append("\n");
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


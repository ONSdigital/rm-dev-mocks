package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * EnrolmentInvitation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class EnrolmentInvitation   {
  @JsonProperty("targetEmail")
  private String targetEmail = null;

  @JsonProperty("effectiveFrom")
  private DateTime effectiveFrom = null;

  @JsonProperty("effectiveTo")
  private DateTime effectiveTo = null;

  public EnrolmentInvitation targetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
    return this;
  }

   /**
   * Get targetEmail
   * @return targetEmail
  **/
  @ApiModelProperty(example = "jane.doe@abc-ltd.com", value = "")
  public String getTargetEmail() {
    return targetEmail;
  }

  public void setTargetEmail(String targetEmail) {
    this.targetEmail = targetEmail;
  }

  public EnrolmentInvitation effectiveFrom(DateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @ApiModelProperty(example = "2017-03-29T09:15:00Z", value = "")
  public DateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(DateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public EnrolmentInvitation effectiveTo(DateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

   /**
   * Get effectiveTo
   * @return effectiveTo
  **/
  @ApiModelProperty(example = "2017-03-31T09:15:00Z", value = "")
  public DateTime getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(DateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrolmentInvitation enrolmentInvitation = (EnrolmentInvitation) o;
    return Objects.equals(this.targetEmail, enrolmentInvitation.targetEmail) &&
        Objects.equals(this.effectiveFrom, enrolmentInvitation.effectiveFrom) &&
        Objects.equals(this.effectiveTo, enrolmentInvitation.effectiveTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetEmail, effectiveFrom, effectiveTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrolmentInvitation {\n");
    
    sb.append("    targetEmail: ").append(toIndentedString(targetEmail)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
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


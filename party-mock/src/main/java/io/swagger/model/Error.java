package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class Error   {
  @JsonProperty("logref")
  private String logref = null;

  @JsonProperty("message")
  private String message = null;

  public Error logref(String logref) {
    this.logref = logref;
    return this;
  }

   /**
   * A unique identifier generated per error
   * @return logref
  **/
  @ApiModelProperty(example = "31317c23-763d-46a9-b4e5-c37ff5b4fbe7", value = "A unique identifier generated per error")
  public String getLogref() {
    return logref;
  }

  public void setLogref(String logref) {
    this.logref = logref;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Description of the error that occurred
   * @return message
  **/
  @ApiModelProperty(example = "An error has occurred", value = "Description of the error that occurred")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.logref, error.logref) &&
        Objects.equals(this.message, error.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logref, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    logref: ").append(toIndentedString(logref)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


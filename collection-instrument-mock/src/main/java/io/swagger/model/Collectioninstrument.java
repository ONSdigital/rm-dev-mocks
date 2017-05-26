package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Classifiers;
import java.util.ArrayList;
import java.util.List;

/**
 * Collectioninstrument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

public class Collectioninstrument   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("surveyId")
  private String surveyId = null;

  @JsonProperty("ciType")
  private List<String> ciType = new ArrayList<String>();

  @JsonProperty("classifiers")
  private Classifiers classifiers = null;

  public Collectioninstrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:ci:001.234.56789", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Collectioninstrument surveyId(String surveyId) {
    this.surveyId = surveyId;
    return this;
  }

   /**
   * Get surveyId
   * @return surveyId
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:survey:001.234.56789", required = true, value = "")
  public String getSurveyId() {
    return surveyId;
  }

  public void setSurveyId(String surveyId) {
    this.surveyId = surveyId;
  }

  public Collectioninstrument ciType(List<String> ciType) {
    this.ciType = ciType;
    return this;
  }

  public Collectioninstrument addCiTypeItem(String ciTypeItem) {
    this.ciType.add(ciTypeItem);
    return this;
  }

   /**
   * Get ciType
   * @return ciType
  **/
  @ApiModelProperty(example = "&quot;OFFLINE&quot;", required = true, value = "")
  public List<String> getCiType() {
    return ciType;
  }

  public void setCiType(List<String> ciType) {
    this.ciType = ciType;
  }

  public Collectioninstrument classifiers(Classifiers classifiers) {
    this.classifiers = classifiers;
    return this;
  }

   /**
   * Get classifiers
   * @return classifiers
  **/
  @ApiModelProperty(value = "")
  public Classifiers getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(Classifiers classifiers) {
    this.classifiers = classifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collectioninstrument collectioninstrument = (Collectioninstrument) o;
    return Objects.equals(this.id, collectioninstrument.id) &&
        Objects.equals(this.surveyId, collectioninstrument.surveyId) &&
        Objects.equals(this.ciType, collectioninstrument.ciType) &&
        Objects.equals(this.classifiers, collectioninstrument.classifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surveyId, ciType, classifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collectioninstrument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    ciType: ").append(toIndentedString(ciType)).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Classifiers
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

public class Classifiers   {
  @JsonProperty("classifierType")
  private List<String> classifierType = new ArrayList<String>();

  @JsonProperty("classifier")
  private String classifier = null;

  public Classifiers classifierType(List<String> classifierType) {
    this.classifierType = classifierType;
    return this;
  }

  public Classifiers addClassifierTypeItem(String classifierTypeItem) {
    this.classifierType.add(classifierTypeItem);
    return this;
  }

   /**
   * Get classifierType
   * @return classifierType
  **/
  @ApiModelProperty(example = "&quot;RU_REF&quot;", required = true, value = "")
  public List<String> getClassifierType() {
    return classifierType;
  }

  public void setClassifierType(List<String> classifierType) {
    this.classifierType = classifierType;
  }

  public Classifiers classifier(String classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Get classifier
   * @return classifier
  **/
  @ApiModelProperty(example = "1731", required = true, value = "")
  public String getClassifier() {
    return classifier;
  }

  public void setClassifier(String classifier) {
    this.classifier = classifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classifiers classifiers = (Classifiers) o;
    return Objects.equals(this.classifierType, classifiers.classifierType) &&
        Objects.equals(this.classifier, classifiers.classifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierType, classifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classifiers {\n");
    
    sb.append("    classifierType: ").append(toIndentedString(classifierType)).append("\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
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


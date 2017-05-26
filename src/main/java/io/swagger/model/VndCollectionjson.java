package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VndCollectionjsonLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * VndCollectionjson
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

public class VndCollectionjson   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("links")
  private List<VndCollectionjsonLinks> links = new ArrayList<VndCollectionjsonLinks>();

  public VndCollectionjson version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public VndCollectionjson href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "/collectioninstrument/id/12345678", value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public VndCollectionjson links(List<VndCollectionjsonLinks> links) {
    this.links = links;
    return this;
  }

  public VndCollectionjson addLinksItem(VndCollectionjsonLinks linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<VndCollectionjsonLinks> getLinks() {
    return links;
  }

  public void setLinks(List<VndCollectionjsonLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VndCollectionjson vndCollectionjson = (VndCollectionjson) o;
    return Objects.equals(this.version, vndCollectionjson.version) &&
        Objects.equals(this.href, vndCollectionjson.href) &&
        Objects.equals(this.links, vndCollectionjson.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, href, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VndCollectionjson {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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


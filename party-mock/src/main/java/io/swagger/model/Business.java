package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;

/**
 * Business
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

public class Business   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("contactName")
  private String contactName = null;

  @JsonProperty("employeeCount")
  private Integer employeeCount = null;

  @JsonProperty("enterpriseName")
  private String enterpriseName = null;

  @JsonProperty("facsimile")
  private String facsimile = null;

  @JsonProperty("fulltimeCount")
  private Integer fulltimeCount = null;

  /**
   * Gets or Sets legalStatus
   */
  public enum LegalStatusEnum {
    COMMUNITY_INTEREST_COMPANY_CIC_("Community Interest Company (CIC)"),
    
    CHARITABLE_INCORPORATED_ORGANISATION_CIO_("Charitable Incorporated Organisation (CIO)"),
    
    INDUSTRIAL_AND_PROVIDENT_SOCIETY("Industrial and provident society"),
    
    GENERAL_PARTNERSHIP("General partnership"),
    
    LIMITED_LIABILITY_PARTNERSHIP_LLP_("Limited liability partnership (LLP)"),
    
    LIMITED_PARTNERSHIP_LP_("Limited partnership (LP)"),
    
    PRIVATE_LIMITED_COMPANY("Private Limited Company"),
    
    PUBLIC_LIMITED_COMPANY("Public Limited Company"),
    
    UNLIMITED_COMPANY("Unlimited Company"),
    
    SOLE_PROPRIETORSHIP("Sole proprietorship");

    private String value;

    LegalStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LegalStatusEnum fromValue(String text) {
      for (LegalStatusEnum b : LegalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("legalStatus")
  private LegalStatusEnum legalStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("businessRef")
  private String businessRef = null;

  @JsonProperty("sic2003")
  private String sic2003 = null;

  @JsonProperty("sic2007")
  private String sic2007 = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("tradingName")
  private String tradingName = null;

  @JsonProperty("turnover")
  private Integer turnover = null;

  public Business id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "urn:ons.gov.uk:id:business:001.234.56789", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Business address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Business contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @ApiModelProperty(example = "John Doe", value = "")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Business employeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }

   /**
   * Get employeeCount
   * @return employeeCount
  **/
  @ApiModelProperty(example = "50", value = "")
  public Integer getEmployeeCount() {
    return employeeCount;
  }

  public void setEmployeeCount(Integer employeeCount) {
    this.employeeCount = employeeCount;
  }

  public Business enterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
    return this;
  }

   /**
   * Get enterpriseName
   * @return enterpriseName
  **/
  @ApiModelProperty(example = "ABC Limited", value = "")
  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public Business facsimile(String facsimile) {
    this.facsimile = facsimile;
    return this;
  }

   /**
   * Get facsimile
   * @return facsimile
  **/
  @ApiModelProperty(example = "+44 1234 567890", value = "")
  public String getFacsimile() {
    return facsimile;
  }

  public void setFacsimile(String facsimile) {
    this.facsimile = facsimile;
  }

  public Business fulltimeCount(Integer fulltimeCount) {
    this.fulltimeCount = fulltimeCount;
    return this;
  }

   /**
   * Get fulltimeCount
   * @return fulltimeCount
  **/
  @ApiModelProperty(example = "35", value = "")
  public Integer getFulltimeCount() {
    return fulltimeCount;
  }

  public void setFulltimeCount(Integer fulltimeCount) {
    this.fulltimeCount = fulltimeCount;
  }

  public Business legalStatus(LegalStatusEnum legalStatus) {
    this.legalStatus = legalStatus;
    return this;
  }

   /**
   * Get legalStatus
   * @return legalStatus
  **/
  @ApiModelProperty(example = "Private Limited Company", value = "")
  public LegalStatusEnum getLegalStatus() {
    return legalStatus;
  }

  public void setLegalStatus(LegalStatusEnum legalStatus) {
    this.legalStatus = legalStatus;
  }

  public Business name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "ABC Limited", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Business businessRef(String businessRef) {
    this.businessRef = businessRef;
    return this;
  }

   /**
   * The unique business identifier recognised within ONS (previously referred to as the RU Ref).
   * @return businessRef
  **/
  @ApiModelProperty(example = "0123456789", value = "The unique business identifier recognised within ONS (previously referred to as the RU Ref).")
  public String getBusinessRef() {
    return businessRef;
  }

  public void setBusinessRef(String businessRef) {
    this.businessRef = businessRef;
  }

  public Business sic2003(String sic2003) {
    this.sic2003 = sic2003;
    return this;
  }

   /**
   * Get sic2003
   * @return sic2003
  **/
  @ApiModelProperty(example = "2520", value = "")
  public String getSic2003() {
    return sic2003;
  }

  public void setSic2003(String sic2003) {
    this.sic2003 = sic2003;
  }

  public Business sic2007(String sic2007) {
    this.sic2007 = sic2007;
    return this;
  }

   /**
   * Get sic2007
   * @return sic2007
  **/
  @ApiModelProperty(example = "2520", value = "")
  public String getSic2007() {
    return sic2007;
  }

  public void setSic2007(String sic2007) {
    this.sic2007 = sic2007;
  }

  public Business telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(example = "+44 1234 567890", value = "")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Business tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

   /**
   * Get tradingName
   * @return tradingName
  **/
  @ApiModelProperty(example = "ABC Trading Ltd", value = "")
  public String getTradingName() {
    return tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  public Business turnover(Integer turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Get turnover
   * @return turnover
  **/
  @ApiModelProperty(example = "350", value = "")
  public Integer getTurnover() {
    return turnover;
  }

  public void setTurnover(Integer turnover) {
    this.turnover = turnover;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Business business = (Business) o;
    return Objects.equals(this.id, business.id) &&
        Objects.equals(this.address, business.address) &&
        Objects.equals(this.contactName, business.contactName) &&
        Objects.equals(this.employeeCount, business.employeeCount) &&
        Objects.equals(this.enterpriseName, business.enterpriseName) &&
        Objects.equals(this.facsimile, business.facsimile) &&
        Objects.equals(this.fulltimeCount, business.fulltimeCount) &&
        Objects.equals(this.legalStatus, business.legalStatus) &&
        Objects.equals(this.name, business.name) &&
        Objects.equals(this.businessRef, business.businessRef) &&
        Objects.equals(this.sic2003, business.sic2003) &&
        Objects.equals(this.sic2007, business.sic2007) &&
        Objects.equals(this.telephone, business.telephone) &&
        Objects.equals(this.tradingName, business.tradingName) &&
        Objects.equals(this.turnover, business.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, contactName, employeeCount, enterpriseName, facsimile, fulltimeCount, legalStatus, name, businessRef, sic2003, sic2007, telephone, tradingName, turnover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
    sb.append("    facsimile: ").append(toIndentedString(facsimile)).append("\n");
    sb.append("    fulltimeCount: ").append(toIndentedString(fulltimeCount)).append("\n");
    sb.append("    legalStatus: ").append(toIndentedString(legalStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    businessRef: ").append(toIndentedString(businessRef)).append("\n");
    sb.append("    sic2003: ").append(toIndentedString(sic2003)).append("\n");
    sb.append("    sic2007: ").append(toIndentedString(sic2007)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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


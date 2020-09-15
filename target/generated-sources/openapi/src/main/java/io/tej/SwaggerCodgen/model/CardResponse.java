package io.tej.SwaggerCodgen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.tej.SwaggerCodgen.model.CardRequest;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-15T13:16:14.244362400+05:30[Asia/Calcutta]")

public class CardResponse   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("urlid")
  private Integer urlid;

  @JsonProperty("groupid")
  private Integer groupid;

  @JsonProperty("grouptitle")
  private String grouptitle;

  @JsonProperty("groupdescription")
  private String groupdescription;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("icon")
  private String icon;

  @JsonProperty("shorturl")
  private String shorturl;

  @JsonProperty("longurl")
  private String longurl;

  public CardResponse id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardResponse urlid(Integer urlid) {
    this.urlid = urlid;
    return this;
  }

  /**
   * Get urlid
   * @return urlid
  */
  @ApiModelProperty(value = "")


  public Integer getUrlid() {
    return urlid;
  }

  public void setUrlid(Integer urlid) {
    this.urlid = urlid;
  }

  public CardResponse groupid(Integer groupid) {
    this.groupid = groupid;
    return this;
  }

  /**
   * Get groupid
   * @return groupid
  */
  @ApiModelProperty(value = "")


  public Integer getGroupid() {
    return groupid;
  }

  public void setGroupid(Integer groupid) {
    this.groupid = groupid;
  }

  public CardResponse grouptitle(String grouptitle) {
    this.grouptitle = grouptitle;
    return this;
  }

  /**
   * Get grouptitle
   * @return grouptitle
  */
  @ApiModelProperty(value = "")


  public String getGrouptitle() {
    return grouptitle;
  }

  public void setGrouptitle(String grouptitle) {
    this.grouptitle = grouptitle;
  }

  public CardResponse groupdescription(String groupdescription) {
    this.groupdescription = groupdescription;
    return this;
  }

  /**
   * Get groupdescription
   * @return groupdescription
  */
  @ApiModelProperty(value = "")


  public String getGroupdescription() {
    return groupdescription;
  }

  public void setGroupdescription(String groupdescription) {
    this.groupdescription = groupdescription;
  }

  public CardResponse title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CardResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CardResponse icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  */
  @ApiModelProperty(value = "")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public CardResponse shorturl(String shorturl) {
    this.shorturl = shorturl;
    return this;
  }

  /**
   * Get shorturl
   * @return shorturl
  */
  @ApiModelProperty(value = "")


  public String getShorturl() {
    return shorturl;
  }

  public void setShorturl(String shorturl) {
    this.shorturl = shorturl;
  }

  public CardResponse longurl(String longurl) {
    this.longurl = longurl;
    return this;
  }

  /**
   * Get longurl
   * @return longurl
  */
  @ApiModelProperty(value = "")


  public String getLongurl() {
    return longurl;
  }

  public void setLongurl(String longurl) {
    this.longurl = longurl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardResponse cardResponse = (CardResponse) o;
    return Objects.equals(this.id, cardResponse.id) &&
        Objects.equals(this.urlid, cardResponse.urlid) &&
        Objects.equals(this.groupid, cardResponse.groupid) &&
        Objects.equals(this.grouptitle, cardResponse.grouptitle) &&
        Objects.equals(this.groupdescription, cardResponse.groupdescription) &&
        Objects.equals(this.title, cardResponse.title) &&
        Objects.equals(this.description, cardResponse.description) &&
        Objects.equals(this.icon, cardResponse.icon) &&
        Objects.equals(this.shorturl, cardResponse.shorturl) &&
        Objects.equals(this.longurl, cardResponse.longurl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, urlid, groupid, grouptitle, groupdescription, title, description, icon, shorturl, longurl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urlid: ").append(toIndentedString(urlid)).append("\n");
    sb.append("    groupid: ").append(toIndentedString(groupid)).append("\n");
    sb.append("    grouptitle: ").append(toIndentedString(grouptitle)).append("\n");
    sb.append("    groupdescription: ").append(toIndentedString(groupdescription)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    shorturl: ").append(toIndentedString(shorturl)).append("\n");
    sb.append("    longurl: ").append(toIndentedString(longurl)).append("\n");
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


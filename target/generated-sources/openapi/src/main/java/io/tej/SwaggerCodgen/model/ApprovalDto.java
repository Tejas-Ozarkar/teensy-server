package io.tej.SwaggerCodgen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.tej.SwaggerCodgen.model.CardDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApprovalDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-18T09:30:42.801557+05:30[Asia/Calcutta]")

public class ApprovalDto extends CardDto  {
  @JsonProperty("groupId")
  private Integer groupId = null;

  @JsonProperty("cardId")
  private Integer cardId = null;

  @JsonProperty("longurl")
  private String longurl;

  public ApprovalDto groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  @ApiModelProperty(value = "")


  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public ApprovalDto cardId(Integer cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
  */
  @ApiModelProperty(value = "")


  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public ApprovalDto longurl(String longurl) {
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
    ApprovalDto approvalDto = (ApprovalDto) o;
    return Objects.equals(this.groupId, approvalDto.groupId) &&
        Objects.equals(this.cardId, approvalDto.cardId) &&
        Objects.equals(this.longurl, approvalDto.longurl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, cardId, longurl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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


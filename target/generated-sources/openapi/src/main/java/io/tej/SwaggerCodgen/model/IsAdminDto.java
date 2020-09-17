package io.tej.SwaggerCodgen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IsAdminDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-17T22:31:46.515415700+05:30[Asia/Calcutta]")

public class IsAdminDto   {
  @JsonProperty("isadmin")
  private Boolean isadmin;

  public IsAdminDto isadmin(Boolean isadmin) {
    this.isadmin = isadmin;
    return this;
  }

  /**
   * Get isadmin
   * @return isadmin
  */
  @ApiModelProperty(value = "")


  public Boolean getIsadmin() {
    return isadmin;
  }

  public void setIsadmin(Boolean isadmin) {
    this.isadmin = isadmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsAdminDto isAdminDto = (IsAdminDto) o;
    return Objects.equals(this.isadmin, isAdminDto.isadmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isadmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsAdminDto {\n");
    
    sb.append("    isadmin: ").append(toIndentedString(isadmin)).append("\n");
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


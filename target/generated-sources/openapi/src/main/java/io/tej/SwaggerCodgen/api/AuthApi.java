/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.tej.SwaggerCodgen.api;

import io.tej.SwaggerCodgen.model.AuthRequest;
import io.tej.SwaggerCodgen.model.AuthResponse;
import io.tej.SwaggerCodgen.model.GenericResponse;
import io.tej.SwaggerCodgen.model.UserDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-18T09:30:42.801557+05:30[Asia/Calcutta]")

@Validated
@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /auth/user : Get User Info
     *
     * @return Return User Info (status code 200)
     *         or Unauthorized User (status code 401)
     */
    @ApiOperation(value = "Get User Info", nickname = "getUserInfo", notes = "", response = UserDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Return User Info", response = UserDto.class),
        @ApiResponse(code = 401, message = "Unauthorized User") })
    @RequestMapping(value = "/auth/user",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UserDto> _getUserInfo() {
        return getUserInfo();
    }

    // Override this method
    default  ResponseEntity<UserDto> getUserInfo() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstname\" : \"firstname\", \"password\" : \"password\", \"email\" : \"email\", \"lastname\" : \"lastname\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/signin : null
     *
     * @param authRequest Logging in user (required)
     * @return User Created (status code 200)
     */
    @ApiOperation(value = "null", nickname = "signin", notes = "", response = AuthResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User Created", response = AuthResponse.class) })
    @RequestMapping(value = "/auth/signin",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AuthResponse> _signin(@ApiParam(value = "Logging in user" ,required=true )  @Valid @RequestBody AuthRequest authRequest) {
        return signin(authRequest);
    }

    // Override this method
    default  ResponseEntity<AuthResponse> signin(AuthRequest authRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstname\" : \"firstname\", \"jwt\" : \"jwt\", \"email\" : \"email\", \"username\" : \"username\", \"lastname\" : \"lastname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/signup : null
     *
     * @param userDto Create new user (required)
     * @return User Created (status code 200)
     */
    @ApiOperation(value = "null", nickname = "signup", notes = "", response = GenericResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User Created", response = GenericResponse.class) })
    @RequestMapping(value = "/auth/signup",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<GenericResponse> _signup(@ApiParam(value = "Create new user" ,required=true )  @Valid @RequestBody UserDto userDto) {
        return signup(userDto);
    }

    // Override this method
    default  ResponseEntity<GenericResponse> signup(UserDto userDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

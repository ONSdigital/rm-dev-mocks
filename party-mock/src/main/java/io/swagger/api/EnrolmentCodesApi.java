package io.swagger.api;

import io.swagger.model.EnrolmentCode;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

@Api(value = "enrolment-codes", description = "the enrolment-codes API")
public interface EnrolmentCodesApi {

    @ApiOperation(value = "searches enrolment codes", notes = "By passing in the appropriate options, you can search for available Enrolment Codes ", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Void.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    @RequestMapping(value = "/enrolment-codes",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> enrolmentCodesGet(@ApiParam(value = "pass an optional search string for looking up Enrolment Codes") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "redeems an Enrolment Code", notes = "Redeems an Enrolment Code", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "frontstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 422, message = "enrolment code already exists", response = Void.class) })
    @RequestMapping(value = "/enrolment-codes",
        consumes = { "application/vnd.ons.enrolment-code+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> enrolmentCodesPost(@ApiParam(value = "Enrolment Code to redeem"  ) @RequestBody EnrolmentCode party);

}

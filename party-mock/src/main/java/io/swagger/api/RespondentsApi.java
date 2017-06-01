package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Respondent;
import io.swagger.model.VndCollectionjson;

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

@Api(value = "respondents", description = "the respondents API")
public interface RespondentsApi {

    @ApiOperation(value = "Get a Respondent by its Party ID", notes = "Returns a single Party", response = Respondent.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Respondent representation", response = Respondent.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Respondent.class),
        @ApiResponse(code = 404, message = "Party not found", response = Respondent.class) })
    @RequestMapping(value = "/respondents/id/{id}",
        produces = { "application/vnd.ons.respondent+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Respondent> getRespondentById(@ApiParam(value = "ID of Respondent to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "searches Respondents", notes = "By passing in the appropriate options, you can search for available Respondentes ", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Void.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    @RequestMapping(value = "/respondents",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> respondentsGet(@ApiParam(value = "pass an optional search string for looking up Respondents") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Returns the known business associations for a respondent", notes = "Returns the known business associations for a respondent", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Paginated list of known business associations for a respondent", response = Void.class),
        @ApiResponse(code = 404, message = "Respondent not found", response = Void.class) })
    @RequestMapping(value = "/respondents/id/{id}/business-associations",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> respondentsIdIdBusinessAssociationsGet(@ApiParam(value = "ID of Respondent",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "View the available representations for a given Respondent", notes = "", response = VndCollectionjson.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Collection of available representations for a Respondent", response = VndCollectionjson.class),
        @ApiResponse(code = 404, message = "Respondent not found", response = VndCollectionjson.class) })
    @RequestMapping(value = "/respondents/id/{id}",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<VndCollectionjson> respondentsIdIdOptions(@ApiParam(value = "ID of Respondent to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update the representation for an existing Respondent.", notes = "Updates the representation for an existing Respondent. To be used to activate a Respondent when their email address has been confirmed.", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "item updated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not match the currently authenticated user", response = Void.class),
        @ApiResponse(code = 409, message = "Invalid ETag supplied", response = Void.class) })
    @RequestMapping(value = "/respondents/id/{id}",
        consumes = { "application/vnd.ons.respondent+json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> respondentsIdIdPut(@ApiParam(value = "ID of Respondent to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The current ETag value for the Respondent"  ) @RequestHeader(value="ETag", required=false) String etag);


    @ApiOperation(value = "adds a Respondent", notes = "Adds a Respondent to the system", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class) })
    @RequestMapping(value = "/respondents",
        consumes = { "application/vnd.ons.respondent+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> respondentsPost(@ApiParam(value = "Respondent to add"  ) @RequestBody Respondent party);

}

package io.swagger.api;

import io.swagger.model.Business;
import io.swagger.model.Error;
import java.io.File;
import io.swagger.model.Party;
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

@Api(value = "businesses", description = "the businesses API")
public interface BusinessesApi {

    @ApiOperation(value = "searches Businesses", notes = "By passing in the appropriate options, you can search for available Businesses ", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Search results matching criteria. For frontstage use, the response will be filtered based on the ACTIVE business associations for the Respondent", response = Void.class),
        @ApiResponse(code = 400, message = "Bad input parameter", response = Void.class) })
    @RequestMapping(value = "/businesses",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> businessesGet(@ApiParam(value = "pass an optional search string for looking up Businesses") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Returns the known business associations for a business", notes = "Returns the known business associations for a business", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Paginated list of known business associations for a business", response = Void.class),
        @ApiResponse(code = 404, message = "Business not found", response = Void.class) })
    @RequestMapping(value = "/businesses/id/{id}/business-associations",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> businessesIdIdBusinessAssociationsGet(@ApiParam(value = "ID of Business to return",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "View the available representations for a given Business", notes = "", response = VndCollectionjson.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Collection of available representations for a Business", response = VndCollectionjson.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = VndCollectionjson.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not have an ACTIVE association with this business", response = VndCollectionjson.class),
        @ApiResponse(code = 404, message = "Business not found", response = VndCollectionjson.class) })
    @RequestMapping(value = "/businesses/id/{id}",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<VndCollectionjson> businessesIdIdOptions(@ApiParam(value = "ID of Business to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update the representation for an existing Business", notes = "Updates the representation for an existing Business", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item updated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 409, message = "Invalid ETag supplied", response = Void.class) })
    @RequestMapping(value = "/businesses/id/{id}",
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> businessesIdIdPut(@ApiParam(value = "ID of Party to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryparty,
        @ApiParam(value = "The current ETag value for the Party"  ) @RequestHeader(value="ETag", required=false) String etag);


    @ApiOperation(value = "adds a reporting unit of type Business", notes = "Adds a new Business, or updates an existing Business based on the business reference provided", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "item updated", response = Void.class),
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 422, message = "an existing item already exists", response = Void.class) })
    @RequestMapping(value = "/businesses",
        consumes = { "application/vnd.ons.business+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> businessesPost(@ApiParam(value = "Business to add"  ) @RequestBody Party party);


    @ApiOperation(value = "Get a Business by its Party ID", notes = "Returns a single Party", response = Business.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Party representation", response = Business.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Business.class),
        @ApiResponse(code = 404, message = "Party not found", response = Business.class) })
    @RequestMapping(value = "/businesses/id/{id}",
        produces = { "application/vnd.ons.business+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Business> getBusinessById(@ApiParam(value = "ID of Party to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Get a Business by its unique business reference", notes = "Returns a single Business", response = Business.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "frontstage","backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Business representation", response = Business.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Business.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not have an ACTIVE association with this business", response = Business.class),
        @ApiResponse(code = 404, message = "Business not found", response = Business.class) })
    @RequestMapping(value = "/businesses/ref/{ref}",
        produces = { "application/vnd.ons.business+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Business> getBusinessByRef(@ApiParam(value = "Reference of the Business to return",required=true ) @PathVariable("ref") String ref);

}

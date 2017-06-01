package io.swagger.api;

import java.io.File;
import io.swagger.model.Residence;
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

@Api(value = "residences", description = "the residences API")
public interface ResidencesApi {

    @ApiOperation(value = "Get a Residence by its Party ID", notes = "Returns a single Party", response = Residence.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Party representation", response = Residence.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Residence.class),
        @ApiResponse(code = 404, message = "Party not found", response = Residence.class) })
    @RequestMapping(value = "/residences/id/{id}",
        produces = { "application/vnd.ons.party+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Residence> getResidenceById(@ApiParam(value = "ID of Party to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Get a Residence by its unique property reference", notes = "Returns a single Residence", response = Residence.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Residence representation", response = Residence.class),
        @ApiResponse(code = 400, message = "Invalid Ref supplied", response = Residence.class),
        @ApiResponse(code = 404, message = "Residence not found", response = Residence.class) })
    @RequestMapping(value = "/residences/uprn/{uprn}",
        produces = { "application/vnd.ons.party+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Residence> getResidenceByUprn(@ApiParam(value = "Unique property reference of the Residence to return",required=true ) @PathVariable("uprn") String uprn);


    @ApiOperation(value = "searches Residences", notes = "By passing in the appropriate options, you can search for available Residences ", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Void.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    @RequestMapping(value = "/residences",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> residencesGet(@ApiParam(value = "pass an optional search string for looking up Residences") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "View the available representations for a given Residence", notes = "", response = VndCollectionjson.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Collection of available representations for a Residence", response = VndCollectionjson.class),
        @ApiResponse(code = 404, message = "Residence not found", response = VndCollectionjson.class) })
    @RequestMapping(value = "/residences/id/{id}",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<VndCollectionjson> residencesIdIdOptions(@ApiParam(value = "ID of Residence to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Update the representation for an existing Residence", notes = "Updates the representation for an existing Residence", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item updated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 409, message = "Invalid ETag supplied", response = Void.class) })
    @RequestMapping(value = "/residences/id/{id}",
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> residencesIdIdPut(@ApiParam(value = "ID of Party to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryparty,
        @ApiParam(value = "The current ETag value for the Party"  ) @RequestHeader(value="ETag", required=false) String etag);


    @ApiOperation(value = "adds a reporting unit of type Residence", notes = "Adds a Residence to the system", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "future", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = Void.class) })
    @RequestMapping(value = "/residences",
        consumes = { "application/vnd.ons.party+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> residencesPost(@ApiParam(value = "Residence to add"  ) @RequestBody Residence party);

}

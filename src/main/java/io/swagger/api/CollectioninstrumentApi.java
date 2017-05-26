package io.swagger.api;

import io.swagger.model.Collectioninstrument;
import java.io.File;
import io.swagger.model.VndCollectionjson;

import io.swagger.annotations.*;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import io.swagger.model.CollInsId;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

@Api(value = "collectioninstrument", description = "the collectioninstrument API")
public interface CollectioninstrumentApi {

    @ApiOperation(value = "searches collection instruments", notes = "By passing in the appropriate options, you can search for available collection instruments ", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "respondent","cec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Void.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    @RequestMapping(value = "/collectioninstrument",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CollInsId> collectioninstrumentGet(@ApiParam(value = "pass an optional search string for looking up collection instruments based on classifier") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "View the available representations for a given collection instrument", notes = "", response = VndCollectionjson.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "respondent","cec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Collection of available representations for a collection instrument", response = VndCollectionjson.class),
        @ApiResponse(code = 404, message = "Collection instrument not found", response = VndCollectionjson.class) })
    @RequestMapping(value = "/collectioninstrument/id/{id}",
        produces = { "application/vnd.collection+json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<VndCollectionjson> collectioninstrumentIdIdOptions(@ApiParam(value = "ID of collection instrument to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Adds a binary representation to an existing collection instrument", notes = "Adds a collection instrument binary representation to the system", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "cec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item updated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 409, message = "Invalid ETag supplied", response = Void.class) })
    @RequestMapping(value = "/collectioninstrument/id/{id}",
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> collectioninstrumentIdIdPut(@ApiParam(value = "ID of collection instrument to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryCollectionInstrument,
        @ApiParam(value = "The current ETag value for the collection instrument"  ) @RequestHeader(value="ETag", required=false) String etag);


    @ApiOperation(value = "adds a collection instrument", notes = "Adds a collection instrument to the system", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "cec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = Void.class) })
    @RequestMapping(value = "/collectioninstrument",
        consumes = { "application/vnd.ons.collectioninstrument+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> collectioninstrumentPost(@ApiParam(value = "Collection instrument to add"  ) @RequestBody Collectioninstrument collectionInstrument);


    @ApiOperation(value = "Get a collection instrument by ID", notes = "Returns a single collection instrument", response = Collectioninstrument.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "respondent","cec", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Collection instrument representation", response = Collectioninstrument.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Collectioninstrument.class),
        @ApiResponse(code = 404, message = "Collection instrument not found", response = Collectioninstrument.class) })
    @RequestMapping(value = "/collectioninstrument/id/{id}",
        produces = { "application/vnd.ons.collectioninstrument+json", "application/vnd.ms-excel" }, 
        method = RequestMethod.GET)
    ResponseEntity<Collectioninstrument> getCollectionInstrumentById(@ApiParam(value = "ID of collection instrument to return",required=true ) @PathVariable("id") String id);

}

package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Party;

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

@Api(value = "parties", description = "the parties API")
public interface PartiesApi {

    @ApiOperation(value = "Get a Party by its UUID", notes = "Returns a single Party", response = Party.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Party representation", response = Party.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Party.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not have an ACTIVE association with this business", response = Party.class),
        @ApiResponse(code = 404, message = "Business not found", response = Party.class) })
    @RequestMapping(value = "/parties/{id}",
        produces = { "application/vnd.ons.party+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Party> getPartyById(@ApiParam(value = "ID of the Party to return",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Get a Party by its unique reference (ruref)", notes = "Returns a single Party", response = Party.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Party representation", response = Party.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Party.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not have an ACTIVE association with this business", response = Party.class),
        @ApiResponse(code = 404, message = "Business not found", response = Party.class) })
    @RequestMapping(value = "/parties/ruref/{ruref}",
        produces = { "application/vnd.ons.party+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Party> getPartyByRef(@ApiParam(value = "Reference of the Party to return",required=true ) @PathVariable("ruref") String ruref);


    @ApiOperation(value = "Get a Household Party by its uprn", notes = "Returns a single Party", response = Party.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "read", description = "allows reading resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Party representation", response = Party.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Party.class),
        @ApiResponse(code = 403, message = "Forbidden - in the context of frontstage use, this response would indicate the Respondent does not have an ACTIVE association with this business", response = Party.class),
        @ApiResponse(code = 404, message = "Business not found", response = Party.class) })
    @RequestMapping(value = "/parties/uprn/{uprn}",
        produces = { "application/vnd.ons.party+json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Party> getPartyByUPRN(@ApiParam(value = "Reference of the Party to return",required=true ) @PathVariable("uprn") String uprn);


    @ApiOperation(value = "given a sampleUnitType B | H this adds a reporting unit of type Business or Household", notes = "Adds a new Party of type sampleUnitType or updates an existing Party based on the reference provided", response = Void.class, authorizations = {
        @Authorization(value = "accessCode", scopes = {
            @AuthorizationScope(scope = "write", description = "allows modifying resources")
            })
    }, tags={ "backstage", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "item updated", response = Void.class),
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 422, message = "an existing item already exists", response = Void.class) })
    @RequestMapping(value = "/parties",
        consumes = { "application/vnd.ons.party+json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> partiesPost(@ApiParam(value = "Party to add"  ) @RequestBody Party party);

}

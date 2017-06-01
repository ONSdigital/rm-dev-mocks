package io.swagger.api;

import io.swagger.model.Business;
import io.swagger.model.Error;
import java.io.File;
import io.swagger.model.Party;
import io.swagger.model.VndCollectionjson;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

@Controller
public class BusinessesApiController implements BusinessesApi {

    public ResponseEntity<Void> businessesGet(@ApiParam(value = "pass an optional search string for looking up Businesses") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> businessesIdIdBusinessAssociationsGet(@ApiParam(value = "ID of Business to return",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<VndCollectionjson> businessesIdIdOptions(@ApiParam(value = "ID of Business to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<VndCollectionjson>(HttpStatus.OK);
    }

    public ResponseEntity<Void> businessesIdIdPut(@ApiParam(value = "ID of Party to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryparty,
        @ApiParam(value = "The current ETag value for the Party"  ) @RequestHeader(value="ETag", required=false) String etag) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> businessesPost(@ApiParam(value = "Business to add"  ) @RequestBody Party party) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Business> getBusinessById(@ApiParam(value = "ID of Party to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Business>(HttpStatus.OK);
    }

    public ResponseEntity<Business> getBusinessByRef(@ApiParam(value = "Reference of the Business to return",required=true ) @PathVariable("ref") String ref) {
        // do some magic!
        return new ResponseEntity<Business>(HttpStatus.OK);
    }

}

package io.swagger.api;

import java.io.File;
import io.swagger.model.Residence;
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
public class ResidencesApiController implements ResidencesApi {

    public ResponseEntity<Residence> getResidenceById(@ApiParam(value = "ID of Party to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Residence>(HttpStatus.OK);
    }

    public ResponseEntity<Residence> getResidenceByUprn(@ApiParam(value = "Unique property reference of the Residence to return",required=true ) @PathVariable("uprn") String uprn) {
        // do some magic!
        return new ResponseEntity<Residence>(HttpStatus.OK);
    }

    public ResponseEntity<Void> residencesGet(@ApiParam(value = "pass an optional search string for looking up Residences") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<VndCollectionjson> residencesIdIdOptions(@ApiParam(value = "ID of Residence to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<VndCollectionjson>(HttpStatus.OK);
    }

    public ResponseEntity<Void> residencesIdIdPut(@ApiParam(value = "ID of Party to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryparty,
        @ApiParam(value = "The current ETag value for the Party"  ) @RequestHeader(value="ETag", required=false) String etag) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> residencesPost(@ApiParam(value = "Residence to add"  ) @RequestBody Residence party) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

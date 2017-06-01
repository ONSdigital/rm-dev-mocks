package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Respondent;
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
public class RespondentsApiController implements RespondentsApi {

    public ResponseEntity<Respondent> getRespondentById(@ApiParam(value = "ID of Respondent to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Respondent>(HttpStatus.OK);
    }

    public ResponseEntity<Void> respondentsGet(@ApiParam(value = "pass an optional search string for looking up Respondents") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> respondentsIdIdBusinessAssociationsGet(@ApiParam(value = "ID of Respondent",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<VndCollectionjson> respondentsIdIdOptions(@ApiParam(value = "ID of Respondent to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<VndCollectionjson>(HttpStatus.OK);
    }

    public ResponseEntity<Void> respondentsIdIdPut(@ApiParam(value = "ID of Respondent to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "The current ETag value for the Respondent"  ) @RequestHeader(value="ETag", required=false) String etag) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> respondentsPost(@ApiParam(value = "Respondent to add"  ) @RequestBody Respondent party) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

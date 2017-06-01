package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Party;

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
public class PartiesApiController implements PartiesApi {

    public ResponseEntity<Party> getPartyById(@ApiParam(value = "ID of the Party to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Party>(HttpStatus.OK);
    }

    public ResponseEntity<Party> getPartyByRef(@ApiParam(value = "Reference of the Party to return",required=true ) @PathVariable("ruref") String ruref) {
        // do some magic!
        return new ResponseEntity<Party>(HttpStatus.OK);
    }

    public ResponseEntity<Party> getPartyByUPRN(@ApiParam(value = "Reference of the Party to return",required=true ) @PathVariable("uprn") String uprn) {
        // do some magic!
        return new ResponseEntity<Party>(HttpStatus.OK);
    }

    public ResponseEntity<Void> partiesPost(@ApiParam(value = "Party to add"  ) @RequestBody Party party) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

package io.swagger.api;

import io.swagger.model.EnrolmentInvitation;

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
public class EnrolmentInvitationsApiController implements EnrolmentInvitationsApi {

    public ResponseEntity<Void> enrolmentInvitationsGet(@ApiParam(value = "pass an optional search string for looking up Enrolment Invitations") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> enrolmentInvitationsPost(@ApiParam(value = "Enrolment Invitation to store"  ) @RequestBody EnrolmentInvitation party) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

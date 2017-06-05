package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Party;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import uk.gov.ons.ctp.response.party.representation.PartyDTO;

import java.util.HashMap;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-26T09:46:55.625Z")

@Controller
public class PartiesApiController implements PartiesApi {

    public ResponseEntity<?> getPartyById(@ApiParam(value = "ID of the Party to return",required=true ) @PathVariable("id") String id) {
        // do some magic!

        PartyDTO partyDTO = new PartyDTO();
        partyDTO.setSampleId(1);
        partyDTO.setPosition(1);
        partyDTO.setSize(1);
        partyDTO.setSampleUnitType("BI");
        partyDTO.setSampleUnitRef("REF");
        partyDTO.setId("7bc5d41b-0549-40b3-ba76-42f6d4cf3992");

        Map<String, String> partyAttributes = new HashMap<>();
        partyAttributes.put("firstName", "Edward");
        partyAttributes.put("lastName", "Stevens");
        partyAttributes.put("telephone", "08008547321");
        partyAttributes.put("emailAddress", "email@ons.gov.uk");

        partyDTO.setAttributes(partyAttributes);

        System.out.println("PARTY PARTY PARTY" + partyDTO.toString());

        return ResponseEntity.ok(partyDTO);
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

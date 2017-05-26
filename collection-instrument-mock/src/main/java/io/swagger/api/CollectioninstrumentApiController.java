package io.swagger.api;

import io.swagger.model.Collectioninstrument;
import io.swagger.model.CollInsId;

import java.io.File;
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
import java.util.UUID;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

@Controller
public class CollectioninstrumentApiController implements CollectioninstrumentApi {

    public ResponseEntity<CollInsId> collectioninstrumentGet(@ApiParam(value = "pass an optional search string for looking up collection instruments based on classifier") @RequestParam(value = "searchString", required = false) String searchString,
        @ApiParam(value = "number of records to skip for pagination") @RequestParam(value = "skip", required = false) Integer skip,
        @ApiParam(value = "maximum number of records to return") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        String ciId = UUID.randomUUID().toString();
        CollInsId collInsId = new CollInsId();
        collInsId.setId(ciId);
        return new ResponseEntity<CollInsId>(collInsId, HttpStatus.OK);
    }

    public ResponseEntity<VndCollectionjson> collectioninstrumentIdIdOptions(@ApiParam(value = "ID of collection instrument to return",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<VndCollectionjson>(HttpStatus.OK);
    }

    public ResponseEntity<Void> collectioninstrumentIdIdPut(@ApiParam(value = "ID of collection instrument to update",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile binaryCollectionInstrument,
        @ApiParam(value = "The current ETag value for the collection instrument"  ) @RequestHeader(value="ETag", required=false) String etag) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> collectioninstrumentPost(@ApiParam(value = "Collection instrument to add"  ) @RequestBody Collectioninstrument collectionInstrument) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Collectioninstrument> getCollectionInstrumentById(@ApiParam(value = "ID of collection instrument to return",required=true ) @PathVariable("id") String id) {
        Collectioninstrument ci = new Collectioninstrument();
        ci.setId(id);
        ci.setSurveyId(UUID.randomUUID().toString());
        return new ResponseEntity<Collectioninstrument>(ci, HttpStatus.OK);
    }

}

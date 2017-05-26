package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Classifiers;
import java.util.ArrayList;
import java.util.List;

/**
 * Collectioninstrument
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-05-24T14:23:25.485Z")

public class CollInsId   {
    @JsonProperty("collectioninstrumentid")
    private String id = null;

    public CollInsId id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @ApiModelProperty(example = "urn:ons.gov.uk:id:ci:001.234.56789", required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


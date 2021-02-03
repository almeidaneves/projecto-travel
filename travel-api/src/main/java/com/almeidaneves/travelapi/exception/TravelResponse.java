package com.almeidaneves.travelapi.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer responseCode;
    private String description;


}

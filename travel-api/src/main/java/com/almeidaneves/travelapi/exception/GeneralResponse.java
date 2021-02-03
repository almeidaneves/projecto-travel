package com.almeidaneves.travelapi.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralResponse extends TravelResponse{

    private TravelGeneral general;
    private List<?> generalList;
}

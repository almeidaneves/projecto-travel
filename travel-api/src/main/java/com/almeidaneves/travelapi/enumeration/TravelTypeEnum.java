package com.almeidaneves.travelapi.enumeration;

public enum TravelTypeEnum {

    ONE_WAY("ONE-WAY"), RETURN("RETURN"), MULTI_CITY("MULTI-CITY");

    private String value;

    private TravelTypeEnum(String value) {
        this.value = value;
    }
    private String getValue(String value){
        return this.value;
    }

}

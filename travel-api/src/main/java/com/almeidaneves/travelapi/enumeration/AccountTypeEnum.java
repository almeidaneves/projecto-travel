package com.almeidaneves.travelapi.enumeration;

public enum AccountTypeEnum {
    FREE("FREE"),
    BASIC("BASIC"),
    PREMIUM("PREMIUN");

    private String value;

    private AccountTypeEnum(String value){
        this.value = value;
    }
    public  String getValue(String value){
        return this.value;
    }
}

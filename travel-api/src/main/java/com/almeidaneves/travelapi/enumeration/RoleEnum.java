package com.almeidaneves.travelapi.enumeration;

public enum RoleEnum {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");

    private String role;
    private RoleEnum(String role){
        this.role = role;
    }

    public String getRole(String role){
        return role;
    }
}

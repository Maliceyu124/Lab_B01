package com.fsse2406.lab_b01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("hkid_number")
    private String hkId;


    public Person(String firstName, String lastName, String hkId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hkId = hkId;
    }
    public String getHkId() {

        return hkId;
    }

    public void setHkId(String hkId) {
        this.hkId = hkId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

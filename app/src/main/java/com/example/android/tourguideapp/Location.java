package com.example.android.tourguideapp;

public class Location {

    private String name;
    private String address;
    private String phone;
    private String description;

    public Location(String locName, String locAddress, String locPhone, String locDescription ) {
        name = locName;
        address = locAddress;
        phone = locPhone;
        description = locDescription;
    }

    public String getName () {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone () {
        return phone;
    }

    public String getDescription () {
        return description;
    }

}

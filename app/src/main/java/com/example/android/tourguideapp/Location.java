package com.example.android.tourguideapp;

public class Location {

    /**
     * Global Variables for the class
     * */
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private String address;
    private String phone;
    private String webAddress;
    private String description;
    private int imageId = NO_IMAGE_PROVIDED;

    /**
     * Location without an imageId
     *
     * @param locName = location name
     * @param locAddress = location address
     * @param locPhone  = location phone
     * @param locWebAddress = location web address / url
     * @param locDescription = location description
     *
     * */
    public Location(String locName, String locAddress, String locPhone, String locWebAddress, String locDescription ) {
        name = locName;
        address = locAddress;
        phone = locPhone;
        webAddress = locWebAddress;
        description = locDescription;
    }

    /**
     * Location with an imageId
     *
     * @param locName = location name
     * @param locAddress = location address
     * @param locPhone  = location phone
     * @param locWebAddress = location web address / url
     * @param locDescription = location description
     *
     * */
    public Location(String locName, String locAddress, String locPhone, String locWebAddress, String locDescription, int locImage ) {
        name = locName;
        address = locAddress;
        phone = locPhone;
        webAddress = locWebAddress;
        description = locDescription;
        imageId = locImage;
    }

    /**
     * Method for getting name
     * */
    public String getName () {
        return name;
    }

    /**
     * Method for getting address
     * */
    public String getAddress() { return address;  }

    /**
     * Method for getting phone
     * */
    public String getPhone () {
        return phone;
    }


    /**
     * Method for getting web address / url
     * */
    public String getWebAddress() { return webAddress; }

    /**
     * Method for getting description
     * */
    public String getDescription () {
        return description;
    }

    /**
     * Method for checking if object includes image id
     * */
    public boolean hasImageId() { return imageId != NO_IMAGE_PROVIDED; }

    /**
     * Method for checking if object includes image id
     * */
    public int getImageId() { return imageId; }

}

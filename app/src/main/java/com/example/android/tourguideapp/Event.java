package com.example.android.tourguideapp;

public class Event {

    /**
     * Global Variables for the class
     * */
    private static final int NO_IMAGE_PROVIDED = -1;
    private String eTitle;
    private String eLocation;
    private String eWebAddress;
    private String eDate;

    private int imageId = NO_IMAGE_PROVIDED;

    /**
     * Location without an imageId
     *
     * @param eventTitle = title of event
     * @param eventLocation = where the event will be held
     * @param eventWebAddress  = web address of event or where to get tickets or more information
     * @param eventDate = when the event will happen
     *
     * */
    public Event(String eventTitle, String eventLocation, String eventWebAddress, String eventDate ) {
        eTitle = eventTitle;
        eLocation = eventLocation;
        eWebAddress = eventWebAddress;
        eDate = eventDate;
    }

    /**
     * Location with an imageId
     *
     * @param eventTitle = title of event
     * @param eventLocation = where the event will be held
     * @param eventWebAddress  = web address of event or where to get tickets or more information
     * @param eventDate = when the event will happen
     *
     * */
    public Event(String eventTitle, String eventLocation, String eventWebAddress, String eventDate, int locImage ) {
        eTitle = eventTitle;
        eLocation = eventLocation;
        eWebAddress = eventWebAddress;
        eDate = eventDate;
        imageId = locImage;
    }

    /**
     * Method for getting event title
     * */
    public String getEventTitle () {
        return eTitle;
    }

    /**
     * Method for getting event location
     * */
    public String getEventLocation() { return eLocation;  }

    /**
     * Method for getting web address / url
     * */
    public String getEventWebAddress() { return eWebAddress; }

    /**
     * Method for getting date of event
     * */
    public String getEventDate() {
        return eDate;
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



package com.engineerfadyfawzi.londontourguide;

public class Place
{
    /**
     * Image resource ID for the place
     */
    private int placeImageId;
    
    /**
     * String resource ID for the name of the place
     */
    private int placeNameId;
    
    /**
     * String resource ID for the address of the place
     */
    private int placeLocationId;
    
    /**
     * String resource ID for the website url of the place
     */
    private int placeWebsiteId;
    
    /**
     * String resource ID for the phone number of the place
     */
    private int placePhoneId;
    
    /**
     * Create a new Place object.
     *
     * @param placeImageId is the drawable resource ID for image associated with the place
     * @param placeNameId is teh string resource ID for the place name
     * @param placeLocationId is teh string resource ID for the place location
     * @param placeWebsiteId is teh string resource ID for the place website
     * @param placePhoneId is teh string resource ID for the place phone number
     */
    public Place( int placeImageId, int placeNameId, int placeLocationId, int placeWebsiteId, int placePhoneId )
    {
        this.placeImageId = placeImageId;
        this.placeNameId = placeNameId;
        this.placeLocationId = placeLocationId;
        this.placeWebsiteId = placeWebsiteId;
        this.placePhoneId = placePhoneId;
    }
    
    /**
     * Get the drawable resource ID for the image of the place.
     *
     * @return
     */
    public int getPlaceImageId()
    {
        return placeImageId;
    }
    
    /**
     * Get the string resource ID for the name of the place.
     *
     * @return
     */
    public int getPlaceNameId()
    {
        return placeNameId;
    }
    
    /**
     * Get the string resource ID for the location of the place.
     *
     * @return
     */
    public int getPlaceLocationId()
    {
        return placeLocationId;
    }
    
    /**
     * Get the string resource ID for the website of the place.
     *
     * @return
     */
    public int getPlaceWebsiteId()
    {
        return placeWebsiteId;
    }
    
    /**
     * Get the string resource ID for the phone number of the place.
     *
     * @return
     */
    public int getPlacePhoneId()
    {
        return placePhoneId;
    }
}
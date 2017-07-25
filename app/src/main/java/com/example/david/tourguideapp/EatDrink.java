package com.example.david.tourguideapp;

/**
 * Created by david on 24.7.2017..
 */

public class EatDrink {

    private String mName;
    private String mAddress;
    private String mOpeningHours;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public EatDrink(String name, String adress, String openingHours, String description, int imageResourceId) {
        mName = name;
        mAddress = adress;
        mOpeningHours = openingHours;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getOpeningHours() {
        return mOpeningHours;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

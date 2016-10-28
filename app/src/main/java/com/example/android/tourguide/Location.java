package com.example.android.tourguide;

/**
 * Created by vivek on 28-10-2016.
 */
public class Location {
    private int mImageResourceId;
    private String mTitle;
    private String mDescription;

    public Location (int imageResourceId, String title, String description) {
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
    }

    // Get image resource id.
    public int getImageResourceId () {
        return mImageResourceId;
    }

    // Get the title.
    public String getTitle () {
        return mTitle;
    }

    // Get the description.
    public String getDescription () {
        return mDescription;
    }
}

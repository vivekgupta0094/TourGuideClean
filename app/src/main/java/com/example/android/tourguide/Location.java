package com.example.android.tourguide;

/**
 * {@link Location} represents a location.
 * It contains image, name and a small description of the location.
 */
public class Location {

    /** Image resource ID for the word. */
    private int mImageResourceId;

    /** Title of the location. */
    private int mTitle;

    /** Description of the location. */
    private int mDescription;

    /**
     * Create a new Location object.
     *
     * @param imageResourceId is resource ID for the image associated with the location.
     * @param title is the string resource Id for the title of the location.
     * @param description is the string resource Id for the description of the location.
     */
    public Location(int imageResourceId, int title, int description) {
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
    }

    // Get image resource id.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get the title.
    public int getTitle() {
        return mTitle;
    }

    // Get the description.
    public int getDescription() {
        return mDescription;
    }
}

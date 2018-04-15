
package com.example.android.tourguideapp;

//Item object class
public class Item {

    /**
     * Text in first line of item text
     */
    private String mFirstLineText;

    /**
     * Text in second line of item text
     */
    private String mSecondLineText;

    /**
     * Image resource ID (if necessary)
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Item object
     * 1) without image
     * 2) with image
     */

    public Item(String FirstLineText, String SecondLineText) {
        mFirstLineText = FirstLineText;
        mSecondLineText = SecondLineText;
    }

    public Item(String FirstLineText, String SecondLineText, int imageResourceId) {
        mFirstLineText = FirstLineText;
        mSecondLineText = SecondLineText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get first line of the list item text.
     */
    public String getFirstLineText() {
        return mFirstLineText;
    }

    /**
     * Get second line of the list item text.
     */
    public String getSecondLineText() {
        return mSecondLineText;
    }

    /**
     * Return the image resource ID of the Item.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this item.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
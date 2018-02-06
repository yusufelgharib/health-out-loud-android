package com.veephealthoutloud.healthoutloud.Interfaces;

import java.util.ArrayList;
import java.util.Date;

/**
 * Interface for a post.
 */

public interface IPost {

    /**
     * Gets the list of feelings associated with this post.
     * @return An array list of feelings as string.
     */
    public ArrayList<String> GetFeelings();

    /**
     * Gets the id for this post.
     * @return The Id as a string.
     */
    public String GetPostID();

    /**
     * Gets the message for this post.
     * @return The message as a string.
     */
    public String GetMessage();

    /**
     * Gets the date that this post was created.
     * @return The date this post was created.
     */
    public Date GetDate();
}

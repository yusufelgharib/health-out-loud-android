package com.veephealthoutloud.healthoutloud.Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface for a user.
 * Created by court on 2017-12-27.
 */

public interface IUser {

    /**
     * Get the email associated with the user.
     * @return the user's email
     */
    String GetEmail();

    /**
     * Resets the user's password through email.
     * @return true if the email was sent.
     */
    boolean ResetPassword();

    /**
     * Gets a list of the posts created by this user.
     * @return a list of posts
     */
    List<IPost> GetUserPosts();

    /**
     * Create a post by this user.
     * @param message The message for the post
     * @param feelings The feelings for this post
     * @return The newly created post.
     */
    IPost CreatePost(String message, ArrayList<String> feelings);

    /**
     * Delete a post by this user.
     * @param post The post to be deleted
     * @return true if the post was deleted
     */
    boolean DeletePost(IPost post);

    /**
     * Delete all posts by this user.
     * @return true if the post were deleted
     */
    boolean DeleteAllUserPosts();

    /**
     * Report a post.
     * @param post The post that is reported
     * @param reason The reason for reporting the post
     * @return true if the post was reported
     */
    boolean ReportPost(IPost post, String reason);

}

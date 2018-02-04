package com.veephealthoutloud.healthoutloud.Classes;

import com.veephealthoutloud.healthoutloud.Interfaces.IPost;
import com.veephealthoutloud.healthoutloud.Interfaces.IUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class representing a user.
 */

public class User implements IUser {

    private String _email;
    private List<IPost> _posts;

    public User(String email){
        _email = email;
        _posts = new ArrayList<>();
    }

    @Override
    public String GetEmail() {
        return _email;
    }

    @Override
    public boolean ResetPassword() {
        return false;
    }

    @Override
    public List<IPost> GetUserPosts() {
        return _posts;
    }

    @Override
    public IPost CreatePost(String message, ArrayList<String> feelings) {
        // TODO: Add request to create post.
        return new Post("postID", message, new Date(), feelings);
    }

    @Override
    public boolean DeletePost(IPost post) {
        return false;
    }

    @Override
    public boolean DeleteAllUserPosts() {
        _posts.clear();
        return true;
    }

    @Override
    public boolean ReportPost(IPost post, String reason) {
        return false;
    }
}

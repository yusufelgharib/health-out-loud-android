package com.veephealthoutloud.healthoutloud.Classes;


import com.veephealthoutloud.healthoutloud.Interfaces.IPost;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class representing a post.
 */

public class Post implements IPost {

    private String _postID;
    private String _message;
    private ArrayList<String> _feelings;
    private Date _date;

    public Post(String postID, String message, Date date, ArrayList<String> feelings){
        _postID = postID;
        _message = message;
        _feelings = feelings;
        _date = date;
    }

    @Override
    public ArrayList<String> GetFeelings() {
        return _feelings;
    }

    @Override
    public String GetPostID() {
        return _postID;
    }

    @Override
    public String GetMessage() {
        return _message;
    }

    @Override
    public Date GetDate() {
        return _date;
    }
}

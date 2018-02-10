package com.veephealthoutloud.healthoutloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.veephealthoutloud.healthoutloud.Classes.Post;
import com.veephealthoutloud.healthoutloud.Interfaces.IPost;

import java.util.ArrayList;
import java.util.Date;

public class NewsfeedActivity extends AppCompatActivity {

    private ListView postListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        postListView = findViewById(R.id.newsfeed_post_list_view);

        // Create list of posts
        ArrayList<IPost> postMessages = GetPosts();

        PostAdapter postAdapter = new PostAdapter(this, postMessages);
        postListView.setAdapter(postAdapter);
    }

    private ArrayList<IPost> GetPosts(){
        // TODO: Change to use request to server when that's set up
        ArrayList<IPost> list = new ArrayList<>();

        ArrayList<String> feelings = new ArrayList<>();
        feelings.add("sad");
        feelings.add("annoyed");

        IPost post1 = new Post("postID", "message", new Date(), feelings);
        IPost post2 = new Post("postID2", "message2", new Date(), feelings);
        IPost post3 = new Post("postID3", "message3", new Date(), feelings);
        list.add(post1);
        list.add(post2);
        list.add(post3);
        return list;
    }
}

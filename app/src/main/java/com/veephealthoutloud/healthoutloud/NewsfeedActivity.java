package com.veephealthoutloud.healthoutloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsfeedActivity extends AppCompatActivity {

    private ListView postListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        postListView = findViewById(R.id.newsfeed_post_list_view);

        // Create list of posts
        ArrayList<String> postMessages = GetPosts();

        PostAdapter postAdapter = new PostAdapter(this, postMessages);
        postListView.setAdapter(postAdapter);
    }

    private ArrayList<String> GetPosts(){
        ArrayList<String> list = new ArrayList<>();
        list.add("post1");
        list.add("post2");
        list.add("post3");
        return list;
    }
}

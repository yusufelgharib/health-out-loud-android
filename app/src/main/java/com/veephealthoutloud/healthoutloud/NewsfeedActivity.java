package com.veephealthoutloud.healthoutloud;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.veephealthoutloud.healthoutloud.Classes.Post;
import com.veephealthoutloud.healthoutloud.Interfaces.IPost;

import java.util.ArrayList;
import java.util.Date;

public class NewsfeedActivity extends AppCompatActivity {

    private ListView postListView;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);

        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_newsfeed:
                        Intent intent = new Intent(NewsfeedActivity.this, NewsfeedActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.nav_my_posts:
                        // TODO: Change to go to MyPosts activity when implemented
                        return true;
                    case R.id.nav_settings:
                        // TODO: Change to go to Account Settings activity when implemented
                        return true;
                    case R.id.nav_logout:
                        // TODO: Have it actually logout
                        intent = new Intent(NewsfeedActivity.this, LoginActivity.class);
                        startActivity(intent);
                        return true;
                    default:
                        return true;
                }
            }
        });

        postListView = findViewById(R.id.newsfeed_post_list_view);

        // Create list of posts
        ArrayList<IPost> postMessages = GetPosts();

        PostAdapter postAdapter = new PostAdapter(this, postMessages);
        postListView.setAdapter(postAdapter);
    }

    public void AddPostButtonOnClick(View view){
        Intent intent = new Intent(NewsfeedActivity.this, CreatePostActivity.class);
        startActivity(intent);
    }

    private ArrayList<IPost> GetPosts(){
        // TODO: Change to use request to server when that's set up
        ArrayList<IPost> list = new ArrayList<>();

        ArrayList<String> feelings = new ArrayList<>();
        feelings.add("sad");
        feelings.add("frustrated");

        IPost post1 = new Post("postID", "message", new Date(), feelings);
        IPost post2 = new Post("postID2", "message2", new Date(), feelings);
        IPost post3 = new Post("postID3", "message3", new Date(), feelings);
        list.add(post1);
        list.add(post2);
        list.add(post3);
        return list;
    }
}

package com.veephealthoutloud.healthoutloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreatePostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
    }

    public void OnSubmitButtonClick(View view){
        // TODO: Add server call to create a post
    }
}

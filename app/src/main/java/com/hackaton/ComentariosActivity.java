package com.hackaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
public class ComentariosActivity extends AppCompatActivity {
    public static final String POST_KEY_EXTRA = "post_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);
        String postKey = getIntent().getStringExtra(POST_KEY_EXTRA);
        if (postKey == null) {
            finish();
        }

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.comments_fragment, CommentsFragment.newInstance(postKey))
                .commit();
    }
    }


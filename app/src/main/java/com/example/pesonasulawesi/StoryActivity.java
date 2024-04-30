package com.example.pesonasulawesi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pesonasulawesi.Account.AccountHome;

public class StoryActivity extends AppCompatActivity {

    private ImageView story_image;
    private ImageView story_profile;
    private TextView story_username;

    AccountHome homekan;

    public static final String DATA_STORY = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        story_image = findViewById(R.id.story_image);
        story_profile = findViewById(R.id.story_profile);
        story_username = findViewById(R.id.story_username);

        homekan = getIntent().getParcelableExtra(DATA_STORY);
        story_image.setBackgroundResource(homekan.getStory());
        story_profile.setImageResource(homekan.getProfile());
        story_username.setText(homekan.getFullname());

    }
}
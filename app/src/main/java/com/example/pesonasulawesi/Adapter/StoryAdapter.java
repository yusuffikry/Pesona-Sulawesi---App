package com.example.pesonasulawesi.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pesonasulawesi.Account.AccountHome;
import com.example.pesonasulawesi.R;
import com.example.pesonasulawesi.StoryActivity;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private final ArrayList<AccountHome> homes;

    public StoryAdapter(ArrayList<AccountHome> homes) {

        this.homes = homes;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_layout, parent, false);
        return new StoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        AccountHome stories = homes.get(position);

        holder.story_profile.setImageResource(stories.getProfile());
        holder.story_username.setText(stories.getFullname());

        holder.story_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), StoryActivity.class);
                intent.putExtra(StoryActivity.DATA_STORY, stories);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return homes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView story_profile;
        private TextView story_username;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            story_profile = itemView.findViewById(R.id.profile_story);
            story_username = itemView.findViewById(R.id.username_story);
        }
    }
}

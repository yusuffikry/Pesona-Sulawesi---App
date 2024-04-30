package com.example.pesonasulawesi.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pesonasulawesi.AboutActivity;
import com.example.pesonasulawesi.Account.AccountHome;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private final ArrayList<AccountHome> homes;

    public HomeAdapter(ArrayList<AccountHome> homes) {
        this.homes = homes;
    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        AccountHome user = homes.get(position);

        holder.fullname.setText(user.getFullname());
        holder.username.setText(user.getUsername());
        holder.caption.setText(user.getCaption());
        holder.profile.setImageResource(user.getProfile());
        holder.post.setImageResource(user.getPost());
         

    }

    @Override
    public int getItemCount() {
        return homes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView fullname, username, caption;
        ImageView profile, post;

        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fullname = itemView.findViewById(R.id.user_fullname);
            username = itemView.findViewById(R.id.user_username);
            profile = itemView.findViewById(R.id.userprofile);
            post = itemView.findViewById(R.id.userimage);
            caption = itemView.findViewById(R.id.usercaption);
            linearLayout = itemView.findViewById(R.id.linear_home);
        }
    }
}

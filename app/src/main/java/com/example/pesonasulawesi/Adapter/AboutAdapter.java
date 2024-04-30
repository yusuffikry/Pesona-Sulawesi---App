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
import com.example.pesonasulawesi.Account.AccountAbout;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.ViewHolder> {

    private final ArrayList<AccountAbout> abouts;

    public AboutAdapter(ArrayList<AccountAbout> abouts) {
        this.abouts = abouts;
    }

    @NonNull
    @Override
    public AboutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_about, parent, false);
        return new AboutAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutAdapter.ViewHolder holder, int position) {
        AccountAbout about = abouts.get(position);

        holder.location_about.setText(about.getLocation());
        holder.profile_lokasi.setImageResource(about.getProfile_location());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), AboutActivity.class);
                intent.putExtra(AboutActivity.DATA_ABOUT, about);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return abouts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView location_about;
        ImageView profile_lokasi;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            location_about = itemView.findViewById(R.id.location_about);
            profile_lokasi = itemView.findViewById(R.id.profile_destination);
            linearLayout = itemView.findViewById(R.id.linear_about);

        }
    }
}

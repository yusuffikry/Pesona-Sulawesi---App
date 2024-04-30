package com.example.pesonasulawesi.Adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pesonasulawesi.Account.AccountHistory;
import com.example.pesonasulawesi.DataSource.DataHistory;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private final ArrayList<AccountHistory> histories;

    public HistoryAdapter(ArrayList<AccountHistory> histories) {
        this.histories = histories;
    }


    @NonNull
    @Override
    public HistoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_history, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryAdapter.ViewHolder holder, int position) {
        AccountHistory history = histories.get(position);

        holder.fullnamehistory.setText(history.getFullnamehistory());
        holder.usernamehistory.setText(history.getUsernamehistory());
        holder.profilehistory.setImageResource(history.getProfilehistory());
        Integer img = history.getPosthistory();
        Uri img2 = history.getAddposthistory();
        if (img != null) {
            holder.posthistory.setImageResource(img);
        } else if (img2 != null) {
            holder.posthistory.setImageURI(img2);
        }
        holder.captionhistory.setText(history.getCaptionhistory());
    }


    @Override
    public int getItemCount() {
        return histories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView fullnamehistory, usernamehistory, captionhistory;
        ImageView profilehistory, posthistory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fullnamehistory = itemView.findViewById(R.id.user_historyfullname);
            usernamehistory = itemView.findViewById(R.id.user_userhistory);
            captionhistory = itemView.findViewById(R.id.usercaptionhistory);
            profilehistory = itemView.findViewById(R.id.profilehistory);
            posthistory = itemView.findViewById(R.id.userimagehistory);
        }
    }
}

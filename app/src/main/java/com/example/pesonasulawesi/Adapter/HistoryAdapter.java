package com.example.pesonasulawesi.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
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

        holder.deletepost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    showDeleteConfirmationDialog(holder.itemView.getContext(), adapterPosition);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return histories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView fullnamehistory, usernamehistory, captionhistory;
        ImageView profilehistory, posthistory;

        CardView deletepost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fullnamehistory = itemView.findViewById(R.id.user_historyfullname);
            usernamehistory = itemView.findViewById(R.id.user_userhistory);
            captionhistory = itemView.findViewById(R.id.usercaptionhistory);
            profilehistory = itemView.findViewById(R.id.profilehistory);
            posthistory = itemView.findViewById(R.id.userimagehistory);
            deletepost = itemView.findViewById(R.id.deletepost);

        }
    }

    private void showDeleteConfirmationDialog(Context context, int position) {

        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_delete_post);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.custom_dialog_bg));

        Button btnCancel = dialog.findViewById(R.id.btn_cancel);
        Button btnDelete = dialog.findViewById(R.id.btn_delete);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                histories.remove(position);
                notifyItemRemoved(position);
                dialog.dismiss();
                Toast.makeText(context, "Data Berhasil Dihapus", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }
}

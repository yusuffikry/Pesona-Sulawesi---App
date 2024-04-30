package com.example.pesonasulawesi.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pesonasulawesi.Account.AccountHistory;
import com.example.pesonasulawesi.DataSource.DataHistory;
import com.example.pesonasulawesi.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PostingFragment extends Fragment {

    private EditText addcontent;
    private ImageView addimg;
    private Button submitpost;
    private boolean isImageChanged = false;
    private Uri image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewpost =  inflater.inflate(R.layout.fragment_posting, container, false);

        addcontent = viewpost.findViewById(R.id.content_et);
        addimg = viewpost.findViewById(R.id.image);
        submitpost = viewpost.findViewById(R.id.posting);

        addimg.setOnClickListener(view -> {
            Intent openGallery = new Intent(Intent.ACTION_PICK);
            openGallery.setType("image/*");
            launcherIntentGallery.launch(openGallery);
        });

        submitpost.setOnClickListener(view -> {
            if (addcontent.getText().toString().trim().isEmpty()) {
                Toast.makeText(getActivity(), "Konten Masih Kosong", Toast.LENGTH_SHORT).show();
                return;
            } if (!isImageChanged) {
                Toast.makeText(getActivity(), "Pilih Gambar Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                return;
            } else {
                // Gunakan konstruktor yang menerima Uri
                AccountHistory newAccount = new AccountHistory("Rafael STruick", "rafaelstruick", R.drawable.astronout, image, addcontent.getText().toString());
                DataHistory.histories.add(0, newAccount);
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.framelayout, new HistoryFragment())
                        .commit();
                Toast.makeText(getActivity(), "Post Berhasil Ditambahkan", Toast.LENGTH_SHORT).show();
                BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.bottomNavView);
                bottomNavigationView.setSelectedItemId(R.id.navigation_history);
            }
        });


        return viewpost;

    }
    ActivityResultLauncher<Intent> launcherIntentGallery = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    image = data.getData();
                    addimg.setImageURI(image);
                    isImageChanged = true;
                }
            }
    );
}
package com.example.pesonasulawesi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pesonasulawesi.Account.AccountAbout;

public class AboutActivity extends AppCompatActivity {

    private TextView name_location, top_lima, poin1, poin2, poin3, poin4, poin5, deskripsi1, deskripsi2, deskripsi3, deskripsi4, deskripsi5;

    private ImageView profile_lokasi, picture1, picture2, picture3, picture4, picture5;

    AccountAbout tentang;

    public static final String DATA_ABOUT = "this";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        name_location = findViewById(R.id.location_about);
        top_lima = findViewById(R.id.top_five);
        poin1 = findViewById(R.id.point1);
        poin2 = findViewById(R.id.point2);
        poin3 = findViewById(R.id.point3);
        poin4 = findViewById(R.id.point4);
        poin5 = findViewById(R.id.point5);
        deskripsi1=findViewById(R.id.description1);
        deskripsi2=findViewById(R.id.description2);
        deskripsi3=findViewById(R.id.description3);
        deskripsi4=findViewById(R.id.description4);
        deskripsi5=findViewById(R.id.description5);
        profile_lokasi = findViewById(R.id.profile_destination);
        picture1 = findViewById(R.id.picture1);
        picture2 = findViewById(R.id.picture2);
        picture3 = findViewById(R.id.picture3);
        picture4 = findViewById(R.id.picture4);
        picture5 = findViewById(R.id.picture5);

        tentang = getIntent().getParcelableExtra(DATA_ABOUT);
        name_location.setText(tentang.getLocation());
        top_lima.setText(tentang.getTop_five());
        poin1.setText(tentang.getPoint1());
        poin2.setText(tentang.getPoint2());
        poin3.setText(tentang.getPoint3());
        poin4.setText(tentang.getPoint4());
        poin5.setText(tentang.getPoint5());
        deskripsi1.setText(tentang.getDescription1());
        deskripsi2.setText(tentang.getDescription2());
        deskripsi3.setText(tentang.getDescription3());
        deskripsi4.setText(tentang.getDescription4());
        deskripsi5.setText(tentang.getDescription5());
        profile_lokasi.setImageResource(tentang.getProfile_location());
        picture1.setImageResource(tentang.getPicture1());
        picture2.setImageResource(tentang.getPicture2());
        picture3.setImageResource(tentang.getPicture3());
        picture4.setImageResource(tentang.getPicture4());
        picture5.setImageResource(tentang.getPicture5());
    }
}
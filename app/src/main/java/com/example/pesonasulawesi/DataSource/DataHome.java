package com.example.pesonasulawesi.DataSource;

import com.example.pesonasulawesi.Account.AccountHome;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class DataHome {

    public static ArrayList<AccountHome> homes = generateDummyChats();

    private static ArrayList<AccountHome> generateDummyChats() {
        ArrayList<AccountHome> homes = new ArrayList<>();
        homes.add(new AccountHome("Sulawesi Selatan", "Pantai Bira", R.drawable.icon_sulsel, R.drawable.bulukumba_image1, "Pantai Tanjung Bira adalah salah satu pantai terindah di Sulawesi Selatan. Pantai ini terkenal dengan pasir putihnya yang halus, air lautnya yang jernih, dan pemandangan matahari terbenam yang menakjubkan. Di sini, Anda dapat berenang, berjemur, snorkeling, diving, atau simply bersantai di tepi pantai.", R.drawable.story_sulsel));

        homes.add(new AccountHome("Sulawesi Utara", "Taman Nasional Bunaken", R.drawable.icon_sulut, R.drawable.pulau_bunaken, "Surga bagi para pecinta diving dan snorkeling dengan keanekaragaman hayati laut yang luar biasa.\n" +
                "Terdiri dari 5 pulau dengan berbagai spot diving dan snorkeling yang terkenal, seperti Bunaken, Siladen, Manado Tua, Mantehage, dan Ajer Manado.\n" +
                "Rumah bagi lebih dari 350 spesies terumbu karang dan 1.400 spesies ikan.", R.drawable.story_sulut));

        homes.add(new AccountHome("Sulawesi Barat", "Pulau Karampuang", R.drawable.icon_sulbar, R.drawable.pulau_karampuang_sulbar, "Sebuah pulau di propinsi Sulawesi Barat, tepatnya di kota Mamuju.\n" +
                "\n" +
                "Diperlukan 15 menit menyebrang laut menggunakan kapal kecil dan membayar 20 per orang.\n" +
                "\n" +
                "Pulau ini dikelilingi laut dengan warna air hijau tosca dan cukup menarik untuk melakukan kegiatan snorkeling", R.drawable.story_sulbar));

        homes.add(new AccountHome("Sulawesi Tengah", "Kepulauan Togean", R.drawable.icon_sulteng, R.drawable.kepulauan_togean, "Kepulauan yang terdiri dari 391 pulau kecil dengan pantai berpasir putih, air laut biru jernih, dan terumbu karang yang masih alami.\n" +
                "Surga bagi para pecinta diving, snorkeling, dan kayaking.\n" +
                "Pemandangan bawah laut yang menakjubkan dengan berbagai jenis ikan, terumbu karang, dan biota laut lainnya.", R.drawable.story_sulteng));

        homes.add(new AccountHome("Sulawesi Tenggara", "Taman Nasional Wakatobi", R.drawable.icon_sultenggara, R.drawable.taman_nasional_wakatobi, "Surga bagi para pecinta diving dan snorkeling dengan keanekaragaman hayati laut yang luar biasa.\n" +
                "Terdiri dari 4 pulau utama dan 12 pulau kecil dengan berbagai spot diving dan snorkeling yang terkenal, seperti Wakatobi, Tomia, Kaledupa, dan Wangi-Wangi.\n" +
                "Rumah bagi lebih dari 750 spesies terumbu karang dan 4.000 spesies ikan.", R.drawable.story_kendari));

        homes.add(new AccountHome("Gorontalo", "Pulau Saronde", R.drawable.icon_gorontalo, R.drawable.pulau_saronde, "Pulau kecil yang indah dengan pantai berpasir putih, air laut biru jernih, dan terumbu karang yang masih alami.\n" +
                "Cocok untuk snorkeling, diving, berenang, dan bersantai di tepi pantai.\n" +
                "Tersedia penginapan dan restoran di pulau ini.", R.drawable.story_gorontalo));
        return homes;
    }
}

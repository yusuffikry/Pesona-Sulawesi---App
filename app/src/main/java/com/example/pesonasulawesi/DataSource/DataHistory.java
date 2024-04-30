package com.example.pesonasulawesi.DataSource;

import com.example.pesonasulawesi.Account.AccountHistory;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class DataHistory {

    public static ArrayList<AccountHistory> histories = generateDummyChats();

    private static ArrayList<AccountHistory> generateDummyChats() {
        ArrayList<AccountHistory> histories = new ArrayList<>();
        histories.add(new AccountHistory("Andi Adnan", "adnandi", R.drawable.astronout, R.drawable.post_sulsel, "Amazing Sulsel"));
        histories.add(new AccountHistory("Fahri Jafar", "fajar", R.drawable.profile, R.drawable.post_sulut, "Wonderful Sulsel"));
        histories.add(new AccountHistory("Mayko Raditya", "maykora", R.drawable.profile1, R.drawable.post_gorontalo, "Baby Shark"));
        histories.add(new AccountHistory("Jordan", "Jongana", R.drawable.kontak, R.drawable.post_sulteng, "Amazing Sulteng"));
        histories.add(new AccountHistory("Andi Muh Haikal", "dccal", R.drawable.profile2, R.drawable.post_sulbar, "Amazing Sulbar"));
        histories.add(new AccountHistory("Zulfikri", "zufasa", R.drawable.kontak2, R.drawable.post_kendari, "Amazing Sulsel"));
        return histories;
    }


}

package com.example.pesonasulawesi.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pesonasulawesi.Adapter.AboutAdapter;
import com.example.pesonasulawesi.Adapter.HistoryAdapter;
import com.example.pesonasulawesi.DataSource.DataAbout;
import com.example.pesonasulawesi.DataSource.DataHistory;
import com.example.pesonasulawesi.R;

public class AboutFragment extends Fragment {

    private RecyclerView rv_about;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        rv_about = view.findViewById(R.id.rv_about);

        rv_about.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rv_about.setHasFixedSize(true);

        AboutAdapter aboutAdapter = new AboutAdapter(DataAbout.abouts);

        rv_about.setAdapter(aboutAdapter);

        return view;
    }
}
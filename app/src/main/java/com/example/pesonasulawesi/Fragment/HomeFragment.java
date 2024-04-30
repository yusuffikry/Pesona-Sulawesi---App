package com.example.pesonasulawesi.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pesonasulawesi.Adapter.HomeAdapter;
import com.example.pesonasulawesi.Adapter.StoryAdapter;
import com.example.pesonasulawesi.DataSource.DataHome;
import com.example.pesonasulawesi.R;

public class HomeFragment extends Fragment {


    private RecyclerView rv_users, rv_story;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        rv_story = view.findViewById(R.id.rv_story);
        rv_story.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rv_story.setHasFixedSize(true);


        rv_users = view.findViewById(R.id.rv_users);

        rv_users.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rv_users.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataHome.homes);
        HomeAdapter homeAdapter = new HomeAdapter(DataHome.homes);

        rv_story.setAdapter(storyAdapter);
        rv_users.setAdapter(homeAdapter);

        return view;
    }
}
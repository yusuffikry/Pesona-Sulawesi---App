package com.example.pesonasulawesi.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pesonasulawesi.Adapter.HistoryAdapter;
import com.example.pesonasulawesi.Adapter.HomeAdapter;
import com.example.pesonasulawesi.DataSource.DataHistory;
import com.example.pesonasulawesi.DataSource.DataHome;
import com.example.pesonasulawesi.R;

public class HistoryFragment extends Fragment {

    private RecyclerView rv_history;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_history, container, false);

        rv_history = view.findViewById(R.id.rv_history);

        rv_history.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rv_history.setHasFixedSize(true);

        HistoryAdapter historyAdapter = new HistoryAdapter(DataHistory.histories);

        rv_history.setAdapter(historyAdapter);

        return view;
    }
}
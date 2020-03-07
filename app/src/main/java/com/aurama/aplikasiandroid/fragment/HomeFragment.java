package com.aurama.aplikasiandroid.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aurama.aplikasiandroid.fragment.adapter.ListClubsAdapter;
import com.aurama.aplikasiandroid.fragment.model.Clubs;
import com.aurama.aplikasiandroid.fragment.model.ClubsData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView rvClub;
    private ArrayList<Clubs> listClubs = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        rvClub = view.findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);
        showRecyclerList();
        return view;
    }

    private void showRecyclerList() {
        ListClubsAdapter listClubsAdapter = new ListClubsAdapter(ClubsData.getListData(), getContext());
        rvClub.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvClub.setAdapter(listClubsAdapter);
    }
}

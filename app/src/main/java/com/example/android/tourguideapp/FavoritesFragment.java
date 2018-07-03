package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {


    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> favoritesList = new ArrayList<Location>();

        favoritesList.add(new Location("Symphony Center", "Michigan Ave", "0", "it's an awesome place"));
        favoritesList.add(new Location("Symphony Center", "Michigan Ave", "0", "it's an awesome place"));
        favoritesList.add(new Location("Symphony Center", "Michigan Ave", "0", "it's an awesome place"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), favoritesList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
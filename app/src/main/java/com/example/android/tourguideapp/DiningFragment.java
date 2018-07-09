package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> diningList = new ArrayList<Location>();

        diningList.add(new Location(getString(R.string.hard_rock_cafe), getString(R.string.hard_rock_cafe_address),
                getString(R.string.hard_rock_cafe_phone), getString(R.string.hard_rock_cafe_web), R.drawable.hard_rock_cafe));

        diningList.add(new Location(getString(R.string.house_of_blues), getString(R.string.house_of_blues_address),
                getString(R.string.house_of_blues_phone), getString(R.string.house_of_blues_web), R.drawable.house_of_blues_drinks));

        diningList.add(new Location(getString(R.string.buddy_guy_legends), getString(R.string.buddy_guy_legends_address),
                getString(R.string.buddy_guy_legends_phone), getString(R.string.buddy_guy_legends_web), R.drawable.guitar_black_white));

        LocationAdapter adapter = new LocationAdapter(getActivity(), diningList);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

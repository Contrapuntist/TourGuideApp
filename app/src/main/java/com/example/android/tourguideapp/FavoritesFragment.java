package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {

    private Boolean isVisisble = false;

    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> favoritesList = new ArrayList<Location>();

        favoritesList.add(new Location(getString(R.string.broadway_in_chicago), getString(R.string.broadway_in_chicago_address),
                getString(R.string.broadway_in_chicago_phone), getString(R.string.broadway_in_chicago_web),
                getString(R.string.broadway_in_chicago_description), R.drawable.chicago_skyline_dusk));

        favoritesList.add(new Location(getString(R.string.cso), getString(R.string.cso_address),
                getString(R.string.cso_phone), getString(R.string.cso_web),
                getString(R.string.cso_description), R.drawable.cso_muti_todd_rosenberg_credit));

        favoritesList.add(new Location(getString(R.string.blues_bus_tour), getString(R.string.blues_bus_tour_address),
                getString(R.string.blues_bus_tour_phone), getString(R.string.blues_bus_tour_web),
                getString(R.string.blues_bus_tour_description), R.drawable.chicago_skyline_day));

        favoritesList.add(new Location(getString(R.string.reckless_records), getString(R.string.reckless_records_address),
                getString(R.string.reckless_records_phone), getString(R.string.reckless_records_web),
                getString(R.string.reckless_records_description), R.drawable.record_store));

        LocationAdapter adapter = new LocationAdapter(getActivity(), favoritesList);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
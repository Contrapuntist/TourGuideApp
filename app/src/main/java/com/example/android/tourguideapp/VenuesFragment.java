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
public class VenuesFragment extends Fragment {


    public VenuesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> venuesList = new ArrayList<Location>();

        venuesList.add(new Location(getString(R.string.green_mill), getString(R.string.green_mill_address),
                getString(R.string.green_mill_phone), getString(R.string.green_mill_web)));
        venuesList.add(new Location(getString(R.string.empty_bottle), getString(R.string.empty_bottle_address),
                getString(R.string.empty_bottle_phone), getString(R.string.empty_bottle_web)));
        venuesList.add(new Location(getString(R.string.bottom_lounge), getString(R.string.bottom_lounge_address),
                getString(R.string.bottom_lounge_phone), getString(R.string.bottom_lounge_web)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), venuesList);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

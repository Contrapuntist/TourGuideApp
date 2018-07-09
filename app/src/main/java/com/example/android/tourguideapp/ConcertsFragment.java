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
public class ConcertsFragment extends Fragment {


    public ConcertsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Event> eventsList = new ArrayList<Event>();

        eventsList.add(new Event(getString(R.string.lollapalooza), getString(R.string.lollapalooza_location),
                getString(R.string.lollapalooza_web), getString(R.string.lollapalooza_date)));
        eventsList.add(new Event(getString(R.string.ozzy), getString(R.string.ozzy_location),
                getString(R.string.ozzy_web), getString(R.string.ozzy_date)));
        eventsList.add(new Event(getString(R.string.black_label), getString(R.string.black_label_location),
                getString(R.string.black_label_web), getString(R.string.black_label_date)));
        eventsList.add(new Event(getString(R.string.viva_latino), getString(R.string.viva_latino_location),
                getString(R.string.viva_latino_web), getString(R.string.viva_latino_date)));

        EventAdapter adapter = new EventAdapter(getActivity(), eventsList);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event>{

    public EventAdapter (Activity context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View eventItemView = convertView;

        if (eventItemView == null) {
            eventItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.event_item, parent, false);
        }

        Event currentEvent = getItem(position);

        TextView eventTitle = (TextView) eventItemView.findViewById(R.id.event_title);
        eventTitle.setText(currentEvent.getEventTitle());

        TextView eventLocation = (TextView) eventItemView.findViewById(R.id.event_location);
        eventLocation.setText(currentEvent.getEventLocation());

        TextView eventWeb = (TextView) eventItemView.findViewById(R.id.event_web);
        eventWeb.setText(currentEvent.getEventWebAddress());

        TextView eventDate = (TextView) eventItemView.findViewById(R.id.event_date);
        eventDate.setText(currentEvent.getEventDate());

        return eventItemView;
    }
}

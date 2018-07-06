package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter (Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);

        View locationItemView = convertView;

        if (locationItemView == null) {
            locationItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.location_item, parent, false);
        }


        Location currentLocation = getItem(position);

        TextView locationName = (TextView) locationItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getName());

        TextView locationAddress = (TextView) locationItemView.findViewById(R.id.location_address);
        locationAddress.setText(currentLocation.getAddress());

        TextView locationWebAddress = (TextView) locationItemView.findViewById(R.id.location_web_address);
        locationWebAddress.setText(currentLocation.getWebAddress());

        TextView locationPhone = (TextView) locationItemView.findViewById(R.id.location_phone);
        locationPhone.setText(currentLocation.getPhone());

        ImageView locationImage = (ImageView) locationItemView.findViewById(R.id.location_img);

        if (currentLocation.hasImageId()) {

             locationImage.setVisibility(View.VISIBLE);

             locationImage.setImageResource(currentLocation.getImageId());

        } else {
             locationImage.setVisibility(View.GONE);
        }

        return locationItemView;
    }


}

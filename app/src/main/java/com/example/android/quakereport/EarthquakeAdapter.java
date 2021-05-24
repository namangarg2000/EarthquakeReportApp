package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Quake> {

    public EarthquakeAdapter(@NonNull Activity context, ArrayList<Quake> earthquake) {
        super(context,0,earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Quake currentQuake = getItem(position);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag_view);
        magTextView.setText(currentQuake.getMag());
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_view);
        cityTextView.setText(currentQuake.getCity());
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_view);
        dateTextView.setText((currentQuake.getDate()));

        return listItemView;
    }
}
package com.example.david.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<Events> events = new ArrayList<>();
        events.add(new Events(getString(R.string.events_name_1), getString(R.string.events_address_1), getString(R.string.events_date_1), getString(R.string.events_description_1), R.drawable.events_1));
        events.add(new Events(getString(R.string.events_name_2), getString(R.string.events_address_2), getString(R.string.events_date_2), getString(R.string.events_description_2), R.drawable.events_2));
        events.add(new Events(getString(R.string.events_name_3), getString(R.string.events_address_3), getString(R.string.events_date_3), getString(R.string.events_description_3), R.drawable.events_3));
        events.add(new Events(getString(R.string.events_name_4), getString(R.string.events_address_4), getString(R.string.events_date_4), getString(R.string.events_description_4), R.drawable.events_4));
        events.add(new Events(getString(R.string.events_name_5), getString(R.string.events_address_5), getString(R.string.events_date_5), getString(R.string.events_description_5), R.drawable.events_5));

        EventsAdapter adapter = new EventsAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

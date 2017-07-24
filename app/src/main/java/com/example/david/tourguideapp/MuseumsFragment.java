package com.example.david.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<Museums> museums = new ArrayList<>();
        museums.add(new Museums(getString(R.string.museums_name_1), getString(R.string.museums_address_1), getString(R.string.museums_opening_hours_1), getString(R.string.museums_description_1), R.drawable.museums_1));
        museums.add(new Museums(getString(R.string.museums_name_2), getString(R.string.museums_address_2), getString(R.string.museums_opening_hours_2), getString(R.string.museums_description_2), R.drawable.museums_2));
        museums.add(new Museums(getString(R.string.museums_name_3), getString(R.string.museums_address_3), getString(R.string.museums_opening_hours_3), getString(R.string.museums_description_3), R.drawable.museums_3));
        museums.add(new Museums(getString(R.string.museums_name_4), getString(R.string.museums_address_4), getString(R.string.museums_opening_hours_4), getString(R.string.museums_description_4), R.drawable.museums_4));
        museums.add(new Museums(getString(R.string.museums_name_5), getString(R.string.museums_address_5), getString(R.string.museums_opening_hours_5), getString(R.string.museums_description_5), R.drawable.museums_5));

        MuseumsAdapter adapter = new MuseumsAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

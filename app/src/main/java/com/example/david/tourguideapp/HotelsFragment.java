package com.example.david.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<Hotels> hotels = new ArrayList<>();
        hotels.add(new Hotels(getString(R.string.hotels_name_1), getString(R.string.hotels_address_1), getString(R.string.hotels_opening_hours_1), getString(R.string.hotels_description_1), R.drawable.hotels_1));
        hotels.add(new Hotels(getString(R.string.hotels_name_2), getString(R.string.hotels_address_2), getString(R.string.hotels_opening_hours_2), getString(R.string.hotels_description_2), R.drawable.hotels_2));
        hotels.add(new Hotels(getString(R.string.hotels_name_3), getString(R.string.hotels_address_3), getString(R.string.hotels_opening_hours_3), getString(R.string.hotels_description_3), R.drawable.hotels_3));
        hotels.add(new Hotels(getString(R.string.hotels_name_4), getString(R.string.hotels_address_4), getString(R.string.hotels_opening_hours_4), getString(R.string.hotels_description_4), R.drawable.hotels_4));
        hotels.add(new Hotels(getString(R.string.hotels_name_5), getString(R.string.hotels_address_5), getString(R.string.hotels_opening_hours_5), getString(R.string.hotels_description_5), R.drawable.hotels_5));

        HotelsAdapter adapter = new HotelsAdapter(getActivity(), hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
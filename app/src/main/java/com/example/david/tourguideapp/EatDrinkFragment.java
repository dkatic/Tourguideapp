package com.example.david.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EatDrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<EatDrink> eatdrink = new ArrayList<>();
        eatdrink.add(new EatDrink(getString(R.string.eat_and_drink_name_1), getString(R.string.eat_and_drink_address_1), getString(R.string.eat_and_drink_opening_hours_1), getString(R.string.eat_and_drink_description_1), R.drawable.eat_and_drink_1));
        eatdrink.add(new EatDrink(getString(R.string.eat_and_drink_name_2), getString(R.string.eat_and_drink_address_2), getString(R.string.eat_and_drink_opening_hours_2), getString(R.string.eat_and_drink_description_2), R.drawable.eat_and_drink_2));
        eatdrink.add(new EatDrink(getString(R.string.eat_and_drink_name_3), getString(R.string.eat_and_drink_address_3), getString(R.string.eat_and_drink_opening_hours_3), getString(R.string.eat_and_drink_description_3), R.drawable.eat_and_drink_3));
        eatdrink.add(new EatDrink(getString(R.string.eat_and_drink_name_4), getString(R.string.eat_and_drink_address_4), getString(R.string.eat_and_drink_opening_hours_4), getString(R.string.eat_and_drink_description_4), R.drawable.eat_and_drink_4));
        eatdrink.add(new EatDrink(getString(R.string.eat_and_drink_name_5), getString(R.string.eat_and_drink_address_5), getString(R.string.eat_and_drink_opening_hours_5), getString(R.string.eat_and_drink_description_5), R.drawable.eat_and_drink_5));

        EatDrinkAdapter adapter = new EatDrinkAdapter(getActivity(), eatdrink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
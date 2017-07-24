package com.example.david.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by david on 24.7.2017..
 */

public class MuseumsAdapter extends ArrayAdapter<Museums> {
    public MuseumsAdapter(@NonNull Activity context, @NonNull List<Museums> museums) {
        super(context, 0, museums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_item, parent, false);
        }

        Museums currentMuseums = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentMuseums.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentMuseums.getAddress());

        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.opening_hours_text_view);
        openingHoursTextView.setText(currentMuseums.getOpeningHours());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentMuseums.getDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        if (currentMuseums.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentMuseums.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getResources().getString(R.string.nature_1),getResources().getString(R.string.nature_1_1), R.drawable.kanal));
        items.add(new Item(getResources().getString(R.string.nature_2),getResources().getString(R.string.nature_2_1), R.drawable.myslecinek));
        items.add(new Item(getResources().getString(R.string.nature_3),getResources().getString(R.string.nature_3_1), R.drawable.kepa));
        items.add(new Item(getResources().getString(R.string.nature_4),getResources().getString(R.string.nature_4_1), R.drawable.puszcza));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.tan_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}

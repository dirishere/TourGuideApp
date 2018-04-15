package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PeopleFragment extends Fragment {

    public PeopleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getResources().getString(R.string.people_1),getResources().getString(R.string.people_for_more),R.drawable.rejewski));
        items.add(new Item(getResources().getString(R.string.people_2),getResources().getString(R.string.people_for_more),R.drawable.kulczyk));
        items.add(new Item(getResources().getString(R.string.people_3),getResources().getString(R.string.people_for_more),R.drawable.boniek));
        items.add(new Item(getResources().getString(R.string.people_4),getResources().getString(R.string.people_for_more),R.drawable.sikorski));
        items.add(new Item(getResources().getString(R.string.people_5),getResources().getString(R.string.people_for_more),R.drawable.gollob));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.tan_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Set a click listener to go to the wikipedia website when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

            if (position == 0) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Marian_Rejewski")));
            }
            if (position == 1) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Jan_Kulczyk")));
            }
            if (position == 2) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Zbigniew_Boniek")));
            }
            if (position == 3) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Rados%C5%82aw_Sikorski")));
            }
            if (position == 4) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Tomasz_Gollob")));
            }
            }
        });

        return rootView;
    }

}

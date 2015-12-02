package com.example.waiganjo.university;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Waiganjo on 11/30/2015.
 */
public class PublicFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.content_main, container, false);
        final ListView list = (ListView) (ListView) v.findViewById(R.id.listView);
        String[] values = new String[]{"Nairobi University", "Egerton", "JKUAT", "Moi University"};
        int[] images = {R.mipmap.ic_book, R.mipmap.ic_book, R.mipmap.ic_book, R.mipmap.ic_book};

        final ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < values.length; ++i) {
            list1.add(values[i]);
        }
        final CustomAdapter adapter = new CustomAdapter(getContext(), values, images);
        list.setAdapter(adapter);


        return v;
    }
}
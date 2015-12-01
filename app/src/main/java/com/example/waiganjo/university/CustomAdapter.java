package com.example.waiganjo.university;

/**
 * Created by Waiganjo on 12/1/2015.
 */ import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<String> data;//modify here
    public CustomAdapter(Context context, ArrayList<String> data) //modify here
    {
        this.mContext = context;
        this.data = data;
    }

    public CustomAdapter(PrivateFragment privateFragment, int fragment_layout, ArrayList<String> list1) {
    }


    @Override
    public int getCount() {
        return data.size();// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return data.get(position);// get the actual movie
    }
    @Override
    public long getItemId(int id) {
        return id;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.fragment_layout, parent,false);//modify here
            viewHolder = new ViewHolder();
            viewHolder.textViewTitle = (TextView) convertView.findViewById(R.id.textViewTitle);//modify here
            viewHolder.imageviewdish = (ImageView) convertView.findViewById(R.id.imageView);//modify here
//check on changing the font Typeface tf=Typeface.createFromAsset(mcontext.getAssets(),"fonts/abc.ttf");
            // viewHolder.textViewTitle.setTypeface(tf);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        String b = data.get(position);//modify her
        viewHolder.textViewTitle.setText(b.getTitle());//modify here
        viewHolder.imageviewdish.setImageResource(b.getImage());//modify here

        return convertView;
    }
    static class ViewHolder {
        TextView textViewTitle;//modify here
        ImageView imageviewdish;//modify here

    }

}

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
    String[] titles;
    int [] ids;
    public CustomAdapter(Context context,String[] titles,int[] ids) //modify here
    {
        this.mContext = context;
        this.titles = titles;
        this.ids=ids;
    }




    @Override
    public int getCount() {
        return titles.length;// # of items in your arraylist
    }
    @Override
    public Object getItem(int position) {
        return titles[position];// get the actual movie
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
        String b = titles[position];//modify her
        viewHolder.textViewTitle.setText(b);//modify here
        viewHolder.imageviewdish.setImageResource(ids[position]);//modify here

        return convertView;
    }
    static class ViewHolder {
        TextView textViewTitle;//modify here
        ImageView imageviewdish;//modify here

    }

}

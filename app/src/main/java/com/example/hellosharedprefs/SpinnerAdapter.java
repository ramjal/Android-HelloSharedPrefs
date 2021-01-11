package com.example.hellosharedprefs;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerAdapter extends BaseAdapter {

    ArrayList<Integer> colors;
    Context context;

    public SpinnerAdapter(Context context) {
        this.context = context;
        colors = new ArrayList<>();

        String[] allColors = context.getResources().getStringArray(R.array.my_colors);
        for(String color:allColors)
        {
            colors.add(Color.parseColor(color));
        }
    }

    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater layoutInflater = LayoutInflater.from(context);
//        convertView = layoutInflater.inflate(android.R.layout.simple_spinner_dropdown_item, null);
//        TextView textView = (TextView)convertView.findViewById(android.R.id.text1);
        convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent,false);
        TextView textView = (TextView)convertView.findViewById(R.id.spinner_textview);
        textView.setBackgroundColor(colors.get(position));
        return convertView;
    }
}

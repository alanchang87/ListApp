package com.example.alanchang.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflator;
    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        descriptions = d;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflator.inflate(R.layout.my_listview_layout, null);
        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView priceTextView = v.findViewById(R.id.priceTextView);
        TextView descriptionTextView = v.findViewById(R.id.descriptionTextView);

        String name = items[position];
        String price = prices[position];
        String description = descriptions[position];

        nameTextView.setText(name);
        priceTextView.setText(price);
        descriptionTextView.setText(description);

        return v;
    }
}

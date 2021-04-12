package com.example.customspinnerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<CountryList> {
    MyAdapter(Context context, ArrayList<CountryList> Clist)
    {
        super(context,0,Clist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return setMyView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return setMyView(position, convertView, parent);
    }

    private View setMyView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cust_layout,parent,false);
        }

        TextView countryName = convertView.findViewById(R.id.txtcountry);
        ImageView countryFlag = convertView.findViewById(R.id.imgFlag);

        CountryList currentItem = getItem(position);
        countryName.setText(currentItem.getCountryName());
        countryFlag.setImageResource(currentItem.getCountryFlag());

        return convertView;
    }
}

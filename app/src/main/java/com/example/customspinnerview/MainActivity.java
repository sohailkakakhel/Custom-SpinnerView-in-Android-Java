package com.example.customspinnerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner custSpinner;
    ArrayList<CountryList> clist = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custSpinner = findViewById(R.id.custSpinner);

        clist = new ArrayList<CountryList>();

        clist.add(new CountryList("Pakistan",R.drawable.pak));
        clist.add(new CountryList("Turkey",R.drawable.turkey));
        clist.add(new CountryList("Afghanistan", R.drawable.afghan));
        clist.add(new CountryList("Spain",R.drawable.span));
        clist.add(new CountryList("USA",R.drawable.us));
        clist.add(new CountryList("Srilanka",R.drawable.srilanka));
        clist.add(new CountryList("UAE",R.drawable.uae));
        clist.add(new CountryList("Iran",R.drawable.iran));
        clist.add(new CountryList("India",R.drawable.india));
        clist.add(new CountryList("England",R.drawable.england));
        clist.add(new CountryList("Newzeland",R.drawable.newzlnd));
        clist.add(new CountryList("Bangladesh",R.drawable.bangal));

        MyAdapter adapter = new MyAdapter(MainActivity.this,clist);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        custSpinner.setAdapter(adapter);

        custSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryList clickedItem = (CountryList) parent.getItemAtPosition(position);
                String cname = clickedItem.getCountryName();

                Toast.makeText(getApplicationContext(),cname,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
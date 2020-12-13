package com.cobanogluhasan.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        ListView myListview = (ListView) findViewById(R.id.myListView);

        final ArrayList <String>  myFamily = new ArrayList<String>();
        myFamily.add("Mediha");
        myFamily.add("Bedir");
        myFamily.add("Ceylan");
        myFamily.add("Hasan");
        myFamily.add("Ferhat");
        myFamily.add("Çiğdem");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, myFamily);

        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // parent.setVisibility(View.GONE);
                Log.i("hello: ", myFamily.get(position) );
                String message="hello  ";
                Toast.makeText(getApplicationContext(), message + myFamily.get(position), Toast.LENGTH_LONG).show();


            }
        });       */


       ListView animalsListView = (ListView) findViewById(R.id.animalsListView);

        final ArrayList<String> animalNames = new ArrayList<String>(asList("George", "Patrick", "Louise", "Cengo" ));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, animalNames);

        animalsListView.setAdapter(arrayAdapter);

        animalsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "You're the best " + animalNames.get(position) , Toast.LENGTH_LONG  ).show();

            }
        });








    }
}

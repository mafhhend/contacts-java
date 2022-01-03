package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    List<String> friends;
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friends = new ArrayList<>();
        friends.add("Mohammad");
        friends.add("Ali");
        friends.add("Mahdi");
        friends.add("Hassan");
        listView=findViewById(R.id.FriendsListView);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(this, info.class);
            String name=friends.get(i);
            Toast.makeText(MainActivity.this,Integer.toString(i) , Toast.LENGTH_SHORT).show();
            switch (i)
            {
                case 0: intent.putExtra("phone-number","09034099325");
                case 1: intent.putExtra("phone-number","09123415124");
                case 2: intent.putExtra("phone-number","09035412345");
                case 3: intent.putExtra("phone-number","09879872000");
            }
            startActivity(intent);
        });
    }
}
package com.dwisatria.listviewicon;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] listView_Title = new String[]{
            "Ruby", "Ralis", "Phyton", "Java Script", "Php",
    };

    int[] listviewImage = new int[]{
            R.drawable.ruby, R.drawable.rails, R.drawable.phyton, R.drawable.javas,
            R.drawable.php
    };

    String[] listviewShortDescription = new String[]{
            "Ruby is an open-source and fully object-oriented programming language",
            "Ruby on Rails is a server-side web application development fremework written in Ruby language.",
            "Python is interpreted scripting and object-oriented programming language.",
            "JavaScript is an object-based scripting language.",
            "PHP is an interpreted language I,e., there is no need for compilation.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listView_Title[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
    }
}
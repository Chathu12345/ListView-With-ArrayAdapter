package com.chathu.arrayadapterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Specify ListView Id within the parameter
        ListView listView = findViewById(R.id.listView);

        //Specify list items within array (below we are defining items inside String Array)
        String items[] = new String[]{"Adam", "Andrew", "Berry", "Carl","Lara"};

        //Next we specify ArrayAdapter (We use String ArrayAdapter in this code)
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);

        //connect adapter
        listView.setAdapter(arrayAdapter);
    }
}
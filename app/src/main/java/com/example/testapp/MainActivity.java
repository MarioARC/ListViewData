package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Stack stack = new Stack();

    ListView myList;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stack.pushFirst("hehe");
        stack.showList();

        myList = findViewById(R.id.listView1);
        ArrayAdapter<String> arr = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        for(int i = 0; i < stack.length(); i++)
        {
            arr.add(stack.atPosition(i));
        }

        myList.setAdapter(arr);
    }
}
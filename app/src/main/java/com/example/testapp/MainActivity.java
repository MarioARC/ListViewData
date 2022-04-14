package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress1(View v)
    {
        TextView view = findViewById(R.id.textView1);
        view.setText("Thanks");
        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show();
        Log.i("Info","button1 Pressed");
    }

    public void buttonPress2(View v)
    {
        TextView view = findViewById(R.id.textView2);
        view.setText("That's a hit");
        Log.i("Info", "button2 Pressed");
    }
}
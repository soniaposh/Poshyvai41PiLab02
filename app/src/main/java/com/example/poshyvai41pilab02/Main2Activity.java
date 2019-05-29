package com.example.poshyvai41pilab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtView;
    String newMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtView =  findViewById(R.id.textView2);
        Intent intent = getIntent();
        newMessage = intent.getStringExtra("message");
        txtView.setText(newMessage);
    }
}

package com.example.poshyvai41pilab02;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URL;


public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    @SuppressLint("ResourceType")
    public void sendMessage(View view) {
        /* Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", editText.getText().toString());
        startActivity(intent); */
        Intent intent = new Intent(Intent.ACTION_SEND);
        String msg = editText.getText().toString();
        intent.setType("text/plain");
        intent.putExtra(intent.EXTRA_TEXT,msg);
        startActivity(Intent.createChooser(intent, ""));
    }
}

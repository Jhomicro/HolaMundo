package com.hola.taller1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.hola.taller1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the intend that started this activity and extract the string
        Intent intent = new Intent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Capture the loyout´s TextView and set the string as its text
        TextView textView = findViewById(R.id.editTextTextPersonName3);
        textView.setText(message);
    }
    /**Called when the user taps the send button*/
    public void sendMessage(View view){
        //Do something in response to button
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
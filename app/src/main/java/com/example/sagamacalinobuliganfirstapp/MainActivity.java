package com.example.sagamacalinobuliganfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Name;
    TextView Contact;
    TextView Email;
    TextView Hello;
    Button Button;
    EditText myInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (TextView) findViewById(R.id.Name);
        Contact = (TextView) findViewById(R.id.Contact);
        Email = (TextView) findViewById(R.id.Email);
        Hello = (TextView) findViewById(R.id.Hello);
        Button = (Button) findViewById(R.id.Button);
        myInput = (EditText) findViewById(R.id.rndmName);

        //Hello.setText("Hello Joules");

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = myInput.getText().toString();
                Hello.setText("HELLO " + myValue + "!");
            }
        });


    }
}

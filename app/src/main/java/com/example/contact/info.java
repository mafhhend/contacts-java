package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle extras=getIntent().getExtras();
        String myString = extras.getString("phone-number");
        TextView PhoneNumber=findViewById(R.id.phoneNumber);

        PhoneNumber.setText(myString);
    }
}
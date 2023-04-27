package com.example.healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.profileName);
        t2=(TextView)findViewById(R.id.profileEmail);
        t3=(TextView)findViewById(R.id.profileUsername);
        t4=(TextView)findViewById(R.id.profilePassword);
        SharedPreferences sh = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);

        t1.setText(sh.getString("name",""));
        t2.setText(sh.getString("email",""));
        t3.setText(sh.getString("username",""));
        t4.setText(sh.getString("password",""));
    }
}
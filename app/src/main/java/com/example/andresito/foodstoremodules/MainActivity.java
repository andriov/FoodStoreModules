package com.example.andresito.foodstoremodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.foodstoreexception.Exceptions;

public class MainActivity extends AppCompatActivity {

    Exceptions exception_prove = new Exceptions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}

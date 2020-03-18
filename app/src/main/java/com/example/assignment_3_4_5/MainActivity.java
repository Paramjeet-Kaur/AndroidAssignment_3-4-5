package com.example.assignment_3_4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText cost;

    ArrayList<String> menu = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.menu);
        cost=findViewById(R.id.ItemCost);




    }
    public void Order(View view)
    {
        Intent intent = new Intent(this, Order_Result.class);
        startActivity(intent);
    }
}

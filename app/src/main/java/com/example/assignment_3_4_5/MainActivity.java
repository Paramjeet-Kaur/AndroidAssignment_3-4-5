package com.example.assignment_3_4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    EditText cost;
    SeekBar seekbar;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    ArrayList<String> menu = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.menu);
        cost=findViewById(R.id.ItemCost);
        seekbar=findViewById(R.id.seekBar);
        radioButton1=findViewById(R.id.radio1);
        radioButton2=findViewById(R.id.radio2);
        radioButton3=findViewById(R.id.radio3);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch stopped!", Toast.LENGTH_SHORT).show();
            }
        });}
        public void Order(View v)
        {
            String currmenu=spinner.getSelectedItem().toString();
            int quantity=10;
            double price=Double.valueOf(cost.getText().toString());

            double Total=quantity*price+0.13+0.10;
            Intent intent = new Intent(this, Order_Result.class);

            startActivity(intent);

        }
}

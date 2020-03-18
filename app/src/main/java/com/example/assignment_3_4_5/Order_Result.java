package com.example.assignment_3_4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;


public class Order_Result extends AppCompatActivity {
    ListView orderlist;

    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__result);

        orderlist=findViewById(R.id.list);
    }
    public void  Order(View view)
    {
        //String name = orderlist.getText().toString();
        //list.add(name);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list );
        //list.setAdapter(itemsAdapter);
        //list.setText("");
        itemsAdapter.notifyDataSetChanged();
    }

}

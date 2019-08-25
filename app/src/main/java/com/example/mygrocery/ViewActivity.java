package com.example.mygrocery;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ViewActivity extends AppCompatActivity implements Serializable {
 GroceryItem groceryItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        groceryItem= (GroceryItem)getIntent().getSerializableExtra("GroceryItemName");

        TextView viewName= (TextView) findViewById(R.id.view_name);
        viewName.setText(groceryItem.getName());;
        TextView viewQuantity= (TextView) findViewById(R.id.view_quantity);
        viewQuantity.setText(groceryItem.getQuantity());
    }
}

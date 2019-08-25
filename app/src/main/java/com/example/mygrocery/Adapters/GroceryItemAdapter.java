package com.example.mygrocery.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mygrocery.AddGroceryItemActivity;
import com.example.mygrocery.GroceryItem;
import com.example.mygrocery.R;

import org.w3c.dom.Text;

import java.util.List;

public class GroceryItemAdapter extends RecyclerView.Adapter<GroceryItemAdapter.MyViewHolder> {


    private List<GroceryItem> groceryItemList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public TextView quantityTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView=(TextView) itemView.findViewById(R.id.grocery_item_name);
            quantityTextView=(TextView) itemView.findViewById(R.id.grocery_item_quantity);

        }
    }
    public GroceryItemAdapter(List<GroceryItem> groceryItemList){
        this.groceryItemList= groceryItemList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grocery_item_row, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder viewHolder, int i) {
        GroceryItem groceryItem= groceryItemList.get(i);

        viewHolder.nameTextView.setText(groceryItem.getName());
        viewHolder.quantityTextView.setText(groceryItem.getQuantity());


    }



    @Override
    public int getItemCount() {
        return groceryItemList.size();
    }
}


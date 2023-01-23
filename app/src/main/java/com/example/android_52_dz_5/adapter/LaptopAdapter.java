package com.example.android_52_dz_5.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.android_52_dz_5.Laptop;
import com.example.android_52_dz_5.R;

import java.util.ArrayList;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopViewHolder> {

    public ArrayList<Laptop> arrayListLaptops;
    private  OnItemClick onItemClick;

    public LaptopAdapter(ArrayList<Laptop> arrayListLaptops, OnItemClick onItemClick) {
        this.arrayListLaptops = arrayListLaptops;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaptopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laptop,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        holder.onBind(arrayListLaptops.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.OnClick(arrayListLaptops.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListLaptops.size();
    }
}

class LaptopViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public LaptopViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void onBind(Laptop laptop) {
        imageView = itemView.findViewById(R.id.image_view_icon);
        textView = itemView.findViewById(R.id.text_view_tittle);

        Glide.with(imageView).load(laptop.getIcon()).into(imageView);
        textView.setText(laptop.getName());
    }
}


package com.example.android_52_dz_5.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.android_52_dz_5.Laptop;
import com.example.android_52_dz_5.R;
import com.example.android_52_dz_5.adapter.LaptopAdapter;
import com.example.android_52_dz_5.adapter.OnItemClick;
import com.example.android_52_dz_5.ui.detail.DetailInfoActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    RecyclerView recyclerView;
    private ArrayList<Laptop> laptopArrayList;
    private LaptopAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    private void fillList() {
        laptopArrayList = new ArrayList<>();
        laptopArrayList.add(new Laptop(
                "ASUS",
                "https://www.market777.ru/upload/iblock/70e/gcvfu13vzvuh3cnocz8a3gzgu2t5dv2d.jpg",
                "ASUS TUF GAMING")
        );
        laptopArrayList.add(new Laptop(
                "MSI",
                "https://i.hinnavaatlus.ee/p/1200x630f/35/0a/1167065_800x600_9012.jpg",
                "MSI GL73 9SC")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );        laptopArrayList.add(new Laptop(
                "ASUS",
                "https://www.market777.ru/upload/iblock/70e/gcvfu13vzvuh3cnocz8a3gzgu2t5dv2d.jpg",
                "ASUS TUF GAMING")
        );
        laptopArrayList.add(new Laptop(
                "MSI",
                "https://i.hinnavaatlus.ee/p/1200x630f/35/0a/1167065_800x600_9012.jpg",
                "MSI GL73 9SC")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );        laptopArrayList.add(new Laptop(
                "ASUS",
                "https://www.market777.ru/upload/iblock/70e/gcvfu13vzvuh3cnocz8a3gzgu2t5dv2d.jpg",
                "ASUS TUF GAMING")
        );
        laptopArrayList.add(new Laptop(
                "MSI",
                "https://i.hinnavaatlus.ee/p/1200x630f/35/0a/1167065_800x600_9012.jpg",
                "MSI GL73 9SC")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );        laptopArrayList.add(new Laptop(
                "ASUS",
                "https://www.market777.ru/upload/iblock/70e/gcvfu13vzvuh3cnocz8a3gzgu2t5dv2d.jpg",
                "ASUS TUF GAMING")
        );
        laptopArrayList.add(new Laptop(
                "MSI",
                "https://i.hinnavaatlus.ee/p/1200x630f/35/0a/1167065_800x600_9012.jpg",
                "MSI GL73 9SC")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );        laptopArrayList.add(new Laptop(
                "ASUS",
                "https://www.market777.ru/upload/iblock/70e/gcvfu13vzvuh3cnocz8a3gzgu2t5dv2d.jpg",
                "ASUS TUF GAMING")
        );
        laptopArrayList.add(new Laptop(
                "MSI",
                "https://i.hinnavaatlus.ee/p/1200x630f/35/0a/1167065_800x600_9012.jpg",
                "MSI GL73 9SC")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
        laptopArrayList.add(new Laptop(
                "MacBook",
                "https://cdn1.ozone.ru/s3/multimedia-v/6442702363.jpg",
                "MacBook Air M1 chip")
        );
    }

    private void setAdapter() {
        adapter = new LaptopAdapter(laptopArrayList, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void OnClick(Laptop laptop) {
        Intent intent = new Intent(MainActivity.this, DetailInfoActivity.class);
        intent.putExtra("laptop", laptop);
        startActivity(intent);
    }
}
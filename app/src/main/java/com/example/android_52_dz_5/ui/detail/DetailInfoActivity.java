package com.example.android_52_dz_5.ui.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android_52_dz_5.Laptop;
import com.example.android_52_dz_5.R;

public class DetailInfoActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name;
    TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);
        findViews();
        getData();
    }

    private void findViews() {
        imageView = findViewById(R.id.image_view_icon);
        name = findViewById(R.id.text_view_tittle);
        description = findViewById(R.id.text_view_description);
    }

    void getData() {
        if (getIntent().getSerializableExtra("laptop") != null) {
            Laptop laptop = (Laptop) getIntent().getSerializableExtra("laptop");
            Glide.with(this).load(laptop.getIcon()).into(imageView);
            name.setText(laptop.getName());
            description.setText(laptop.getDescription());
        }
    }
}
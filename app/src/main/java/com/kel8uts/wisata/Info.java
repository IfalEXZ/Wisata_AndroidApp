package com.kel8uts.wisata;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_info);

        int photoResource = getIntent().getIntExtra("hero_photo", 0);
        String name = getIntent().getStringExtra("hero_name");
        String description = getIntent().getStringExtra("hero_description");

        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView nameTextView = findViewById(R.id.tv_item_name);
        TextView descTextView = findViewById(R.id.tv_item_description);

        imageView.setImageResource(photoResource);
        nameTextView.setText(name);
        descTextView.setText(description);
    }

}

package com.dicoding.picodiploma.androidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dicoding.picodiploma.androidpemula.model.Material;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvItemPrice = findViewById(R.id.tv_item_price);
        TextView tvItemName = findViewById(R.id.tv_item_name);

        String price = getIntent().getStringExtra(EXTRA_PRICE);
        String name = getIntent().getStringExtra(EXTRA_NAME);

        tvItemPrice.setText(price);
        tvItemName.setText(name);
    }
}

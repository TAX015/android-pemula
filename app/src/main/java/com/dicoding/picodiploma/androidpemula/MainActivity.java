package com.dicoding.picodiploma.androidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.dicoding.picodiploma.androidpemula.adapter.ListMaterialAdapter;
import com.dicoding.picodiploma.androidpemula.model.Material;
import com.dicoding.picodiploma.androidpemula.model.MaterialData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMaterial;
    private ArrayList<Material> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMaterial = findViewById(R.id.rv_material);
        rvMaterial.setHasFixedSize(true);

        list.addAll(MaterialData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMaterial.setLayoutManager(new LinearLayoutManager(this));
        ListMaterialAdapter listMaterialAdapter = new ListMaterialAdapter(list);
        rvMaterial.setAdapter(listMaterialAdapter);

        listMaterialAdapter.setOnItemClickCallback(new ListMaterialAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Material data) {
                showSelectedMaterial(data);
            }
        });
    }

    private void showSelectedMaterial(Material material){
        Toast.makeText(this, "Membuka " + material.getName(), Toast.LENGTH_SHORT).show();
    }
}

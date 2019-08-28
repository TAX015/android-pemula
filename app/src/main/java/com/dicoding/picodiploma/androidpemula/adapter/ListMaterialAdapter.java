package com.dicoding.picodiploma.androidpemula.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.androidpemula.R;
import com.dicoding.picodiploma.androidpemula.model.Material;

import java.util.ArrayList;

public class ListMaterialAdapter extends RecyclerView.Adapter<ListMaterialAdapter.ListViewHolder> {
    private ArrayList<Material> listMaterial;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMaterialAdapter(ArrayList<Material> list) {
        this.listMaterial = list;
    }

    public ArrayList<Material> getListMaterial() {
        return listMaterial;
    }

    public void setListMaterial(ArrayList<Material> listMaterial) {
        this.listMaterial = listMaterial;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_material, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Material material = listMaterial.get(position);

        Glide.with(holder.itemView.getContext())
                .load(material.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(material.getName());
        holder.tvPrice.setText(material.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMaterial.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListMaterial().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvPrice;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Material data);
    }
}

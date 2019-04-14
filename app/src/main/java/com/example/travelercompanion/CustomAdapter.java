package com.example.travelercompanion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>  {

    private List<GidModel> models;
    private Context context;
    View.OnClickListener clickListener;

    public CustomAdapter(Context context, List<GidModel> models, View.OnClickListener clickListener) {
        this.models = models;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        customViewHolder.name.setText(models.get(i).name);
        customViewHolder.detail.setText(models.get(i).about);

        customViewHolder.name.setOnClickListener(clickListener);

       // Glide.with(context)
             //   .load(models.get(i).imageUrl)
            //    .diskCacheStrategy(DiskCacheStrategy.ALL)
             //   .into(customViewHolder.getImage());
    }



    @Override
    public int getItemCount() {
        return models.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView detail;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            name = itemView.findViewById(R.id.text);
            detail = itemView.findViewById(R.id.textDetail);
        }

        public ImageView getImage() {
            return this.image;
        }
    }
}

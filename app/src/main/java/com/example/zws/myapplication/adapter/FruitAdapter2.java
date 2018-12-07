package com.example.zws.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zws.myapplication.R;
import com.example.zws.myapplication.bean.Fruit;

import java.util.List;

/**
 * Created by ZWS on 2018/12/7.
 */

public class FruitAdapter2 extends RecyclerView.Adapter<FruitAdapter2.ViewHolder> {

    private Context context;

    private List<Fruit> fruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            imageView = view.findViewById(R.id.fruit_image1);
            textView = view.findViewById(R.id.fruit_name1);
        }
    }

    public FruitAdapter2(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(context == null){
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.fruit_item_new, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.textView.setText(fruit.getName());
        Glide.with(context).load(fruit.getImageId()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }
}

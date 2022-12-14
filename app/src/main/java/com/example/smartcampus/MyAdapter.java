package com.example.smartcampus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<User> list;

    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = list.get(position);
        holder.nol.setText(user.getNo());
        holder.pointsl.setText(user.getPoints());
        holder.usnl.setText(user.getUsn());
        holder.namel.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nol, pointsl, usnl, namel;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nol = itemView.findViewById(R.id.no);
            pointsl = itemView.findViewById(R.id.points);
            usnl = itemView.findViewById(R.id.usns);
            namel = itemView.findViewById(R.id.names);
        }
    }
}

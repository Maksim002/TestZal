package com.example.testzal.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testzal.R;

import java.util.List;

public class Adaptor extends RecyclerView.Adapter<ResViewHolder> {


    private List<Content> contents;

    public Adaptor(List<Content> contents) {
        this.contents = contents;
    }


    @NonNull
    @Override
    public ResViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_initial,viewGroup,false);
        return new ResViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResViewHolder resViewHolder, int position) {
        resViewHolder.bind(contents.get(position));
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }
}

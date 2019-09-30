package com.example.testzal.RecyclerView;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testzal.R;

class ResViewHolder extends RecyclerView.ViewHolder{
    private TextView textView;


    public ResViewHolder(@NonNull View itemView ) {
        super(itemView);
        textView = itemView.findViewById(R.id.textTitle);


    }
    public void bind(final Content content) {
        textView.setText(content.getName(getAdapterPosition()));

    }
}

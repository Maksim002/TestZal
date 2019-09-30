package com.example.testzal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testzal.RecyclerView.Adaptor;
import com.example.testzal.RecyclerView.Content;

import java.util.ArrayList;

class HomeFragment extends Fragment {

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        getCompanies();

        return view;
    }

    private void getCompanies(){
        ArrayList<Content> companies = new ArrayList<>();
        companies.add(new Content("Recommended for Yor"));
        companies.add(new Content("Recommended for Yor"));
        companies.add(new Content("Recommended for Yor"));
        companies.add(new Content("Recommended for Yor"));


        Adaptor adapter = new Adaptor(companies);
        recyclerView.setAdapter(adapter);
    }

}

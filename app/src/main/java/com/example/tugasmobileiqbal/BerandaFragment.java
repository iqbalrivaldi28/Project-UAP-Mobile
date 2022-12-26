package com.example.tugasmobileiqbal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class BerandaFragment extends Fragment {

    public BerandaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_beranda, container, false);

        LinearLayout bt4 = (LinearLayout) rootView.findViewById(R.id.foodGyoza);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById = (LinearLayout) rootView.findViewById(R.id.foodOrange);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsActivity2.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById2 = (LinearLayout) rootView.findViewById(R.id.foodAvocado);
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsActivity3.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById3 = (LinearLayout) rootView.findViewById(R.id.foodTeh);
        viewById3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsActivity4.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById4 = (LinearLayout) rootView.findViewById(R.id.foodTeh2);
        viewById4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsActivity5.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById5 = (LinearLayout) rootView.findViewById(R.id.cate_bread);
        viewById5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SejarahActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById6 = (LinearLayout) rootView.findViewById(R.id.cate_bread2);
        viewById6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VisiActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById7 = (LinearLayout) rootView.findViewById(R.id.cate_healthy);
        viewById7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MisiActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout viewById8 = (LinearLayout) rootView.findViewById(R.id.cate_healthy2);
        viewById8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TujuanActivity.class);
                startActivity(intent);
            }
        });

        return rootView;

    }
}
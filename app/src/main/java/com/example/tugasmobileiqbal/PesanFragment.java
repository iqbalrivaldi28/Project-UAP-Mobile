package com.example.tugasmobileiqbal;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class PesanFragment extends Fragment {

    public PesanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pesan, container, false);

        Button viewById = (Button) rootView.findViewById(R.id.btn1);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HoltikulturaActivity.class);
                startActivity(intent);
            }
        });

        Button viewById2 = (Button) rootView.findViewById(R.id.btn2);
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PtpActivity.class);
                startActivity(intent);
            }
        });

        Button viewById3 = (Button) rootView.findViewById(R.id.btn3);
        viewById3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TechPembenihanActivity.class);
                startActivity(intent);
            }
        });


        Button viewById4 = (Button) rootView.findViewById(R.id.btn4);
        viewById4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TpthActivity.class);
                startActivity(intent);
            }
        });

        Button viewById5 = (Button) rootView.findViewById(R.id.btn5);
        viewById5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PtperkebunanActivity.class);
                startActivity(intent);
            }
        });

        Button viewById6 = (Button) rootView.findViewById(R.id.btn6);
        viewById6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PmipActivity.class);
                startActivity(intent);
            }
        });

        Button viewById7 = (Button) rootView.findViewById(R.id.btn7);
        viewById7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PengelolaankebunkopiActivity.class);
                startActivity(intent);
            }
        });

        Button viewById8 = (Button) rootView.findViewById(R.id.btn8);
        viewById8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PengelolaanpatisariActivity.class);
                startActivity(intent);
            }
        });


        Button viewById9 = (Button) rootView.findViewById(R.id.btn9);
        viewById9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TslActivity.class);
                startActivity(intent);
            }
        });


        Button viewById10 = (Button) rootView.findViewById(R.id.btn10);
        viewById10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MpActivity.class);
                startActivity(intent);
            }
        });


        Button viewById11 = (Button) rootView.findViewById(R.id.btn11);
        viewById11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TepaActivity.class);
                startActivity(intent);
            }
        });

        Button viewById12 = (Button) rootView.findViewById(R.id.btn12);
        viewById12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TrkiActivity.class);
                startActivity(intent);
            }
        });

        Button viewById13 = (Button) rootView.findViewById(R.id.btn13);
        viewById13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TrkjjActivity.class);
                startActivity(intent);
            }
        });

        Button viewById14 = (Button) rootView.findViewById(R.id.btn14);
        viewById14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PengembanganagroActivity.class);
                startActivity(intent);
            }
        });

        Button viewById15 = (Button) rootView.findViewById(R.id.btn15);
        viewById15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProduksiternakActivity.class);
                startActivity(intent);
            }
        });


        Button viewById16 = (Button) rootView.findViewById(R.id.btn16);
        viewById16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BudidayaperikananActivity.class);
                startActivity(intent);
            }
        });

        Button viewById17 = (Button) rootView.findViewById(R.id.btn17);
        viewById17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PerikanantangkapActivity.class);
                startActivity(intent);
            }
        });


        Button viewById18 = (Button) rootView.findViewById(R.id.btn18);
        viewById18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TeknologiproduksiternakActivity.class);
                startActivity(intent);
            }
        });

        Button viewById19 = (Button) rootView.findViewById(R.id.btn19);
        viewById19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TeknologipembenihanikanActivity.class);
                startActivity(intent);
            }
        });

        Button viewById20 = (Button) rootView.findViewById(R.id.btn20);
        viewById20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AdministrasipajakActivity.class);
                startActivity(intent);
            }
        });


        Button viewById21 = (Button) rootView.findViewById(R.id.btn21);
        viewById21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ManajemeninformatikaActivity.class);
                startActivity(intent);
            }
        });


        Button viewById22 = (Button) rootView.findViewById(R.id.btn22);
        viewById22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PerjalananwisataActivity.class);
                startActivity(intent);
            }
        });


        Button viewById23 = (Button) rootView.findViewById(R.id.btn23);
        viewById23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PengelolaanagribisnisActivity.class);
                startActivity(intent);
            }
        });

        Button viewById24 = (Button) rootView.findViewById(R.id.btn24);
        viewById24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AgribisnispanganActivity.class);
                startActivity(intent);
            }
        });

        Button viewById25 = (Button) rootView.findViewById(R.id.btn25);
        viewById25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AkutansibisnisdigitalActivity.class);
                startActivity(intent);
            }
        });


        Button viewById26 = (Button) rootView.findViewById(R.id.btn26);
        viewById26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AkutanasipajakActivity.class);
                startActivity(intent);
            }
        });


        Button viewById27 = (Button) rootView.findViewById(R.id.btn27);
        viewById27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PengelolaanperhotelanActivity.class);
                startActivity(intent);
            }
        });


        Button viewById28 = (Button) rootView.findViewById(R.id.btn28);
        viewById28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TeknologirekayasainternetActivity.class);
                startActivity(intent);
            }
        });








        return rootView;
    }
}
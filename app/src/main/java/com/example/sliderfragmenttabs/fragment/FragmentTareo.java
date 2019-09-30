package com.example.sliderfragmenttabs.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sliderfragmenttabs.R;


public class FragmentTareo extends Fragment {

    public FragmentTareo() {
        // Required empty public constructor
    }
    public static FragmentTareo newInstance(){
        FragmentTareo fragment = new FragmentTareo();

        return fragment;
    }
    String[] ItemsUnidadMedia = {"Seleccionar Unidad de Medida:", "Kilogramo", "Hora",
            "Caja", "Jaba", "Atado", "Pote", "Saco", "Aves", "Sin Unidad",};
    Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_tareo, container, false);


        return view;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



}

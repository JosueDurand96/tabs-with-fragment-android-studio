package com.example.sliderfragmenttabs.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.sliderfragmenttabs.R;


public class FragmentRegistro extends Fragment {


    public FragmentRegistro() {
        // Required empty public constructor
    }

    String[] ItemsUnidadMedia = {"Seleccionar Unidad de Medida:", "Kilogramo", "Hora",
            "Caja", "Jaba", "Atado", "Pote", "Saco", "Aves", "Sin Unidad",};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment_registro, container, false);
        View view = inflater.inflate(R.layout.fragment_fragment_registro, container, false);
        Spinner logAs = (Spinner) view.findViewById(R.id.nice_spinner);
       ArrayAdapter dataAdapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_spinner_item, ItemsUnidadMedia);
       // dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        logAs.setAdapter(dataAdapter);

        return view;
    }


}

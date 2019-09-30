package com.example.sliderfragmenttabs.fragment;

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

    String[] ItemsUnidadMedia = { "Kilogramo", "Hora",
            "Caja", "Jaba", "Atado", "Pote", "Saco", "Aves", "Sin Unidad",};

    String[] ItemsTurno = {"Mañana","Tarde","Noche"};
    String[] ItemsClase = {"Campo","Planta","Piura","Empleado"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_registro, container, false);
         Spinner spMedida = (Spinner) view.findViewById(R.id.spMedida);
         ArrayAdapter dataAdapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_spinner_item, ItemsUnidadMedia);
         spMedida.setAdapter(dataAdapter);

         Spinner spTurno =(Spinner)view.findViewById(R.id.spTurno);
         ArrayAdapter arrayAdapter = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_item,ItemsTurno);
         spTurno.setAdapter(arrayAdapter);

        Spinner spClase =(Spinner)view.findViewById(R.id.spClase);
        ArrayAdapter arrayAdapterClase = new ArrayAdapter(view.getContext(),android.R.layout.simple_spinner_item,ItemsClase);
        spClase.setAdapter(arrayAdapterClase);
        return view;
    }


}

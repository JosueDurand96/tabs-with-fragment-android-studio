package com.example.sliderfragmenttabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.sliderfragmenttabs.adapter.ViewPagerAdapter;
import com.example.sliderfragmenttabs.fragment.FragmentDefinicion;
import com.example.sliderfragmenttabs.fragment.FragmentEmpleados;
import com.example.sliderfragmenttabs.fragment.FragmentOpciones;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);

        addTabs(viewPager);
        ((TabLayout) findViewById(R.id.tabLayout)).setupWithViewPager( viewPager );
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentDefinicion(), "DEFINICIÓN");
        adapter.addFrag(new FragmentOpciones(), "OPCIONES");
        adapter.addFrag(new FragmentEmpleados(), "EMPLEADO");
        viewPager.setAdapter(adapter);
    }
}

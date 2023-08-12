package com.example.tugasuasmahesaa.ui.info;
//Mahesa Helvetica Roman 10120152 IF-4

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tugasuasmahesaa.R;

public class InfoFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_info_fragment1, container, false);
        return rootView;
    }
}
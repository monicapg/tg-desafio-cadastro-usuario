package com.example.desafio_thomas_greg.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.desafio_thomas_greg.R;
import com.example.desafio_thomas_greg.databinding.FragmentHomeScreenBinding;
import com.example.desafio_thomas_greg.databinding.FragmentLayoutListBinding;


public class HomeScreenFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentHomeScreenBinding bind = FragmentHomeScreenBinding.inflate(
                inflater,
                container,
                false
        );
//        Button button = bind.btnMain;
//        Intent intent = new Intent(button.setOnClickListener();, UserListFragment.class)
//        button.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View view) {
//                                          setContentView(R.layout.fragment_layout_list);
//                                      }
//                                  }
//        );
        return inflater.inflate(R.layout.fragment_home_screen, container, false);
    }
}





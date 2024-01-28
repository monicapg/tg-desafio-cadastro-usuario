package com.example.desafio_thomas_greg.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafio_thomas_greg.R;
import com.example.desafio_thomas_greg.databinding.FragmentLayoutListBinding;
import com.example.desafio_thomas_greg.model.UserItem;
import com.example.desafio_thomas_greg.ui.adapter.UserListAdapter;
import com.example.desafio_thomas_greg.databinding.LayoutListBinding;

import java.util.ArrayList;

public class UserListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.layout_list, container, false);
        Log.d("T", "alow");
        FragmentLayoutListBinding binding = FragmentLayoutListBinding.inflate(
                inflater,
                container,
                false
        );

        ArrayList<UserItem> mockList = new ArrayList<>();
        mockList.add(new UserItem(1, "Maria da Penha"));
        mockList.add(new UserItem(3, "José da Penha"));
//        Toast.makeText(getContext(), mockList.size(), Toast.LENGTH_SHORT).show();
        UserListAdapter adapter = new UserListAdapter(mockList);

        //Inicializar o adapter
        //CustomAdapter adapter = new CustomAdapter(requireContext(), R.layout.item_listview, itemList);

        //Configurar ListView
        RecyclerView list = binding.listView;
        list.setAdapter(adapter);
        return binding.getRoot();
    }

}

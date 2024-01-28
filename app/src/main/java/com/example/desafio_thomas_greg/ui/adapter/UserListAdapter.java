package com.example.desafio_thomas_greg.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafio_thomas_greg.databinding.ActivityUserListItemBinding;
import com.example.desafio_thomas_greg.databinding.LayoutListBinding;
import com.example.desafio_thomas_greg.model.UserItem;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserListViewHolder(ActivityUserListItemBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        ));
//                LayoutListBinding.inflate(
//                LayoutInflater.from(parent.getContext()),
//                parent,
//                false
//                ));
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        holder.bind(userList.get(position));
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserListViewHolder extends RecyclerView.ViewHolder {
        private ActivityUserListItemBinding layout;
        public UserListViewHolder(@NonNull ActivityUserListItemBinding layout) {
            super(layout.getRoot());
            this.layout = layout;

        }

        public void bind(UserItem item) {
            layout.textItem.setText(item.getName());
        }
    }
    private final List<UserItem> userList;

    public UserListAdapter(List<UserItem> userList) {
        this.userList = userList;
    }


//
//    @Override
//    public int getCount() {
//        return userList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return userList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = LayoutInflater.from(context).inflate(R.layout.activity_user_list_item, parent, false);
//        }
//        TextView nameView = convertView.findViewById(R.id.textItem);
//        UserItem item = userList.get(position);
//        if (item == null) {
//            nameView.setText("Maria");
//        }
//        Toast.makeText(context, userList.get(position).getName(), Toast.LENGTH_SHORT).show();
//
//        // Criar ação do botão editar
//        // convertView.findById id/btnEdit
//        // A acao dentro do onClickListener vai ter um intent passando o id do user para criar uma tela de edição daquele user.
//
//        return convertView;
//    }

}

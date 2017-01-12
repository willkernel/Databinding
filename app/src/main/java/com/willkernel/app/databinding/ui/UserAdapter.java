package com.willkernel.app.databinding.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.UserBinding;
import com.willkernel.app.databinding.model.User;

import java.util.ArrayList;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    private ArrayList<User> users = new ArrayList<>();

    UserAdapter() {
        users.add(new User("Kimmy", "Lin", 10));
        users.add(new User("Luffy", "Monkey", 18));
        users.add(new User("Nami", "OP", 18));
        users.add(new User("zora", "Knife", 18));
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.user, parent, false);
        return new UserHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        holder.bind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    static class UserHolder extends RecyclerView.ViewHolder {
        private UserBinding mBinding;

        UserHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(User user) {
            mBinding.setUser(user);
        }
    }
}
package com.willkernel.app.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityViewStubBinding;
import com.willkernel.app.databinding.databinding.UserBinding;
import com.willkernel.app.databinding.model.User;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
public class ViewStubActivity extends AppCompatActivity {
    private ActivityViewStubBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_stub);
        binding.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub viewStub, View view) {
                //ViewStub xml 文件名
                UserBinding mBinding = DataBindingUtil.bind(view);
                User user = new User("Chace", "Joy", 20);
                mBinding.setUser(user);
            }
        });
    }

    public void inflateViewStub(View view) {
        if (!binding.viewStub.isInflated()) {
            binding.viewStub.getViewStub().inflate();
        }
    }
}
package com.willkernel.app.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityDynamicBinding;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
public class DynamicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDynamicBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_dynamic);
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(new UserAdapter());
    }
}
package com.willkernel.app.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityIncludeBinding;
import com.willkernel.app.databinding.listener.ClickListener;
import com.willkernel.app.databinding.model.User;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */

public class IncludeActivity extends AppCompatActivity implements ClickListener {
    private ActivityIncludeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        binding.setListener(this);
        binding.setOkText("ok Text");

//        Error:(404, 30) 错误: 找不到符号
//        符号:   方法 setOKText(String)
//                位置: 类型为LayoutBtnOkBinding的变量 mboundView02
//        binding.setOkText("OK Text!");

        binding.layoutInput.etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                User user = new User(editable.toString(), "willkernel", 20);
                binding.setUser(user);
            }
        });
    }

    @Override
    public void onClickOk(View view) {
        Toast.makeText(this, "on click ok!", Toast.LENGTH_SHORT).show();
    }
}
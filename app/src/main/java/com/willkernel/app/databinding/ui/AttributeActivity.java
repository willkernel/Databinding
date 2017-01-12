package com.willkernel.app.databinding.ui;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityAttributeBinding;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
public class AttributeActivity extends AppCompatActivity {
    private ActivityAttributeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_attribute);
        binding.setActivity(this);
        binding.setImageUrl("http://pic.meizitu.com/wp-content/uploads/2015a/10/23/01.jpg");
    }

    public View.OnClickListener imageClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(AttributeActivity.this, "http://pic.meizitu.com/wp-content/uploads/2015a/10/23/01.jpg", Toast.LENGTH_SHORT).show();
        }
    };

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}
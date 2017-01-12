package com.willkernel.app.databinding.ui;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableBoolean;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityConversationBinding;

/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
public class ConversationActivity extends AppCompatActivity {
    private ObservableBoolean mIsError = new ObservableBoolean();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityConversationBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_conversation);
        mIsError.set(true);
        binding.setHeight(100);
        binding.setWidth(200);
        binding.setIsError(mIsError);
    }

    public void toggle(View view) {
        mIsError.set(!mIsError.get());
    }

    @BindingConversion
    public static ColorDrawable convert(int color) {
        return new ColorDrawable(color);
    }

    @BindingAdapter("height")//bind adapter
    public static void setH(View view, float height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.height = (int) height;
        view.setLayoutParams(params);
    }

    @BindingAdapter("width")
    public static void setW(View view,float width) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = (int) width;
        view.setLayoutParams(params);
    }

    /** !!! Binding conversion should be forbidden, otherwise it will conflict with
     *  {@code android:visiblity} attribute.
     */
    /*
    @BindingConversion
    public static int convertColorToString(int color) {
        switch (color) {
            case Color.RED:
                return R.string.red;
            case Color.WHITE:
                return R.string.white;
        }
        return R.string.app_name;
    }*/
}

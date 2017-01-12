package com.willkernel.app.databinding.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityMainBinding;
import com.willkernel.app.databinding.model.User;

public class MainActivity extends AppCompatActivity {
    private ObservableArrayMap<String, Object> mapUser = new ObservableArrayMap<>();
    private User user = new User();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMainBinding 根据activity_main 布局文件名生成
        //如果提示程序包.databinding不存在,布局文件有问题
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setData(null);
        binding.setUser(user);
        //xml 中<data> 导入ObservableMap 设置variable name="mapUser" type="ObservableMap&lt;String, Object>" 然后在<LinearLayout 中binding mapUser,这样才能databinding
        binding.setMapUser(mapUser);
    }

    //event handling ,set View property onClick="clearData" and create public method named with clearData
    public void clearData(View view) {
        user.setFirstName("");
        user.setLastName("");
        user.setAge(0);
        mapUser.put("Name1", "");
        mapUser.put("Name2", "");
        mapUser.put("age", 0);
//        mapUser.clear();throw NPE
    }

    public void setData(View view) {
        user.setFirstName("Chace");
        user.setLastName("Joy");
        user.setAge(18);

        mapUser.put("Name1", "Chace");
        mapUser.put("Name2", "Joy");
        mapUser.put("age", 18);

        //Resources
        binding.setLarge(true);

        binding.setFirstName("Chace");
        binding.setLastName("Joy");
        binding.setAppleCount(2);//1
        binding.setPineappleCount(10);
    }

    public void jump2i(View view) {
        startActivity(new Intent(this, IncludeActivity.class));
    }
    public void jump2c(View view) {
        startActivity(new Intent(this, CollectionActivity.class));
    }
    public void jump2v(View view) {
        startActivity(new Intent(this, ViewStubActivity.class));
    }
    public void jump2d(View view) {
        startActivity(new Intent(this, DynamicActivity.class));
    }
    public void jump2a(View view) {
        startActivity(new Intent(this, AttributeActivity.class));
    }
    public void jump2conversation(View view) {
        startActivity(new Intent(this, ConversationActivity.class));
    }
}
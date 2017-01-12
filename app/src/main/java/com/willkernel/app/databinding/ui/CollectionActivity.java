package com.willkernel.app.databinding.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;

import com.willkernel.app.databinding.R;
import com.willkernel.app.databinding.databinding.ActivityCollectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by willkernel on 2017/1/12.
 * mail:willkerneljc@gmail.com
 */
public class CollectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollectionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);
        binding.setIndex(1);//获取集合中index的值 0 -> Data1,data1,map1
        binding.setKey("lastName");
        //noinspection Convert2Diamond
        ArrayList list = new ArrayList<String>();
        list.add("Data1");
        list.add("Data2");
        binding.setList(list);

        SparseArray<String> sparse = new SparseArray<>(2);
        sparse.put(0, "data1");
        sparse.put(1, "data2");
        binding.setSparse(sparse);

        Map<String, String> map = new HashMap<>();
        map.put("firstName", "map1");
        map.put("lastName", "map2");
        binding.setMap(map);
    }
}
package com.example.jh.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private List<Integer> mdatas = new ArrayList<>();
    private MyAdapter myadapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        initData();
        myadapter = new MyAdapter(this, mdatas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);


        Log.e(TAG, "mdatas.size() = " + mdatas.size());
        recyclerView.scrollToPosition(mdatas.size() - 8);
    }

    private void initData() {
        mdatas = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
//            mDatas.add("" + i); // 输出65-89；
            mdatas.add(10); // 输出A-Z
        }

    }
}

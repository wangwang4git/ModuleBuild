package com.qianmi.ordermanager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// 依赖base组件
import com.qianmi.baselibrary.BaseActivity;
// 依赖order组件
import com.qianmi.small.orderlibrary.OrderActivity;


public class OrderTestActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.btnTestJump).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderTestActivity.this, OrderActivity.class));
            }
        });

    }

}

package com.aliletter.demo_briefness;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.aliletter.briefness.BindClass;
import com.aliletter.briefness.BindClick;
import com.aliletter.briefness.BindField;
import com.aliletter.briefness.BindLayout;
import com.aliletter.briefness.BindView;
import com.aliletter.briefness.Briefness;

import java.util.HashMap;
import java.util.Map;


@BindClass(clazz = {"com.aliletter.demo_briefness.Message", "com.aliletter.demo_briefness.Entity"},
        name = {"map", "entity"})
@BindLayout(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @BindField(name = "entity", field = "username", method = "setText")
    @BindView(R.id.tv_test)
    TextView tv_test;

    @BindField(name = "map", field = "name", alias = "okhttp")
    @BindView(R.id.tv_test1)
    TextView tv_test1;


    @BindClick({R.id.tv_test, R.id.tv_test1})
    public void onClick(View v) {
        if (v.getId() == R.id.tv_test) {
            Briefness.bind(this, new Message("123", "321", "okhttp"));

            Toast.makeText(MainActivity.this, "TEST ONE", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "TEST TWO", Toast.LENGTH_SHORT).show();
        }
    }


}
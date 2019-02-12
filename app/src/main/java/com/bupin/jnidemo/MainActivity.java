package com.bupin.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.bt1);
        Button bt2 = findViewById(R.id.bt2);
        Button bt3 = findViewById(R.id.bt3);
        Button bt4 = findViewById(R.id.bt4);
        Button bt5 = findViewById(R.id.bt5);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                JniUtil.getInstance().helloFromC();
                break;
            case R.id.bt2:
                int sum = JniUtil.getInstance().testInt(1, 2);
                Log.d(TAG, "onClick: sum="+sum);
                break;
            case R.id.bt3:
                boolean b = JniUtil.getInstance().testBoolean(true);
                Log.d(TAG, "onClick: b="+b);

                break;
            case R.id.bt4:
                String string = JniUtil.getInstance().testString("hello", "world");
                Log.d(TAG, "onClick: string:"+string);
                break;
            case R.id.bt5:
               JniUtil.getInstance().testArray(new int[]{1,2,3,4,5,6});
                break;
        }
    }
}

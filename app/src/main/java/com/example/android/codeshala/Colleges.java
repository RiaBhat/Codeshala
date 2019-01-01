package com.example.android.codeshala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Colleges extends AppCompatActivity {
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);
        t1=(TextView)findViewById(R.id.a1);
        t2=(TextView)findViewById(R.id.a2);
        t3=(TextView)findViewById(R.id.a3);
    }
}

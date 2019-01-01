package com.example.android.codeshala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mentors extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);
        t1=(TextView)findViewById(R.id.c1);
        t2=(TextView)findViewById(R.id.c2);
        t3=(TextView)findViewById(R.id.c3);
        t4=(TextView)findViewById(R.id.c4);
        t5=(TextView)findViewById(R.id.c5);
        t6=(TextView)findViewById(R.id.c6);
        t7=(TextView)findViewById(R.id.c7);
        t8=(TextView)findViewById(R.id.c8);
        t9=(TextView)findViewById(R.id.c9);
        t10=(TextView)findViewById(R.id.c10);

    }
}

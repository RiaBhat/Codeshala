package com.example.android.codeshala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class Placements extends AppCompatActivity {
    //private RecyclerView recyclerView;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11;
    //ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placements);
        //recyclerView=findViewById(R.id.recyclerView);
        t1=(TextView)findViewById(R.id.T1);
        t2=(TextView)findViewById(R.id.a1);
        t3=(TextView)findViewById(R.id.a2);
        t4=(TextView)findViewById(R.id.a3);
        t5=(TextView)findViewById(R.id.a4);
        t6=(TextView)findViewById(R.id.a5);
        t7=(TextView)findViewById(R.id.a6);
        t8=(TextView)findViewById(R.id.a7);
        t9=(TextView)findViewById(R.id.a8);
        //t10=(TextView)findViewById(R.id.b1);
        T1=(TextView)findViewById(R.id.b1);
        T2=(TextView)findViewById(R.id.b2);
        T3=(TextView)findViewById(R.id.b3);
        T4=(TextView)findViewById(R.id.b4);
        T5=(TextView)findViewById(R.id.b5);
        T6=(TextView)findViewById(R.id.b6);
        T7=(TextView)findViewById(R.id.b7);
        T8=(TextView)findViewById(R.id.b8);
        T9=(TextView)findViewById(R.id.b9);
        T10=(TextView)findViewById(R.id.b10);
        T11=(TextView)findViewById(R.id.b11);
    }
}

package com.example.android.codeshala;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Competetive extends AppCompatActivity {

    private TextView TV1,TV2,TV3,TV4,TV5,TV6,TV7,TV8,TV9,TV10,TV11,TV12;
    private ListView list1,list2,list3,list4,list5,list6,list7,list8;
    private ArrayList<String> updates1 = new ArrayList<>();
    private ArrayList<String> updates2 = new ArrayList<>();
    private ArrayList<String> updates3 = new ArrayList<>();
    private ArrayList<String> updates4 = new ArrayList<>();
    private ArrayList<String> updates5 = new ArrayList<>();
    private ArrayList<String> updates6 = new ArrayList<>();
    private ArrayList<String> updates7 = new ArrayList<>();
    private ArrayList<String> updates8 = new ArrayList<>();
    public static final String TAG = "riaria";
    private DatabaseReference mDatabase1,mDatabase2,mDatabase3,mDatabase4,mDatabase5,mDatabase6,mDatabase7,mDatabase8;
    Button link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competetive);
        //declarations
        link=(Button)findViewById(R.id.reg);
        TV1=(TextView)findViewById(R.id.txt1);
        TV2=(TextView)findViewById(R.id.txt2);
        TV3=(TextView)findViewById(R.id.txt3);
        TV4=(TextView)findViewById(R.id.txt4);
        TV5=(TextView)findViewById(R.id.txt5);
        TV6=(TextView)findViewById(R.id.txt6);
        TV7=(TextView)findViewById(R.id.txt7);
        TV8=(TextView)findViewById(R.id.txt8);
        TV9=(TextView)findViewById(R.id.txt9);
        TV10=(TextView)findViewById(R.id.txt10);
        TV11=(TextView)findViewById(R.id.txt11);
        TV12=(TextView)findViewById(R.id.txt12);
        list1=(ListView)findViewById(R.id.lst1);
        list2=(ListView)findViewById(R.id.lst2);
        list3=(ListView)findViewById(R.id.lst3);
        list4=(ListView)findViewById(R.id.lst4);
        list5=(ListView)findViewById(R.id.lst5);
        list6=(ListView)findViewById(R.id.lst6);
        list7=(ListView)findViewById(R.id.lst7);
        list8=(ListView)findViewById(R.id.lst8);

        // for 1st list
        final ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates1);
        list1.setAdapter(arrayAdapter);
        //Database code for 1st
        mDatabase1= FirebaseDatabase.getInstance().getReference().child("ITP").child("Session Details");
        mDatabase1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates1.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates1.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter.notifyDataSetChanged();

                //Toast.makeText(Competetive.this,
                  //      "list loading", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });

        // for 2nd list
        final ArrayAdapter<String> arrayAdapter2= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates2);
        list2.setAdapter(arrayAdapter2);
        //Database code for 2nd
        mDatabase2= FirebaseDatabase.getInstance().getReference().child("ITP").child("Syllabus");
        mDatabase2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates2.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates2.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter2.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 3rd list
        final ArrayAdapter<String> arrayAdapter3= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates3);
        list3.setAdapter(arrayAdapter3);
        //Database code for 3rd
        mDatabase3= FirebaseDatabase.getInstance().getReference().child("DA1").child("Session Details");
        mDatabase3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates3.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates3.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter3.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 4th list
        final ArrayAdapter<String> arrayAdapter4= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates4);
        list4.setAdapter(arrayAdapter4);
        //Database code for 4th
        mDatabase4= FirebaseDatabase.getInstance().getReference().child("DA1").child("Syllabus");
        mDatabase4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates4.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates4.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter4.notifyDataSetChanged();



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 5th list
        final ArrayAdapter<String> arrayAdapter5= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates5);
        list5.setAdapter(arrayAdapter5);
        //Database code for 5th
        mDatabase5= FirebaseDatabase.getInstance().getReference().child("DA2").child("Session Details");
        mDatabase5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates5.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates5.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter5.notifyDataSetChanged();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 6t list
        final ArrayAdapter<String> arrayAdapter6= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates6);
        list6.setAdapter(arrayAdapter6);
        //Database code for 6th
        mDatabase6= FirebaseDatabase.getInstance().getReference().child("DA2").child("Syllabus");
        mDatabase6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates6.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates6.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter6.notifyDataSetChanged();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 7th list
        final ArrayAdapter<String> arrayAdapter7= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates7);
        list7.setAdapter(arrayAdapter7);
        //Database code for 7th
        mDatabase7= FirebaseDatabase.getInstance().getReference().child("Placement Prep").child("Session Details");
        mDatabase7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates7.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates7.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter7.notifyDataSetChanged();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for 8th list
        final ArrayAdapter<String> arrayAdapter8= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates8);
        list8.setAdapter(arrayAdapter8);
        //Database code for 8th
        mDatabase8= FirebaseDatabase.getInstance().getReference().child("Placement Prep").child("Syllabus");
        mDatabase8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates8.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates8.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter8.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(Competetive.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });
        // for the registeration(clicking the button)
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeROwnIsiTdYaYm8EoOpBzwIItr8626S8-_0tOpKResHfCWAQ/viewform?usp=pp_url"));
                startActivity(myWebLink);
            }
        });
    }
}

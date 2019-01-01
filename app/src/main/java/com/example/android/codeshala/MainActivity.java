package com.example.android.codeshala;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener{

    private TextView TV;
    private ListView list;
    private ArrayList<String> updates = new ArrayList<>();
    public static final String TAG = "riaria";

    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declarations
        TV=(TextView)findViewById(R.id.textView2);
        list=(ListView)findViewById(R.id.lst);
        final ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, updates);
        list.setAdapter(arrayAdapter);

        //Database code
        mDatabase= FirebaseDatabase.getInstance().getReference().child("announcements");


           //mDatabase=mDatabase;
        /*mDatabase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                //String value = dataSnapshot.getValue(String.class);
                String value = dataSnapshot.getValue().toString();
                updates.add(value);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });*/

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.d(TAG, dataSnapshot.toString());
                updates.clear();
                for(DataSnapshot child: dataSnapshot.getChildren()){
                    String value = child.getValue(String.class);
                    updates.add(value);
                    Log.d(TAG, "Value is: " + value);
                }
                arrayAdapter.notifyDataSetChanged();

                Toast.makeText(MainActivity.this,
                        "list loading", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                //Toast.makeText(getApplicationContext(),"Some error occured", Toast.LENGTH_SHORT); );
                Toast.makeText(MainActivity.this,
                        "Some error occured(Connection lost)", Toast.LENGTH_SHORT).show();
                Log.w(TAG, "Failed to read value.");// error.toException());
            }
        });

        // sign out code
        Button signOutButton = findViewById(R.id.sign_out_button);
        final GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        final GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(MainActivity.this)
                .enableAutoManage(MainActivity.this /* FragmentActivity */, MainActivity.this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
                        new ResultCallback<Status>() {
                            @Override
                            public void onResult(@NonNull Status status) {
                                startActivity(new Intent(MainActivity.this, Login.class));
                                finish();
                            }
                        });
            }
        });
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.option1:
            {
                Intent i = new Intent(MainActivity.this,Mentors.class);
                startActivity(i);
                return true;
            }
            case R.id.option2:
            {
                Intent i = new Intent(MainActivity.this,Placements.class);
                startActivity(i);
                return true;
            }
            case R.id.option3:
            {
                Intent i = new Intent(MainActivity.this,Colleges.class);
                startActivity(i);
                return true;
            }
            case R.id.subitem1:
            {
                Intent i = new Intent(MainActivity.this,Competetive.class);
                startActivity(i);
                return true;
            }
            case R.id.subitem2:
            {
                Intent i = new Intent(MainActivity.this,Development.class);
                startActivity(i);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

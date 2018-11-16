package com.example.android.codeshala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.google.android.gms.signin.SignIn;
import com.google.firebase.auth.FirebaseAuth;

public class Splash extends AppCompatActivity {

    ImageView Front,Back;
    Button next;
    private FirebaseAuth mAuth;

    public void Fade(View view)
    {
        Front=(ImageView)findViewById(R.id.front);
        Back=(ImageView)findViewById(R.id.back);
        next=(Button)findViewById(R.id.button);
        //fading out
        Back.animate().alpha(0f).setDuration(2000);
        //fading in
        Front.animate().alpha(1f).setDuration(2000);
        next.animate().alpha(1f).setDuration(2000);
        //clearing screen
        //Front.animate().alpha(0f).setDuration(2000);
        // moving towards next activity

        //Intent i = new Intent(Splash.this, Login.class);
        //startActivity(i);
    }
    public void Transition(View view)
    {
        Intent i = new Intent(Splash.this, Login.class);
        startActivity(i);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mAuth = FirebaseAuth.getInstance();

        if(mAuth.getCurrentUser()!=null)
        {
            finish();
            Intent i = new Intent(Splash.this,MainActivity.class);
            startActivity(i);
        }
    }
}

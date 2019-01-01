package com.example.android.codeshala;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

//import com.google.android.gms.signin.SignIn;
import com.google.firebase.auth.FirebaseAuth;

public class Splash extends AppCompatActivity {

    ImageView Front;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        setContentView(R.layout.activity_splash);

        /*new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);
                finish();
            }
        }, 5000);*/
        mAuth = FirebaseAuth.getInstance();

        if(mAuth.getCurrentUser()!=null)
        {
            finish();
            Intent i = new Intent(Splash.this,MainActivity.class);
            startActivity(i);
        }
        else {
            finish();
            Intent i = new Intent(Splash.this,Login.class);
            startActivity(i);
        }
    }
}

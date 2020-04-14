package com.example.lms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button login,signup;
    TextView t;
    ProgressBar progressBar;

    //For now we are using fixed id and pass

    CustomExceptions ce=new CustomExceptions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        t=findViewById(R.id.warning);
        progressBar=findViewById(R.id.progress);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String password=pass.getText().toString();
                String email=user.getText().toString();
                if(email.isEmpty() || password.isEmpty())
                {
                    progressBar.setVisibility(View.GONE);
                    user.setError("Provide Email");
                    pass.setError("Provide Password");
                }

                else
                {
                    FirebaseAuth mAuth=FirebaseAuth.getInstance();
                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                progressBar.setVisibility(View.GONE);
                                Intent i=new Intent(MainActivity.this,UserHome2.class);
                                startActivity(i);
                            }
                            else
                            {
                                progressBar.setVisibility(View.GONE);
                                Toast.makeText(MainActivity.this,"Failed to login",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }



            }
        });
        signup=findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText("");
                user.setText("");
                pass.setText("");
                Intent i=new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
            }
        });

    }
    public void userLogin()
    {


    }
}
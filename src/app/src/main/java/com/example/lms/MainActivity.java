package com.example.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button login;
    TextView t;

    //For now we are using fixed id and pass

    final  String orginal_user="user";
    final  String original_pass="1234";
    CustomExceptions ce=new CustomExceptions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        t=findViewById(R.id.warning);

        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String str_pass=pass.getText().toString();
                String str_user=user.getText().toString();


                if(str_user.equals(orginal_user) && str_pass.equals(original_pass))
                {
                        t.setText("");
                        Intent i=new Intent(MainActivity.this,UserHome2.class);
                        startActivity(i);

                }

                if(orginal_user!=str_user)
                {

                    t.setText("(Invalid user or pass)");
                    user.setText("");
                    pass.setText("");
                }

            }
        });

    }
}
package com.example.rajayambigms.classiclogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText email;
    EditText pwd;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = (EditText)findViewById(R.id.editText);
        pwd = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.loginBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!email.getText().toString().isEmpty() && !pwd.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Error Data",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}

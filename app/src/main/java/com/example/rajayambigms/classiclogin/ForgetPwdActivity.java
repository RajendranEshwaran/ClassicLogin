package com.example.rajayambigms.classiclogin;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgetPwdActivity extends AppCompatActivity {

    EditText userTxt;
    Button resetBtn;
    TextView hintTxt;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pwd);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Forget Password");

        handler = new Handler();
        userTxt = (EditText)findViewById(R.id.forgetUserTxt);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        hintTxt = (TextView)findViewById(R.id.hintTxt);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!userTxt.getText().toString().isEmpty())
                {
                    hintTxt.setVisibility(View.VISIBLE);

                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hintTxt.setVisibility(View.GONE);

                        }
                    },3000);

                }
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

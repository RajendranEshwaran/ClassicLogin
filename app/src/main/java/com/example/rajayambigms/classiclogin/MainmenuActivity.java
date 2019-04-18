package com.example.rajayambigms.classiclogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainmenuActivity extends AppCompatActivity {

    ImageView profile,chat, orders,phar,note,card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);


        card = (ImageView)findViewById(R.id.cardImg);
        profile = (ImageView)findViewById(R.id.profileImg);
        chat = (ImageView)findViewById(R.id.chatImg);
        orders = (ImageView)findViewById(R.id.ordersImg);
        phar = (ImageView)findViewById(R.id.pharImg);
        note = (ImageView)findViewById(R.id.noteImg);

    }


    public void setCardClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Card Page",Toast.LENGTH_SHORT).show();
    }
    public void setChatClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Chat Page",Toast.LENGTH_SHORT).show();
    }
    public void setProfieClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Profile Page",Toast.LENGTH_SHORT).show();
    }
    public void setOrdersClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Orders Page",Toast.LENGTH_SHORT).show();
    }
    public void setNoteClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Note Page",Toast.LENGTH_SHORT).show();
    }
    public void setPharClick(View card) {
        Toast.makeText(getApplicationContext(),"Welcome Pharmacy Page",Toast.LENGTH_SHORT).show();
    }
}

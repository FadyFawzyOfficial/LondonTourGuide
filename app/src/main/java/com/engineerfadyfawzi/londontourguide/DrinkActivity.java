package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_category );
        
        getSupportFragmentManager().beginTransaction()
                .replace( R.id.container, new DrinkFragment() )
                .commit();
    }
}
package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EatActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_category );
        
        getSupportFragmentManager().beginTransaction()
                .replace( R.id.container, new EatFragment() )
                .commit();
    }
}

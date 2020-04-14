package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_full_screen );
        
        Intent fullScreenIntent = getIntent();
        
        int placeNameId = fullScreenIntent.getIntExtra( "PlaceNameId", 0 );
        
        getSupportActionBar().setTitle( placeNameId );
        
        int placeImageId = fullScreenIntent.getIntExtra( "PlaceImageId", 0 );
        
        ImageView fullImage = findViewById( R.id.full_image );
        
        fullImage.setImageResource( placeImageId );
    }
}

package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        
        // Find the View that shows the stay category
        TextView stay = findViewById( R.id.stay );
        
        // Set a click listener on that View
        stay.setOnClickListener( new View.OnClickListener()
        {
            // The code in this method will be executed when the stay View is clicked on
            @Override
            public void onClick( View view )
            {
                // Create a new intent to open the {@link StayActivity}
                Intent stayIntent = new Intent( MainActivity.this, StayActivity.class );
                // Start the new activity
                startActivity( stayIntent );
            }
        } );
    
        // Find the View that shows the eat category
        TextView eat = findViewById( R.id.eat );
    
        // Set a click listener on that View
        eat.setOnClickListener( new View.OnClickListener()
        {
            // The code in this method will be executed when the eat View is clicked on
            @Override
            public void onClick( View view )
            {
                // Create a new intent to open the {@link EatActivity}
                Intent eatIntent = new Intent( MainActivity.this, EatActivity.class );
                // Start the new activity
                startActivity( eatIntent );
            }
        } );
    
        // Find the View that shows the drink category
        TextView drink = findViewById( R.id.drink );
    
        // Set a click listener on that View
        drink.setOnClickListener( new View.OnClickListener()
        {
            // The code in this method will be executed when the drink View is clicked on
            @Override
            public void onClick( View view )
            {
                // Create a new intent to open the {@link DrinkActivity}
                Intent drinkIntent = new Intent( MainActivity.this, DrinkActivity.class );
                // Start the new activity
                startActivity( drinkIntent );
            }
        } );
    
        // Find the View that shows the to do category
        TextView todo = findViewById( R.id.todo );
    
        // Set a click listener on that View
        todo.setOnClickListener( new View.OnClickListener()
        {
            // The code in this method will be executed when the to do View is clicked on
            @Override
            public void onClick( View view )
            {
                // Create a new intent to open the {@link TodoActivity}
                Intent todoIntent = new Intent( MainActivity.this, TodoActivity.class );
                // Start the new activity
                startActivity( todoIntent );
            }
        } );
    
        // Find the View that shows the shop category
        TextView shop = findViewById( R.id.shop );
    
        // Set a click listener on that View
        shop.setOnClickListener( new View.OnClickListener()
        {
            // The code in this method will be executed when the shop View is clicked on
            @Override
            public void onClick( View view )
            {
                // Create a new intent to open the {@link ShopActivity}
                Intent shopIntent = new Intent( MainActivity.this, ShopActivity.class );
                // Start the new activity
                startActivity( shopIntent );
            }
        } );
    }
}
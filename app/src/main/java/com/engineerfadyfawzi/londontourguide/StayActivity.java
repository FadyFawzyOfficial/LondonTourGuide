package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StayActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.place_list );
        
        // Create an ArrayList of Place objects
        ArrayList< Place > places = new ArrayList< Place >();
        places.add( new Place( R.mipmap.test, R.string.stay_name_one, R.string.stay_location_one,
                R.string.stay_website_one, R.string.stay_phone_one ) );
        places.add( new Place( R.mipmap.test, R.string.stay_name_one, R.string.stay_location_one,
                R.string.stay_website_one, R.string.stay_phone_one ) );
        places.add( new Place( R.mipmap.test, R.string.stay_name_one, R.string.stay_location_one,
                R.string.stay_website_one, R.string.stay_phone_one ) );
        places.add( new Place( R.mipmap.test, R.string.stay_name_one, R.string.stay_location_one,
                R.string.stay_website_one, R.string.stay_phone_one ) );
        places.add( new Place( R.mipmap.test, R.string.stay_name_one, R.string.stay_location_one,
                R.string.stay_website_one, R.string.stay_phone_one ) );
        
        // Create an {@link PlaceAdapter}, whose data source is a list of
        // {@link Place}s. The adapter knows how to create list item views
        // for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter( this, places );
        
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById( R.id.list_view );
        listView.setAdapter( placeAdapter );
    }
}

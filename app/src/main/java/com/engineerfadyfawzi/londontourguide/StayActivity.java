package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        final PlaceAdapter placeAdapter = new PlaceAdapter( this, places, R.color.category_stay );
        
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById( R.id.list_view );
        listView.setAdapter( placeAdapter );
        
        // Set an item click listener on the ListView, which sends an intent to a web browser
        // to open a website which is owned by the selected place.
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick( AdapterView< ? > adapterView, View view, int position, long l )
            {
                // Find the current place that was clicked
                Place currentPlace = placeAdapter.getItem( position );
                
                // Convert the String URL (website) into a URI object (to pass into the Intent constructor)
                Uri placeUri = Uri.parse( getString( currentPlace.getPlaceWebsiteId() ) );
                
                // Create a new intent to view the place URI
                Intent websiteIntent = new Intent( Intent.ACTION_VIEW, placeUri );
                
                // Send the intent to launch a new activity
                startActivity( websiteIntent );
            }
        } );
    }
}

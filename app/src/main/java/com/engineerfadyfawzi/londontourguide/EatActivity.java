package com.engineerfadyfawzi.londontourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.place_list );
    
        // Create an ArrayList of Place objects
        ArrayList< Place > places = new ArrayList< Place >();
        places.add( new Place( R.mipmap.eat_image_one, R.string.eat_name_one, R.string.eat_location_one,
                R.string.eat_website_one, R.string.eat_phone_one ) );
        places.add( new Place( R.mipmap.eat_image_two, R.string.eat_name_two, R.string.eat_location_two,
                R.string.eat_website_two, R.string.eat_phone_two ) );
        places.add( new Place( R.mipmap.eat_image_three, R.string.eat_name_three, R.string.eat_location_three,
                R.string.eat_website_three, R.string.eat_phone_three ) );
        places.add( new Place( R.mipmap.eat_image_four, R.string.eat_name_four, R.string.eat_location_four,
                R.string.eat_website_four, R.string.eat_phone_four ) );
        places.add( new Place( R.mipmap.eat_image_five, R.string.eat_name_five, R.string.eat_location_five,
                R.string.eat_website_five, R.string.eat_phone_five ) );
        places.add( new Place( R.mipmap.eat_image_six, R.string.eat_name_six, R.string.eat_location_six,
                R.string.eat_website_six, R.string.eat_phone_six ) );
        places.add( new Place( R.mipmap.eat_image_seven, R.string.eat_name_seven, R.string.eat_location_seven,
                R.string.eat_website_seven, R.string.eat_phone_seven ) );
        places.add( new Place( R.mipmap.eat_image_eight, R.string.eat_name_eight, R.string.eat_location_eight,
                R.string.eat_website_eight, R.string.eat_phone_eight ) );
        places.add( new Place( R.mipmap.eat_image_nine, R.string.eat_name_nine, R.string.eat_location_nine,
                R.string.eat_website_nine, R.string.eat_phone_nine ) );
        places.add( new Place( R.mipmap.eat_image_ten, R.string.eat_name_ten, R.string.eat_location_ten,
                R.string.eat_website_ten, R.string.eat_phone_ten ) );
    
        // Create an {@link PlaceAdapter}, whose data source is a list of
        // {@link Place}s. The adapter knows how to create list item views
        // for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter( this, places, R.color.category_eat );
    
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById( R.id.list_view );
        listView.setAdapter( placeAdapter );
    }
}

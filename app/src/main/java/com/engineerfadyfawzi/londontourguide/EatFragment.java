package com.engineerfadyfawzi.londontourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of eat {@link Place} objects.
 */
public class EatFragment extends Fragment
{
    public EatFragment()
    {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState )
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.place_list, container, false );
        
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
        PlaceAdapter placeAdapter = new PlaceAdapter( getActivity(), places, R.color.category_eat );
        
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById( R.id.list_view );
        listView.setAdapter( placeAdapter );
        
        return rootView;
    }
}
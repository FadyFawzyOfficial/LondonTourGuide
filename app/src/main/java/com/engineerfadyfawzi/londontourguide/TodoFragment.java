package com.engineerfadyfawzi.londontourguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of to do (What to do) {@link Place} objects.
 */
public class TodoFragment extends Fragment
{
    public TodoFragment()
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
        places.add( new Place( R.mipmap.todo_image_one, R.string.todo_name_one, R.string.todo_location_one,
                R.string.todo_website_one, R.string.todo_phone_one ) );
        places.add( new Place( R.mipmap.todo_image_two, R.string.todo_name_two, R.string.todo_location_two,
                R.string.todo_website_two, R.string.todo_phone_two ) );
        places.add( new Place( R.mipmap.todo_image_three, R.string.todo_name_three, R.string.todo_location_three,
                R.string.todo_website_three, R.string.todo_phone_three ) );
        places.add( new Place( R.mipmap.todo_image_four, R.string.todo_name_four, R.string.todo_location_four,
                R.string.todo_website_four, R.string.todo_phone_four ) );
        places.add( new Place( R.mipmap.todo_image_five, R.string.todo_name_five, R.string.todo_location_five,
                R.string.todo_website_five, R.string.todo_phone_five ) );
        places.add( new Place( R.mipmap.todo_image_six, R.string.todo_name_six, R.string.todo_location_six,
                R.string.todo_website_six, R.string.todo_phone_six ) );
        places.add( new Place( R.mipmap.todo_image_seven, R.string.todo_name_seven, R.string.todo_location_seven,
                R.string.todo_website_seven, R.string.todo_phone_seven ) );
        places.add( new Place( R.mipmap.todo_image_eight, R.string.todo_name_eight, R.string.todo_location_eight,
                R.string.todo_website_eight, R.string.todo_phone_eight ) );
        places.add( new Place( R.mipmap.todo_image_nine, R.string.todo_name_nine, R.string.todo_location_nine,
                R.string.todo_website_nine, R.string.todo_phone_nine ) );
        places.add( new Place( R.mipmap.todo_image_ten, R.string.todo_name_ten, R.string.todo_location_ten,
                R.string.todo_website_ten, R.string.todo_phone_ten ) );
        
        // Create an {@link PlaceAdapter}, whose data source is a list of
        // {@link Place}s. The adapter knows how to create list item views
        // for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter( getActivity(), places, R.color.category_todo );
        
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById( R.id.list_view );
        listView.setAdapter( placeAdapter );
        
        return rootView;
    }
}
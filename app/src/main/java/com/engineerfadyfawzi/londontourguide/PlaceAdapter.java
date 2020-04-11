package com.engineerfadyfawzi.londontourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter< Place >
{
    /**
     * Create a new {@link PlaceAdapter} objcet.
     *
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of Place objects to display in a list.
     */
    public PlaceAdapter( Activity context, ArrayList< Place > places )
    {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super( context, 0, places );
    }
    
    /**
     * Provides a view for an Adapter View( ListView, GridView, etc.)
     *
     * @param position    The positions in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populated.
     * @param parent      The parent ViewGroup that is used for inflation.
     *
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView( int position, View convertView, ViewGroup parent )
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if ( listItemView == null )
            listItemView = LayoutInflater.from( getContext() ).inflate( R.layout.list_item, parent, false );
        
        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem( position );
        
        // Find the TextView in the list_item.xml layout with the ID place_name
        TextView placeName = listItemView.findViewById( R.id.place_name );
        // Get the place name and image resources from the currentPlace object then
        // set this text and image on the TextView
        placeName.setText( currentPlace.getPlaceNameId() );
        placeName.setBackgroundResource( currentPlace.getPlaceImageId() );
        
        // Find the TextView in the list_item.xml layout withe the ID place_location
        TextView placeLocation = listItemView.findViewById( R.id.place_location );
        // Get the place location from the currentPlace object and
        // set this text on the place location TextView
        placeLocation.setText( currentPlace.getPlaceLocationId() );
        
        // Find the TextView in the list_item.xml layout with the ID place_website
        TextView placeWebsite = listItemView.findViewById( R.id.place_website );
        // Get the place website from the currentPlace object and
        // set this text on the place_website TextView
        placeWebsite.setText( currentPlace.getPlaceWebsiteId() );
        
        // Find the TextView in the list_item.xml layout with the ID place_phone
        TextView placePhone = listItemView.findViewById( R.id.place_phone );
        // Get the place phone from the currentPlace object and
        // set this text on the place_phone TextView
        placePhone.setText( currentPlace.getPlacePhoneId() );
        
        // Return the whole list item layout (containing 4 TextView)
        // so that it can be shown in the listView
        return listItemView;
    }
}
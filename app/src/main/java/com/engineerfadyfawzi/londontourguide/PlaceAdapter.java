package com.engineerfadyfawzi.londontourguide;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter< Place >
{
    /**
     * Resource ID for the background color for this list of words
     */
    private int colorResourceId;
    
    /**
     * Modify list item height to equal (=) half of actual screen width (in pixels)
     * which is determined at run time
     */
    private static final int LIST_ITEM_CUSTOM_HEIGHT = getScreenWidthInPixels() / 2;
    
    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context         The current context. Used to inflate the layout file.
     * @param places          A List of Place objects to display in a list.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public PlaceAdapter( Context context, ArrayList< Place > places, int colorResourceId )
    {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super( context, 0, places );
        this.colorResourceId = colorResourceId;
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
        final Place currentPlace = getItem( position );
        
        // Find the TextView in the list_item.xml layout with the ID place_name
        TextView placeName = listItemView.findViewById( R.id.place_name );
        // Get the place name and image resources from the currentPlace object then
        // set this text and image on the TextView
        placeName.setText( currentPlace.getPlaceNameId() );
        placeName.setBackgroundResource( currentPlace.getPlaceImageId() );
        
        // Find the TextView in the list_item.xml layout with the ID place_location
        TextView placeLocation = listItemView.findViewById( R.id.place_location );
        // Get the place location from the currentPlace object and
        // set this text on the place location TextView
        placeLocation.setText( currentPlace.getPlaceLocationId() );
    
        // Find the LinearLayout in the list_item.xml layout with the ID place_location_container
        LinearLayout placeLocationContainer = listItemView.findViewById( R.id.place_location_container );
    
        // Set an click listener on the LinearLayout (place location text view + icon image view), which
        // sends an intent to a maps app to open the location is owned by the selected place.
        placeLocationContainer.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                // Convert the String location into a URI object (to pass into the Intent constructor)
                Uri locationUri = Uri.parse( "geo:0,0?q=" + getContext().getString( currentPlace.getPlaceLocationId() ) );
            
                // Create a new intent to view the place location on Maps app
                Intent locationIntent = new Intent( Intent.ACTION_VIEW, locationUri );
            
                // Send the intent to launch a new activity which will show the location on a map
                getContext().startActivity( locationIntent );
            }
        } );
        
        // Find the TextView in the list_item.xml layout with the ID place_website
        TextView placeWebsite = listItemView.findViewById( R.id.place_website );
        // Get the place website from the currentPlace object and
        // set this text on the place_website TextView
        placeWebsite.setText( currentPlace.getPlaceWebsiteId() );
        
        // Find the LinearLayout in the list_item.xml layout with the ID place_website_container
        LinearLayout placeWebsiteContainer = listItemView.findViewById( R.id.place_website_container );
        
        // Set an click listener on the LinearLayout (place website text view + icon image view), which
        // sends an intent to a web browser to open a website which is owned by the selected place.
        placeWebsiteContainer.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                // Convert the String URL (website) into a URI object (to pass into the Intent constructor)
                Uri placeUri = Uri.parse( getContext().getString( currentPlace.getPlaceWebsiteId() ) );
                
                // Create a new intent to view the place URI
                Intent websiteIntent = new Intent( Intent.ACTION_VIEW, placeUri );
                
                // Send the intent to launch a new activity
                getContext().startActivity( websiteIntent );
            }
        } );
        
        // Find the TextView in the list_item.xml layout with the ID place_phone
        TextView placePhone = listItemView.findViewById( R.id.place_phone );
        // Get the place phone from the currentPlace object and
        // set this text on the place_phone TextView
        placePhone.setText( currentPlace.getPlacePhoneId() );
    
        // Find the LinearLayout in the list_item.xml layout with the ID place_phone_container
        LinearLayout placePhoneContainer = listItemView.findViewById( R.id.place_phone_container );
        
        // Set an click listener on the LinearLayout (place phone text view + icon image view), which
        // sends an intent to a phone dialer to open and copy phone number of selected place to dial pad
        placePhoneContainer.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                // Convert the String phone into a URI object (to pass into the Intent constructor)
                Uri phoneUri = Uri.parse( "tel:" + getContext().getString( currentPlace.getPlacePhoneId() ).trim() );
                
                // Create a new intent to copy the place phone to dialer
                Intent phoneIntent = new Intent( Intent.ACTION_DIAL, phoneUri );
                
                // Send the intent to launch a new activity which take the responsibility of calling
                getContext().startActivity( phoneIntent );
            }
        } );
        
        // Find the child LinearLayout in the list_item.xml layout with the ID text_container
        View textContainer = listItemView.findViewById( R.id.text_container );
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor( getContext(), colorResourceId );
        // Set the background color of the text container View
        textContainer.setBackgroundColor( color );
        
        //        // Set the theme color for the list item
        //        View textContainer = listItemView.findViewById( R.id.text_container );
        //        // Set the background color of the text container View
        //        textContainer.setBackgroundResource( mColorResourceId );
        
        // Create a new set of layout parameters with the specified width and height in (PIXELS)
        LayoutParams layoutParams = new LayoutParams( LayoutParams.MATCH_PARENT, LIST_ITEM_CUSTOM_HEIGHT );
        // These supply parameters to the parent of this view specifying how it should be arranged.
        // Set the layout parameters associated with this view (listItemView)
        listItemView.setLayoutParams( layoutParams );
        
        // Return the whole list item layout (containing 4 TextView)
        // so that it can be shown in the listView
        return listItemView;
    }
    
    /**
     * This method get the width of the device's screen at run time
     *
     * @return the width in pixels of the screen at run time
     */
    public static int getScreenWidthInPixels()
    {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
    
    /**
     * This method get the width of the device's screen at run time
     *
     * @return the width in dp of the screen at run time
     */
    //    public static int getScreenWidthInDPs()
    //    {
    //        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
    //        int screenWidthInPixels = displayMetrics.widthPixels;
    //        double screenDensity = displayMetrics.density;
    //        int screenWidthInDps = ( int ) ( screenWidthInPixels / screenDensity );
    //        return screenWidthInDps;
    //    }
}
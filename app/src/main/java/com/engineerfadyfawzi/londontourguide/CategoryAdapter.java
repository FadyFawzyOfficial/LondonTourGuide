package com.engineerfadyfawzi.londontourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter
{
    /**
     * Context of the app
     */
    private Context context;
    
    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the
     *                        adapter across swipes.
     * @param context         is the context of the app
     */
    public CategoryAdapter( Context context, FragmentManager fragmentManager )
    {
        super( fragmentManager );
        this.context = context;
    }
    
    /**
     * Return the {@link Fragment} that should be displayed for the given page number
     *
     * @param position is the page number (position of Fragment)
     *
     * @return
     */
    @Override
    public Fragment getItem( int position )
    {
        switch ( position )
        {
            case 0:
                return new StayFragment();
            
            case 1:
                return new EatFragment();
            
            case 2:
                return new DrinkFragment();
            
            case 3:
                return new TodoFragment();
            
            default:
                return new ShopFragment();
        }
    }
    
    /**
     * Return the total number of pages
     *
     * @return
     */
    @Override
    public int getCount()
    {
        return 5;
    }
    
    /**
     * Return the pageTitle that should be displayed for the each page at the top.
     *
     * @param position is the page number (position of Fragment)
     *
     * @return
     */
    @Override
    public CharSequence getPageTitle( int position )
    {
        switch ( position )
        {
            case 0:
                return context.getString( R.string.category_stay );
            
            case 1:
                return context.getString( R.string.category_eat );
            
            case 2:
                return context.getString( R.string.category_drink );
            
            case 3:
                return context.getString( R.string.category_todo );
            
            default:
                return context.getString( R.string.category_shop );
        }
    }
}
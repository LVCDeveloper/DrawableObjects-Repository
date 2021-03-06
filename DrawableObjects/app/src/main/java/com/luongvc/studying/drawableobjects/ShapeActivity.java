package com.luongvc.studying.drawableobjects;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

// This activity will demonstrate the use of shape drawables.
//
public class ShapeActivity
    extends Activity
    implements ShapeFragment.ShapeFragmentListener ,
        ShapeVariationFragment.ShapeVariationFragmentListener
{
    //////////////////////////////////////////////////
    // Constant Data Member

    private static final String TAG = ShapeActivity.class.getSimpleName();

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreate()" );
        super.onCreate( savedInstanceState);

        // Setup Fragment
        ShapeFragment fragment = new ShapeFragment();
        getFragmentManager().beginTransaction()
                .add( android.R.id.content ,
                        fragment , fragment.getClass().getSimpleName() )
                .commit();

        // Setup ActionBar so that the title icon is clickable
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled( true );
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        Log.d( TAG , "onOptionsItemSelected" );

        switch( item.getItemId() )
        {
            case android.R.id.home:
                Log.i( TAG , "Starting home activity." );
                Intent homeActivity = new Intent( this , MainActivity.class )
                        .setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity( homeActivity );
                break;
        }

        return super.onOptionsItemSelected( item );
    }

    /* Subscribed Methods */

    @Override
    public void onDisplayShapeVariation( int shape )
    {
        Log.d( TAG , "onDisplayShareVariation:" + shape );

        Fragment fragment = null;
        switch( shape )
        {
            case ShapeFragment.RECTANGLE:
                fragment = new ShapeRectangleFragment();
                break;
            case ShapeFragment.OVAL:
                fragment = new ShapeOvalFragment();
                break;
            case ShapeFragment.LINE:
                fragment = new ShapeLineFragment();
                break;
            case ShapeFragment.RING:
                fragment = new ShapeRingFragment();
                break;
            default:
                fragment = new ShapeFragment();
                break;
        }

        replaceFragmentContent( fragment );
    }

    @Override
    public void onDisplayShapeVariety()
    {
        Log.d( TAG , "onDisplayShapeVariety" );

        getFragmentManager().popBackStack();
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // This methods will replace the fragment content using transition animation.
    //
    protected void replaceFragmentContent( Fragment fragment )
    {
        getFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.card_flip_right_in , R.anim.card_flip_right_out ,
                        R.anim.card_flip_left_in , R.anim.card_flip_left_out )
                .replace( android.R.id.content ,
                        fragment , fragment.getClass().getSimpleName() )
                .addToBackStack( null )
                .commit();
    }
}

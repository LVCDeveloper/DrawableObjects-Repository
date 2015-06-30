package com.luongvc.studying.drawableobjects;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

// This bitmap activity will demonstrate the use of bitmap drawable to display images in both
// png and jpg format.
//
public class BitmapActivity
    extends Activity
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private static final String TAG = BitmapActivity.class.getSimpleName();

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreate()" );
        super.onCreate( savedInstanceState );

        // Create and add Bitmap fragment
        BitmapFragment fragment = new BitmapFragment();
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
                Log.d( TAG , "Starting home activity" );
                Intent homeActivity = new Intent( this , MainActivity.class )
                        .setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity( homeActivity );
                break;
        }

        return super.onOptionsItemSelected( item );
    }
}

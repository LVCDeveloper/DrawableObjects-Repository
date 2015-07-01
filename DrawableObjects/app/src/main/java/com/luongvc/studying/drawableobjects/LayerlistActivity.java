package com.luongvc.studying.drawableobjects;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

// This activity will demonstrate the usages of layer list.
//
public class LayerlistActivity
    extends Activity
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = LayerlistActivity.class.getSimpleName();

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreate()" );
        super.onCreate( savedInstanceState );

        // Setup actionbar to have a clickable icon
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled( true );

        // Create and display fragment
        LayerlistFragment fragment = new LayerlistFragment();
        getFragmentManager().beginTransaction()
                .add( android.R.id.content ,
                        fragment , fragment.getClass().getSimpleName() )
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        Log.d( TAG , "onOptionsItemSelected()" );

        switch( item.getItemId() )
        {
            case android.R.id.home:
                Log.i( TAG , "Starting home activity." );
                Intent homeActivity = new Intent( this , MainActivity.class )
                        .setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
                startActivity( homeActivity );
        }

        return super.onOptionsItemSelected( item );
    }
}

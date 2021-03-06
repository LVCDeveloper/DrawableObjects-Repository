package com.luongvc.studying.drawableobjects;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity
        extends Activity
{
    //////////////////////////////////////////////////
    // Constant Data Memebers

    private static final String TAG = MainActivity.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    protected Button btnBitmap;
    protected Button btnNinePatch;
    protected Button btnLayerList;
    protected Button btnStateList;
    protected Button btnLevelList;
    protected Button btnTransition;
    protected Button btnInsert;
    protected Button btnClip;
    protected Button btnScale;
    protected Button btnShape;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreate()" );

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        initViewControls();
        regViewListeners();

        crossoutText();
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        Log.d( TAG , "onCreateOptionsMenu()" );

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        Log.d( TAG , "onOptionsItemSelected()" );

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if ( id == R.id.action_settings )
        {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // This method will initialize all view controls to a variable.
    //
    protected void initViewControls()
    {
        Log.d( TAG , "initViewControls()" );

        btnBitmap       = (Button)findViewById( R.id.main_btn_bitmap );
        btnNinePatch    = (Button)findViewById( R.id.main_btn_ninepatch );
        btnLayerList    = (Button)findViewById( R.id.main_btn_layerlist );
        btnStateList    = (Button)findViewById( R.id.main_btn_statelist );
        btnLevelList    = (Button)findViewById( R.id.main_btn_levellist );
        btnTransition   = (Button)findViewById( R.id.main_btn_transition );
        btnInsert       = (Button)findViewById( R.id.main_btn_insert );
        btnClip         = (Button)findViewById( R.id.main_btn_clip );
        btnScale        = (Button)findViewById( R.id.main_btn_scale );
        btnShape        = (Button)findViewById( R.id.main_btn_shape );
    }

    // This methods will setup the view controls listerner
    //
    protected void regViewListeners()
    {
        Log.d( TAG , "regViewListeners()" );

        btnBitmap.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i( TAG, "Starting bitmap activity." );
                Intent bitmapActivity = new Intent( getBaseContext(), BitmapActivity.class );
                startActivity( bitmapActivity );
            }
        } );

        btnNinePatch.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i( TAG , "Starting ninepatch activity." );
                Intent ninepatchActivity = new Intent( getBaseContext() , NinepatchActivity.class );
                startActivity( ninepatchActivity );
            }
        } );

        btnLayerList.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i( TAG , "Starting layerlist activity." );
                Intent layerlistActivity = new Intent( getBaseContext() , LayerlistActivity.class );
                startActivity( layerlistActivity );
            }
        } );

        btnShape.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Log.i( TAG , "Starting shape activity." );
                Intent shapeActivity = new Intent( getBaseContext() , ShapeActivity.class );
                startActivity( shapeActivity );
            }
        } );
    }

    // This methods will cross-out the text on button with unaviable activity
    //
    protected void crossoutText()
    {
        Log.d( TAG, "crossoutText()" );

        btnStateList.setPaintFlags( btnStateList.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
        btnLevelList.setPaintFlags( btnLevelList.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
        btnTransition.setPaintFlags( btnTransition.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
        btnInsert.setPaintFlags( btnInsert.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
        btnClip.setPaintFlags( btnClip.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
        btnScale.setPaintFlags( btnScale.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG );
    }
}

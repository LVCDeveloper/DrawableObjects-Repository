package com.luongvc.studying.drawableobjects;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

// This fragment will display a variety of Lineangles using the shape drawable.
//
public class ShapeRingFragment
    extends ShapeVariationFragment
    implements View.OnClickListener
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = ShapeRingFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    ImageView mImgRingSolid;
    ImageView mImgRingSolidThick;
    ImageView mImgRingDash;
    ImageView mImgRingDashThick;
    ImageView mImgRingFilled;
    ImageView mImgRingFilledThick;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreateView" );

        View view = inflater.inflate( R.layout.fragment_shape_ring , null , false );

        initViewControls( view );
        regViewListeners( view );

        return view;
    }

    @Override
    public void onClick( View v )
    {
        Log.d( TAG , "onClick()" );

        mCallback.onDisplayShapeVariety();
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // This methods will initialize the view controls.
    //
    protected void initViewControls( View view )
    {
        Log.d( TAG, "initViewControls()" );

        mImgRingSolid       = (ImageView)view.findViewById( R.id.image_ring_solid );
        mImgRingSolidThick  = (ImageView)view.findViewById( R.id.image_ring_solid_thick );
        mImgRingDash        = (ImageView)view.findViewById( R.id.image_ring_dash );
        mImgRingDashThick   = (ImageView)view.findViewById( R.id.image_ring_dash_thick );
        mImgRingFilled      = (ImageView)view.findViewById( R.id.image_ring_filled );
        mImgRingFilledThick = (ImageView)view.findViewById( R.id.image_ring_filled_thick );
    }

    // This methods will register the listener for view controls
    //
    protected void regViewListeners( View view )
    {
        Log.d( TAG, "regViewListeners()" );

        view.setOnClickListener( this );

        mImgRingSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgRingSolidThick.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Thick Solid Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgRingDash.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Dash Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgRingDashThick.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Thick Dash Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgRingFilled.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Filled Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgRingFilledThick.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Thick Filled Ring" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );
    }
}

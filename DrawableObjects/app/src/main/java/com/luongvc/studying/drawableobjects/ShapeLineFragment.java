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
public class ShapeLineFragment
    extends ShapeVariationFragment
    implements View.OnClickListener
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = ShapeLineFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    ImageView mImgLineSolid;
    ImageView mImgLineGrad;
    ImageView mImgLineDash;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreateView" );

        View view = inflater.inflate( R.layout.fragment_shape_line , null , false );

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
        Log.d( TAG , "initViewControls()" );

        mImgLineSolid       = (ImageView)view.findViewById( R.id.image_line_solid );
        mImgLineDash        = (ImageView)view.findViewById( R.id.image_line_dash );
    }

    // This methods will register the listener for view controls
    //
    protected void regViewListeners( View view )
    {
        Log.d( TAG , "regViewListeners()" );

        view.setOnClickListener( this );

        mImgLineSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Line" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgLineDash.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Dash Line" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );
    }
}

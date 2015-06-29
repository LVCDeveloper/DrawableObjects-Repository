package com.luongvc.studying.drawableobjects;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

// This fragment will display a variety of rectangles using the shape drawable.
//
public class ShapeRectangleFragment
    extends ShapeVariationFragment
    implements View.OnClickListener
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = ShapeRectangleFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    ImageView mImgRectSolid;
    ImageView mImgRectGrad;
    ImageView mImgRectBorderSolid;
    ImageView mImgRectBorderDash;
    ImageView mImgRectRoundedCorner;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreateView" );

        View view = inflater.inflate( R.layout.fragment_shape_rectangle , null , false );

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

        mImgRectSolid       = (ImageView)view.findViewById( R.id.image_rectangle_solid );
        mImgRectGrad        = (ImageView)view.findViewById( R.id.image_rectangle_gradient );
        mImgRectBorderSolid = (ImageView)view.findViewById( R.id.image_rectangle_border_solid );
        mImgRectBorderDash  = (ImageView)view.findViewById( R.id.image_rectangle_border_dash );
        mImgRectRoundedCorner = (ImageView)view.findViewById( R.id.image_rectangle_rounded_corner );
    }

    // This methods will register the listener for view controls
    //
    protected void regViewListeners( View view )
    {
        Log.d( TAG , "regViewListeners()" );

        view.setOnClickListener( this );

        mImgRectSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Rectangle" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgRectGrad.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Gradient Rectangle" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgRectBorderSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Border Rectangle" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgRectBorderDash.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Dash Border Rectangle" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgRectRoundedCorner.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Rounded Corner Rectangle" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );
    }
}

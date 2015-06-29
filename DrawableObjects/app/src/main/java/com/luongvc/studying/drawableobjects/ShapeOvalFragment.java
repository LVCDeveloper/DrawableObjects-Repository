package com.luongvc.studying.drawableobjects;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

// This fragment will display a variety of Ovalangles using the shape drawable.
//
public class ShapeOvalFragment
    extends ShapeVariationFragment
    implements View.OnClickListener
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = ShapeOvalFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    ImageView mImgOvalSolid;
    ImageView mImgOvalGrad;
    ImageView mImgOvalBorderSolid;
    ImageView mImgOvalBorderDash;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG, "onCreateView" );

        View view = inflater.inflate( R.layout.fragment_shape_oval , null , false );

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

        mImgOvalSolid       = (ImageView)view.findViewById( R.id.image_oval_solid );
        mImgOvalGrad        = (ImageView)view.findViewById( R.id.image_oval_gradient );
        mImgOvalBorderSolid = (ImageView)view.findViewById( R.id.image_oval_border_solid );
        mImgOvalBorderDash  = (ImageView)view.findViewById( R.id.image_oval_border_dash );
    }

    // This methods will register the listener for view controls
    //
    protected void regViewListeners( View view )
    {
        Log.d( TAG , "regViewListeners()" );

        view.setOnClickListener( this );

        mImgOvalSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Oval" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgOvalGrad.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Gradient Oval" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgOvalBorderSolid.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Solid Border Oval" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );

        mImgOvalBorderDash.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() ,
                        "Dash Border Oval" , Toast.LENGTH_SHORT )
                    .show();
            }
        } );
    }
}

package com.luongvc.studying.drawableobjects;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

// This fragment will display a list of shape drawables.
//
public class ShapeVarietyFragment
    extends Fragment
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private static final String TAG = ShapeVarietyFragment.class.getSimpleName();

    public static final int RECTANGLE   = 0;
    public static final int OVAL        = 1;
    public static final int LINE        = 2;
    public static final int RING        = 3;

    //////////////////////////////////////////////////
    // View Controls

    private ImageView mImgRectangle;
    private ImageView mImgOval;
    private ImageView mImgLine;
    private ImageView mImgRing;

    //////////////////////////////////////////////////
    // Data Members

    private ShapeVarietyFragmentListener mCallback;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreateView()" );

        View view = inflater.inflate( R.layout.fragment_shape , null , false );

        initViewControls( view );
        regViewListeners( view );

        return view;
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // This method will initialize all the view controls.
    //
    protected void initViewControls( View view )
    {
        mImgRectangle   = (ImageView)view.findViewById( R.id.shape_rectangle );
        mImgOval        = (ImageView)view.findViewById( R.id.shape_oval );
        mImgLine        = (ImageView)view.findViewById( R.id.shape_line );
        mImgRing        = (ImageView)view.findViewById( R.id.shape_ring );
    }

    // This method will register the corresponding listener for each view controls.
    //
    protected void regViewListeners( View view )
    {
        mImgRectangle.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                mCallback.onDisplayShapeVariation( RECTANGLE );
            }
        } );

        mImgOval.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                mCallback.onDisplayShapeVariation( OVAL );
            }
        } );

        mImgLine.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                mCallback.onDisplayShapeVariation( LINE );
            }
        } );

        mImgRing.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                mCallback.onDisplayShapeVariation( RING );
            }
        } );
    }

    //////////////////////////////////////////////////
    // Public Methods

    public void onAttach( Activity activity )
    {
        Log.d( TAG , "onAttach()" );

        super.onAttach( activity );

        mCallback = (ShapeVarietyFragmentListener)activity;
    }

    //////////////////////////////////////////////////
    // Interfaces

    public interface ShapeVarietyFragmentListener
    {
        public void onDisplayShapeVariation( int shape );
    }
}

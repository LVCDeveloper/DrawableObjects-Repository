package com.luongvc.studying.drawableobjects;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

// This fragment will display the variation of bitmap drawables.
//
public class BitmapFragment
    extends Fragment
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private static final String TAG = BitmapFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    private Button mBtnPng;
    private Button mBtnJpg;
    private ImageView mImgDisplay;

    //////////////////////////////////////////////////
    // Data Members

    private boolean mIsPng = false;
    private boolean mIsJpg = false;

    //////////////////////////////////////////////////
    // Override Methods

    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreateView()" );

        View view = inflater.inflate( R.layout.fragment_bitmap , null , false );

        initViewControls( view );
        regViewListeners( view );

        return view;
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // Initialize view controls to an object variable.
    //
    protected void initViewControls( View view )
    {
        Log.d( TAG , "initViewControls()" );

        mBtnPng     = (Button)view.findViewById( R.id.bitmap_btn_png );
        mBtnJpg     = (Button)view.findViewById( R.id.bitmap_btn_jpg );
        mImgDisplay = (ImageView)view.findViewById( R.id.bitmap_img );
    }

    // Register listeners to a view controls.
    //
    protected void regViewListeners( View view )
    {
        Log.d( TAG , "regViewListeners()" );

        mBtnPng.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                displayPngImage();
                mIsPng = true;
                mIsJpg = false;
            }
        } );

        mBtnJpg.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                displayJpgImage();
                mIsPng = false;
                mIsJpg = true;
            }
        } );

        mImgDisplay.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                if( mIsPng == true )
                {
                    Toast.makeText( getActivity() , "PNG Image File" , Toast.LENGTH_SHORT )
                            .show();
                }
                else if( mIsJpg == true )
                {
                    Toast.makeText( getActivity() , "JPG Image File" , Toast.LENGTH_SHORT )
                            .show();
                }
            }
        } );
    }

    // This function will set the display image to view an .png image.
    //
    protected void displayPngImage()
    {
        Log.d( TAG , "displayPngImage()" );

        mImgDisplay.setImageResource( R.drawable.scapegoat_png );
        mImgDisplay.setAdjustViewBounds( true );
    }

    // This function will set the display image to view an .png image.
    //
    protected void displayJpgImage()
    {
        Log.d( TAG, "displayJpgImage()" );

        mImgDisplay.setImageResource( R.drawable.scapegoat_jpg );
        mImgDisplay.setAdjustViewBounds( true );
    }
}

package com.luongvc.studying.drawableobjects;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

// This fragment will user layerlist to display overlapping images.
//
public class LayerlistFragment
    extends Fragment
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private static final String TAG = LayerlistFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // View Controls

    private ImageView mImgBoxes;
    private ImageView mImgBlobs;

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreateView()" );

        View view = inflater.inflate( R.layout.fragment_layerlist , null , false );

        initViewControls( view );
        regViewListeners( view );

        return view;
    }

    //////////////////////////////////////////////////
    // Protected Methods

    // Initialize view controls
    //
    protected void initViewControls( View view )
    {
        mImgBoxes = (ImageView)view.findViewById( R.id.layerlist_img_boxes );
        mImgBlobs = (ImageView)view.findViewById( R.id.layerlist_img_blobs );
    }

    // Register listeners to view controls
    //
    protected void regViewListeners( View view )
    {
        mImgBoxes.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() , "Layerlist using shapes" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );

        mImgBlobs.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                Toast.makeText( getActivity() , "Layerlist using bitmaps" , Toast.LENGTH_SHORT )
                        .show();
            }
        } );
    }
}

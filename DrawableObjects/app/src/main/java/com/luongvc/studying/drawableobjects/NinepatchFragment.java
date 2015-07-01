package com.luongvc.studying.drawableobjects;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// This fragment will display a variety of view controls using a ninepatch image as a border.
//
public class NinepatchFragment
    extends Fragment
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private static final String TAG = NinepatchFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // Override Methods

    @Override
    public View onCreateView( LayoutInflater inflater , ViewGroup container ,
                              Bundle savedInstanceState )
    {
        Log.d( TAG , "onCreateView()" );

        View view = inflater.inflate( R.layout.fragment_ninepatch , null , false );

        return view;
    }
}

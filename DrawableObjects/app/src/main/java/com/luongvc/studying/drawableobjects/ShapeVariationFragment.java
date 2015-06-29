package com.luongvc.studying.drawableobjects;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

// Base class for the different type of Shape variations
//
public class ShapeVariationFragment
    extends Fragment
{
    //////////////////////////////////////////////////
    // Constant Data Members

    private final static String TAG = ShapeVariationFragment.class.getSimpleName();

    //////////////////////////////////////////////////
    // Data Members

    ShapeVariationFragmentListener mCallback;

    //////////////////////////////////////////////////
    // Public Methods

    public void onAttach( Activity activity )
    {
        Log.d( TAG , "onAttach()" );

        super.onAttach( activity );

        mCallback = (ShapeVariationFragmentListener)activity;
    }

    //////////////////////////////////////////////////
    // Interface

    public interface ShapeVariationFragmentListener
    {
        public void onDisplayShapeVariety();
    }
}

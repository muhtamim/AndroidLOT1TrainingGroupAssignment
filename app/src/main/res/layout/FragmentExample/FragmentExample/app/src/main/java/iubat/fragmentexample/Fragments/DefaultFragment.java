package iubat.fragmentexample.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import iubat.fragmentexample.R;

/**
 * Created by USER on 12/5/2016.
 */

public class DefaultFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.default_fragment, container, false);
    }
}

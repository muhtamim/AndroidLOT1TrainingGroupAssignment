package iubat.fragmentexample.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import iubat.fragmentexample.R;

public class FragmentOne extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_one_layout, container, false);
    }
}

package com.clock.fragment.nidhal.clockappwithfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

    boolean dateOK = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = null;
        if (dateOK) {
            view = inflater.inflate(R.layout.frag_date, container, false);
        }else{
            view = inflater.inflate(R.layout.frag_time, container, false);
        }

        return view;
    }

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        dateOK = args.getBoolean("dateOK");
    }


}
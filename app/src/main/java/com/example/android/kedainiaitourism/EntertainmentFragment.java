package com.example.android.kedainiaitourism;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by lukas on 6/20/17.
 */

public class EntertainmentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.plain_text);
        textView.setText("You are on the EntertainmentFragment");
        return rootView;
    }
}

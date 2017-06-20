package com.example.android.kedainiaitourism;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location, container, false);
        final ArrayList<Data> data = new ArrayList<>();
        data.add(new Data(R.mipmap.ic_launcher,"Chili","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Grejus","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Piko","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Dvaras","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Chili","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Grejus","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Piko","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Dvaras","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Chili","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Grejus","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Piko","Vienas is nedaugelio islikusiu senamiesciu"));
        data.add(new Data(R.mipmap.ic_launcher,"Dvaras","Vienas is nedaugelio islikusiu senamiesciu"));


        DataAdapter adapter = new DataAdapter(getActivity(), data);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

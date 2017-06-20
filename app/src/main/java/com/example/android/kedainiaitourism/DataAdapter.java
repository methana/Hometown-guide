package com.example.android.kedainiaitourism;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lukas on 6/20/17.
 */

public class DataAdapter extends ArrayAdapter<Data> {


    public DataAdapter(Activity context, ArrayList<Data> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        Data currentData = getItem(position);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        title.setText(currentData.getTitle());
        TextView description = (TextView) convertView.findViewById(R.id.description);
        description.setText(currentData.getDescription());
/*        ImageView imageView=(ImageView) convertView.findViewById(R.id.listImage);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        int color1= ContextCompat.getColor(getContext(),color);
        LinearLayout l=(LinearLayout) listItemView.findViewById(R.id.background_color);
        l.setBackgroundColor(color1);*/
        return convertView;
    }

}

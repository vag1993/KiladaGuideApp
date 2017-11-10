package com.example.android.kiladaguideapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class SightAdapter extends ArrayAdapter<Sight> {
    SightAdapter(Context context, ArrayList<Sight> sight) {
        super(context ,0, sight);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.appearance, parent, false);
        }
        Sight currentSight = getItem(position);
        TextView panwTextView = (TextView) listItemView.findViewById(R.id.panw_text_view);
        assert currentSight != null;
        panwTextView.setText(currentSight.getdefaultPhraseId());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentSight.hasImage()) {
            imageView.setImageResource(currentSight.getimageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
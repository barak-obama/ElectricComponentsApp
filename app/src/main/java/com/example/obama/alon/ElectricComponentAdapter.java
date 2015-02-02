package com.example.obama.alon;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by obama on 01/02/15.
 */
public class ElectricComponentAdapter extends ArrayAdapter<Info> {
    ArrayList<Info> info;
    private Context context;
    private int rowLayout;
    private Activity activity;

    public ElectricComponentAdapter(Context context, int resource, ArrayList<Info> objects, Activity a) {
        super(context,resource, objects);
        info = objects;
        this.context = context;
        rowLayout = resource;
        activity = a;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflater.inflate(rowLayout, null);
        }
        Info f = info.get(position);
        TextView title = (TextView) convertView.findViewById(R.id.liNameOfProp);
        TextView inf = (TextView) convertView.findViewById(R.id.liContantOfProp);
        title.setText(f.getTitle() + ":");
        inf.setText(f.getInfo());
        return convertView;
    }
}

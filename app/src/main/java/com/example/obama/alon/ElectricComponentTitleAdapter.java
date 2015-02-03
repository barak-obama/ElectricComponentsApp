package com.example.obama.alon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by obama on 23/01/15.
 */
public class ElectricComponentTitleAdapter extends  ArrayAdapter<ElectricComponentTitle>{
    private ArrayList<ElectricComponentTitle> components;
    private Context context;
    private int rowLayout;
    private Activity activity;


    public ElectricComponentTitleAdapter(Context context, int resource, ArrayList<ElectricComponentTitle> objects, Activity a) {
        super(context, resource, objects);
        components = objects;
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

        TextView text = (TextView) convertView.findViewById(R.id.liTextComp);

        //image!!!!!!!!!!!!!!!!!!!!!!!!!!!

        final ElectricComponentTitle c = components.get(position);
        text.setText(c.name);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(activity, ElectricComponentActivity.class);
                in.putExtra("id", c.id);
//                in.putExtra("image", c.getImage());
                activity.startActivity(in);

            }
        });

        return convertView;
    }
}

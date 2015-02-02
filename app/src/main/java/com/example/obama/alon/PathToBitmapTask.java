package com.example.obama.alon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.File;


/**
 * Created by obama on 25/01/15.
 */
public class PathToBitmapTask extends AsyncTask<Integer, Void, Bitmap> {
    Resources context;
    public PathToBitmapTask(Resources context){
        this.context = context;
    }
    @Override
    protected Bitmap doInBackground(Integer... ids) {
        return BitmapFactory.decodeResource(context, ids[0]);
    }

}

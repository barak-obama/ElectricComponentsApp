package com.example.obama.alon;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by obama on 01/02/15.
 */
public class Client {
    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;

    public static final String INFO_SPACER = "Ã", PROP_SPACER = "Â",
            BETWEAN_TITLE_AND_INFO_SPACER = "Ç";;

    public enum Option {
        GET_COMPONENT, ADD_COMPONENTS, EXIT,GET_TITLES,TITLES
    }

    public Client(final String ip, final int port){
        AsyncTask<Void, Void, Void> c = new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try{
                    socket = new Socket(ip, port);
                    reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                }catch (IOException e){

                }
                return  null;
            }
        };
        c.execute();
    }








}

package com.example.obama.alon;

/**
 * Created by obama on 01/02/15.
 */
public class ElectricComponentTitle {
    public final String name, imageAsString;
    public final int id;

    public ElectricComponentTitle(String s){
        s = s.substring(1, s.length() - 1);
        String[] p = s.split(Client.BETWEAN_TITLE_AND_INFO_SPACER);
        name = p[0];
        imageAsString = p[1];
        id = Integer.parseInt(p[2]);
    }
}

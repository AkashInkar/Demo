package com.example.jack.pramodshinde.model;
import android.content.Context;
import android.net.ConnectivityManager;

public class Common
{
    ConnectivityManager connectivityManager;


    public static boolean connectionAvailable(Context context)
    {
//        ConnectivityManager connectivityManager;
//        connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        return  connectivityManager.getActiveNetworkInfo() !=null;
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo()!=null;
    }
}

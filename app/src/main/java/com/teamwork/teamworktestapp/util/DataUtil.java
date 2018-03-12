package com.teamwork.teamworktestapp.util;

import android.content.Context;
import android.net.ConnectivityManager;


/**
 * Created by martin on 09/03/18.
 */

public class DataUtil {

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }

}

package com.example.zws.myapplication.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ZWS on 2018/12/4.
 */

public class ToastUtils {
    public static void toastMessage(Context context, String message){
        Toast.makeText(context,  message, Toast.LENGTH_SHORT).show();
    }
}

package com.example.chattranslation;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import android.widget.Toast;

public class Android {
    private Handler handler;
    private MainActivity mact;

    public Android(MainActivity ma){
        this.mact = ma;
    };
        @android.webkit.JavascriptInterface
        public void callMethodName(){
                    Vibrator vibrator = (Vibrator)mact.getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator.vibrate(100);
        }
}

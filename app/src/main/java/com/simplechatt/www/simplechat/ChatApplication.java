package com.simplechatt.www.simplechat;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by chandramouli on 23/11/15.
 */
public class ChatApplication extends Application {
    public static final String APPLIACTION_ID = "jnqt695a3FStkXmFTUWQeoIB7gSoSns94Xj10M5H";
    public static final String CLIENT_KEY = "3XHabyz01D44BLibzywY3Jd49Qxq7fefhwA2QAo2";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, APPLIACTION_ID, CLIENT_KEY);
    }

}

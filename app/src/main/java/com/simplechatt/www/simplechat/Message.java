package com.simplechatt.www.simplechat;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by chandramouli on 25/11/15.
 */
@ParseClassName("Message")
public class Message extends ParseObject {
    public String getUserId(){
        return getString("userID");
    }
    public String getBody() {
        return getString("body");
    }
    public void setUserId(String userId) {
        put("userId", userId);
    }
    public void setBody(String body) {
        put("userId", body);
    }
}

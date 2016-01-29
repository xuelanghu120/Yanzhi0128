package com.xingyun.login.cache;

import com.xingyun.login.model.entity.User;

/**
 * Created by anzhuo on 2016/1/28.
 */
public class UserCache {
    public static final String TAG = "UserCache";
    public static User user;
    public static String token;
  public static void clean(){
      user = null;
      token = null;
  }
}

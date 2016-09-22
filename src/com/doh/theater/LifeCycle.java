package com.doh.theater;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public interface LifeCycle {

    public void onCreate();

    public void onDestroy();

    public void onBackground();

    public void onFront();

}

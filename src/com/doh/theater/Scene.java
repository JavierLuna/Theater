package com.doh.theater;

import javax.swing.*;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public abstract class Scene extends JFrame implements LifeCycle{

    private int id;

    protected Scene(){
        super();
        onCreate();
        setVisible(true);


    }

    protected void setId(int id){this.id = id;}

    public int getId(){return id;}

    public void finish(){
        setVisible(false);
        onDestroy();
        dispose();
    }

    public void onDestroy(){

    }

    public void onBackground(){

    }

    public void onFront(){

    }



}

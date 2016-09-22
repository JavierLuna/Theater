package com.doh.theater;

import javax.swing.*;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public abstract class Scene extends JFrame implements LifeCycle{


    public Scene(){
        super();
        setVisible(true);

    }

    public void finish(){
        setVisible(false);
        dispose();
    }

    public void onDestroy(){

    }

    public void onBackground(){

    }

    public void onFront(){

    }



}

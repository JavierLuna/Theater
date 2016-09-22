package com.doh.theater;

import java.util.Stack;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public class SceneDirector {

    private Stack<Scene> sceneStack;

    private static final SceneDirector instance = new SceneDirector();

    private SceneDirector(){
        sceneStack = new Stack<Scene>();
    }

    public static SceneDirector getInstance(){
        return instance;
    }

    public void startShow(Class startingScene){
        try{
            Scene scene = (Scene) startingScene.newInstance();
            sceneStack.push(scene);
        }catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

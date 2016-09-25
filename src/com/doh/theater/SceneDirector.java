package com.doh.theater;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by javierlunamolina on 22/9/16.
 */
public class SceneDirector {

    private HashMap<Integer, Scene> scenes;
    private int last_id;

    private HashMap<String, ArrayList<Event>> eventlist;

    private static final SceneDirector instance = new SceneDirector();

    private SceneDirector(){
        scenes = new HashMap<Integer, Scene>();
        last_id = 0;
        eventlist = new HashMap<String, ArrayList<Event>>();
    }

    public static SceneDirector getInstance(){
        return instance;
    }

    public void startShow(Class startingScene){
        try{
            Scene scene = (Scene) startingScene.newInstance();
            scene.setId(last_id);
            scenes.put(last_id, scene);
            last_id++;
        }catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Scene getScene(int id){
        return scenes.get(id);
    }

    public void registerEventTrigger(String eventLabel, Event event){
        if(eventlist.containsKey(eventLabel)){
            ArrayList<Event> eventListeners = eventlist.get(eventLabel);
            eventListeners.add(event);
        }else{
            ArrayList<Event> eventListeners = new ArrayList<Event>();
            eventListeners.add(event);
            eventlist.put(eventLabel, eventListeners);
        }
    }

    public boolean hasEventTriggers(String eventLabel){
        return eventlist.get(eventLabel) != null;
    }

    public void triggerEvent(String eventLabel, Object argument){
        if(hasEventTriggers(eventLabel)){
            for(Event event:eventlist.get(eventLabel)){
                event.onTriggered(argument);
            }
        }
    }

}

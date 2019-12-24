package com.funniray.osmpcore.Events;

import com.funniray.osmpcore.Minipack;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;

public class EventBus {

    protected HashMap<EventPriority, HashMap< Class<Event>, ArrayList<Method>>> eventHandlers = new HashMap<>(); //Event priorities -> Event -> [Actual method handlers]

    public void addEventHandler(EventPriority priority, Class<Event> event, Method method) {
        if(!eventHandlers.containsKey(priority)) eventHandlers.put(priority, new HashMap<>());
        if(!eventHandlers.get(priority).containsKey(event)) eventHandlers.get(priority).put(event,new ArrayList<>());
        eventHandlers.get(priority).get(event).add(method);
    }

    public Event handleEvent(Event event) throws InvocationTargetException, IllegalAccessException {
        for(EventPriority priority : EventPriority.values()) {
            if(!eventHandlers.containsKey(priority)) break;
            HashMap< Class<Event>, ArrayList<Method>> handlers = eventHandlers.get(priority);
            ArrayList<Method> methods = handlers.get(event.getClass());
            for(Method method : methods) {
                method.invoke(event);
            }
        }
        return event;
    }

    public void registerListener(EventListener listener, Minipack pack) {
        ArrayList<Method> methods = EventUtils.getMethodsWithAnnotation(listener.getClass(), EventHandler.class);
        for(Method method : methods) {
            Parameter[] params = method.getParameters();
            EventHandler annotation = method.getAnnotation(EventHandler.class);
            addEventHandler(annotation.priority(), params[0].getType().getClass().cast(Event.class), method);
        }
    }
}

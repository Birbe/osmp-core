package com.funniray.osmpcore.Event;

import com.funniray.osmpcore.Minipack;
import com.funniray.osmpcore.OSMC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class EventBus {

    protected HashMap<EventPriority, HashMap< Class<? extends IEvent>, ArrayList<Method>>> eventHandlers = new HashMap<>(); //Event priorities -> Event -> [Actual method handlers]

    public void addEventHandler(EventPriority priority, Class<? extends IEvent> event, Method method) {
        if(!eventHandlers.containsKey(priority)) eventHandlers.put(priority, new HashMap<>());
        if(!eventHandlers.get(priority).containsKey(event)) eventHandlers.get(priority).put(event,new ArrayList<>());
        eventHandlers.get(priority).get(event).add(method);
    }

    public IEvent handleEvent(IEvent event) {
        for(EventPriority priority : EventPriority.values()) {
            if(!eventHandlers.containsKey(priority)) continue;
            HashMap< Class<? extends IEvent>, ArrayList<Method>> handlers = eventHandlers.get(priority);

            Class implementedInterface = event.getClass().getInterfaces()[0];
            ArrayList<Method> methods = handlers.get(implementedInterface);

            for(Method method : methods) {
                try {
                    Parameter[] params = method.getParameters();
                    Class target = params[0].getType();
                    method.invoke(target.cast(event));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return event;
    }

    public void registerListener(EventListener listener, Minipack pack) {
        ArrayList<Method> methods = EventUtils.getMethodsWithAnnotation(listener.getClass(), EventHandler.class);
        for(Method method : methods) {
            Parameter[] params = method.getParameters();
            EventHandler annotation = method.getAnnotation(EventHandler.class);
            Class<? extends IEvent> target = params[0].getType().asSubclass(IEvent.class);
            addEventHandler(annotation.priority(), target, method);
        }
    }
}

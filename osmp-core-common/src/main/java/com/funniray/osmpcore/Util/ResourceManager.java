package com.funniray.osmpcore.Util;

import com.funniray.osmpcore.OSMC;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ResourceManager {

    private static HashMap<Object, Object> resources = new HashMap<>();

    public static Object get(Object source, Class target) {
        if(!resources.containsKey(source)) {
            Object osmcObject = null;
            try {
                Constructor constructor = target.getConstructors()[0];
                osmcObject = constructor.newInstance(source);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            resources.put(source, osmcObject);
            return osmcObject;
        } else return resources.get(source);
    }

}

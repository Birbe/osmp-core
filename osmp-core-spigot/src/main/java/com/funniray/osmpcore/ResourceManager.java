package com.funniray.osmpcore;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ResourceManager {

    private static HashMap<Object, Object> resources = new HashMap<>();

    public static Constructor recurseFindConstructor(Class childParam, Class targetClass) {
        //Finding a constructor with a child of a class that is used as a parameter does not work, so I need to find the method.
        Class param = childParam;

        while(true) {
            Constructor result;
            try {
                result = targetClass.getConstructor(param);
            } catch (NoSuchMethodException e) {
                param = param.getSuperclass();
                OSMC.log(param.getName());
                continue;
            }
            //Found it.
            return result;
        }
    }

    public static Object get(Object bukkit, Class target) {
        if(!resources.containsKey(bukkit)) {
            Object osmcObject = null;
            try {
                //Constructor constructor = recurseFindConstructor(bukkit.getClass(), target);
                Constructor constructor = target.getConstructors()[0];
                osmcObject = constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            if(osmcObject != null) resources.put(bukkit, osmcObject);
            else {
                OSMC.log("[OSMC-Spigot] Error casting resource in ResourceManager.");
                return null;
            }
        }
        return resources.get(bukkit);
    }

}

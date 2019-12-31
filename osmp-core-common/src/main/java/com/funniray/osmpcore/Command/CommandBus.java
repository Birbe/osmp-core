package com.funniray.osmpcore.Command;

import com.funniray.osmpcore.Command.Executor.CommandSender;
import com.funniray.osmpcore.Event.*;
import com.funniray.osmpcore.Minipack;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;

public class CommandBus {

    protected HashMap<String, HandlerListenerPair> listeners = new HashMap<>();

    public void addHandler(HandlerListenerPair pair, Command command) {
        for(String name : command.getAliases()) {
            listeners.put(name, pair);
        }
    }

    public CommandResult handleCommand(CommandSender sender, String[] args, String name) {
        if(!listeners.containsKey(name)) {
            return CommandResult.UNKNOWN;
        } else {
            HandlerListenerPair pair = listeners.get(name);
            try {
                return (CommandResult) pair.handler.invoke(pair.listener, sender, args);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return CommandResult.FAIL;
        }
    }

    public void registerListener(EventListener listener, Minipack pack) {
        ArrayList<Method> methods = EventUtils.getMethodsWithAnnotation(listener.getClass(), CommandHandler.class);
        for(Method method : methods) {
            Parameter[] params = method.getParameters();
            CommandHandler annotation = method.getAnnotation(CommandHandler.class);
            Class<? extends Command> command = annotation.command();
            HandlerListenerPair pair = new HandlerListenerPair();
            pair.listener = listener;
            pair.handler = method;
            try {
                addHandler(pair, command.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}

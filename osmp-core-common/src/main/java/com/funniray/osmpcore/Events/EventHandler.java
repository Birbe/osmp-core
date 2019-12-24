package com.funniray.osmpcore.Events;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.PriorityQueue;

@Retention(RetentionPolicy.RUNTIME) //So we can read the annotation values at runtime
public @interface EventHandler {

    EventPriority priority() default EventPriority.NORMAL;

}

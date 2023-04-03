package com.example.railman.objectfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EntityFactory <T> {


    public T createEntityObject(Class<T> entityClass) {


        Constructor<T> constructor = null;
        try {
            constructor = entityClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            throw new RuntimeException(e);
        }


    }

}
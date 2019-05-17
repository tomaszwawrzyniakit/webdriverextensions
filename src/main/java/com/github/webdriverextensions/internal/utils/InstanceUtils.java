package com.github.webdriverextensions.internal.utils;

import com.github.webdriverextensions.internal.WebDriverExtensionException;
import java.lang.reflect.InvocationTargetException;

public class InstanceUtils {

    private InstanceUtils() {}
    
    public static <T> T newInstance(Class clazz, Class<T> returnedClazz) {
        try {
            return (T) clazz.getConstructor().newInstance();
        } catch (NoSuchMethodException | SecurityException | InvocationTargetException | IllegalArgumentException | IllegalAccessException | InstantiationException ex) {
            throw new WebDriverExtensionException(ex);
        }
    }

}

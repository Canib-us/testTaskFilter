package org.itk.testtaskfilter;

import java.lang.reflect.Array;

public class ArrayUtil {
    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] array, Filter<T> filter) {
        if (array == null) {
            return null;
        }
        T[] filteredArray = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        for (int i = 0; i < array.length; i++) {
            filteredArray[i] = filter.apply(array[i]);
        }
        return filteredArray;
    }

}

interface Filter<T>{
    T apply(T o);
}

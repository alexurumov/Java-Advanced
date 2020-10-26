package genericarraycreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    private int length;

    static <T> T[] create(int length, T item) {
        T[] result = (T[]) new Object[length];

        result = setValue(length, item, result);

        return result;
    }

    private static <T> T[] setValue(int length, T item, T[] result) {
        for (int i = 0; i < length; i++) {
            result[i] = item;
        }

        return result;
    }

    static <T> T[] create(Class<T> clazz, int length, T item) {
        T[] result = (T[]) Array.newInstance(clazz, length);

        result = setValue(length, item, result);

        return result;
    }
}

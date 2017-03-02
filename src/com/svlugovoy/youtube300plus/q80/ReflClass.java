package com.svlugovoy.youtube300plus.q80;

import java.lang.reflect.Field;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 18.02.2016.
 */
public class ReflClass {
    public static void main(String[] args) {

        final Class<?> cls = TestClass.class;

        try {
            TestClass test = new TestClass();
            Field field = cls.getDeclaredField("i_priv");
            field.setAccessible(true);
            System.out.println("Private field value: " + field.getInt(test));
            field.setInt(test, 150);
            System.out.println("New private field value: " + field.getInt(test));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

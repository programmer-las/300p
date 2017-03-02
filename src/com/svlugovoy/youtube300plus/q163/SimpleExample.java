package com.svlugovoy.youtube300plus.q163;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.03.2016.
 */
class Gener<T> {
    T obj;

    public Gener(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type T is " + obj.getClass().getName());
    }
}

public class SimpleExample {
    public static void main(String[] args) {

        Gener<Integer> iObj;
        Gener<String> sObj;
        Gener<LocalDate> dObj;
//        Gener<int> gI; //wrong

        iObj = new Gener<Integer>(555);
//        iObj = new Gener<Double>(555.0); //wrong
//        iObj = new Gener<Integer>(new Integer(555));
        sObj = new Gener<>("qwerty");
        dObj = new Gener<>(LocalDate.now());

//        iObj = sObj; //wrong

        iObj.showType();
        int i = iObj.getObj();
        System.out.println(i);

        sObj.showType();
        String s = sObj.getObj();
        System.out.println(s);

        dObj.showType();
        LocalDate date = dObj.getObj();
        System.out.println(date);

        Map<String, String> map = new HashMap<>();
        map.put("123", "text1");
//        map.put(new Integer(321), "text2"); //wrong

    }
}


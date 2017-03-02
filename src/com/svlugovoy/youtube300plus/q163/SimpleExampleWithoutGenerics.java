package com.svlugovoy.youtube300plus.q163;

import java.time.LocalDate;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.03.2016.
 */

class NonGener {
    Object obj;

    public NonGener(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type T is " + obj.getClass().getName());
    }
}

public class SimpleExampleWithoutGenerics {
    public static void main(String[] args) {

        NonGener iObj;
        NonGener sObj;
        NonGener dObj;

        iObj = new NonGener(555);
        sObj = new NonGener("qwerty");
        dObj = new NonGener(LocalDate.now());

        iObj.showType();
        int i = (int) iObj.getObj();
        System.out.println(i);

        sObj.showType();
        String s = (String) sObj.getObj();
        System.out.println(s);

        dObj.showType();
        LocalDate date = (LocalDate) dObj.getObj();
        System.out.println(date);

    }
}

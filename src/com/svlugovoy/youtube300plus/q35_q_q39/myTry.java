package com.svlugovoy.youtube300plus.q35_q_q39;

/**
 * Created by a on 02.03.2017.
 */
public class myTry {
    private String name;
    public static void myTry() {
        System.out.println("constructor run on");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String myText(String st) {
        System.out.println(st);
        return "from";
    }

    public static void main(String[] args) {
        myTry s = new myTry();
        s.myText("this is my Text");
        s.setName("NAMe");
        System.out.println(s.getName());
    }
}

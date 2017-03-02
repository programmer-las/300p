package com.svlugovoy.youtube300plus.q40_q_q44;

import java.io.IOException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 31.03.2016.
 */
class SuperCl {

    protected void drive() {}

    public void swim() throws Exception {}

    public void swim2() throws IOException {}

    public void swim3() {}

    String getStr() {return "";}

    Number getNum() {return 1;}

    private void go() {}

    static void stat(){System.out.println("1");}

}

public class OverrideDemo extends SuperCl {

    public void drive() {System.out.println("...");}
//    void drive(){}
//    private void drive(){}

    public void swim() throws IOException {}
//    public void swim() throws Throwable{}

    public void swim2() {}
//    public void swim2() throws Exception{}

//    public void swim3() throws Exception{}

    String getStr() {return "Hello";}
//    Integer getStr(){return new Integer(1);}

    Double getNum() {return 10.0;}

    public void go() {}

    static void stat(){System.out.println("11111");}
//    void stat(){System.out.println("11111");}
}

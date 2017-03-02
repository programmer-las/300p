package com.svlugovoy.youtube300plus.q92;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 03.03.2016.
 */
public class Man implements Cloneable {

    private int id = 100;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

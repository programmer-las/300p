package com.svlugovoy.youtube300plus.q92;

import java.util.ArrayList;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 03.03.2016.
 */
class Student implements Cloneable{

    private int id = 1000;
    private String name;
    private int age;
    private ArrayList<Byte> markList = new ArrayList<>();

    public ArrayList<Byte> getMarkList() {
        return markList;
    }

    public Student clone(){
        Student copy = null;
        try {
            copy = (Student)super.clone();
//            copy.markList = (ArrayList<Byte>)markList.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }
}

public class Runner{
    public static void main(String[] args) {

        Student st = new Student();
        System.out.println(st);
        System.out.println("-----------");

        Student stc = st.clone();
        System.out.println(stc);
        System.out.println("-----------");

        System.out.println(st.getMarkList() == stc.getMarkList());
        System.out.println(st.getMarkList().equals(stc.getMarkList()));
    }

}
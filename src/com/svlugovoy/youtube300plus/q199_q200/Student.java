package com.svlugovoy.youtube300plus.q199_q200;

import java.io.Serializable;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 29.02.2016.
 */
public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password = null;
    private static final long serialVersionUID =1L;

    public Student(String nameOfFaculty, String name, int id,String password) {
        faculty = nameOfFaculty;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", \npassword='" + password + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}

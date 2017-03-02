package com.svlugovoy.youtube300plus.q199_q200;

import java.io.InvalidObjectException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 29.02.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Student student = new Student("FacultyX", "Ivan Ivanov", 123, "qwerty");
        System.out.println(student + "\n-------------");

        String file = "E:\\test\\demo.data";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(student, file);
        System.out.println(b + "\n-------------");

        Student.faculty = "YYY";
        System.out.println(student + "\n-------------");

        Student result = null;
        try {
            result = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(result + "\n-------------");


    }
}

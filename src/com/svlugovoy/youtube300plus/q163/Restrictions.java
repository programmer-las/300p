package com.svlugovoy.youtube300plus.q163;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.03.2016.
 */
class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
//        this.obj = new T();  //5.
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type T is " + obj.getClass().getName());
    }

//    static T sObj;
//    static T getSObj(){
//        return sObj;
//    }
    static void printSmth(){
        System.out.println("SMTH");
    }
}

public class Restrictions {
    public static void main(String[] args) {

//        Gen<int> gi; // 1. Ссылочные типы

        Gen<Integer> gint = new Gen<>(55);
        Gen<LocalDate> gdate = new Gen<>(LocalDate.now());

//        gint = gdate; // 2. Разные аргументы типа

        List<String> ls = new ArrayList<>(); // 3. <> Java7 +

        // 4. применяются в классах, интерфейсах, конструкторах, методах
        // параметр. класса и generic-методах обычных классов

        // 5. Экземпляр по пар-ру типа получить нельзя

        // 6. В статических членах нельзя использовать параметр типа,
        // объявленный в классе
        // Методу разрешено быть static если его параметр не имеет отношения
        // к параметру своего generic-класса.

        // 7. Обобщенный класс не может расширять Throwable.
        // Создать обобщенные классы исключений нельзя!

    }
}

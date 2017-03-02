package com.svlugovoy.youtube300plus.q16;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 02.03.2016.
 */
public class IfSwitchDemo {
    public static void main(String[] args) {

        int a = 1;
        int b = 10;

        if (a > b)
            System.out.println("a больше b!!! ");
        else
            System.out.println("b больше a!!! ");
        System.out.println("---------------");


        if (b > 5) {
            System.out.println("b больше 5!!! ");
            System.out.println("b = " + b);
        } else
            System.out.println("b меньше или равно 5!!! ");
        System.out.println("b = " + b);
        System.out.println("---------------");

        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                case 1: // case 2 пропущен!!!
                case 3:
                    System.out.println("i = " + i + ". i меньше 4.");
                    break;
                case 4:
                case 5:
                    System.out.println("i = " + i + ". i меньше 6.");
                    break;
                default:
                    System.out.println("i = " + i + ". i >= 6. или равно 2");
            }
        }
        System.out.println("---------------");

        int month = 9;
        String season;
        String nameMonth = null;

        if (month == 12 || month == 1 || month == 2) {
            season = "Зима";
            switch (month) {
                case 12:
                    nameMonth = "Декабрь";
                    break;
                case 1:
                    nameMonth = "Январь";
                    break;
                case 2:
                    nameMonth = "Февраль";
                    break;
            }
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Весна";
            switch (month) {
                case 3:
                    nameMonth = "Март";
                    break;
                case 4:
                    nameMonth = "Апрель";
                    break;
                case 5:
                    nameMonth = "Май";
                    break;
            }
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Лето";
            switch (month) {
                case 6:
                    nameMonth = "Июнь";
                    break;
                case 7:
                    nameMonth = "Июль";
                    break;
                case 8:
                    nameMonth = "Август";
                    break;
            }
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Осень";
            switch (month) {
                case 9:
                    nameMonth = "Сентябрь";
                    break;
                case 10:
                    nameMonth = "Октябрь";
                    break;
                case 11:
                    nameMonth = "Ноябрь";
                    break;
            }
        } else {
            season = "Нет такого времени года";
            nameMonth = "Нет такого месяца";
        }
        System.out.println(season + ", " + nameMonth);
        System.out.println("---------------");
    }


}

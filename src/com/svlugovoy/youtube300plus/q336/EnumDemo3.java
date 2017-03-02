package com.svlugovoy.youtube300plus.q336;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 13.03.2016.
 */

enum Days {
    SUNDAY(7, "GOOD DAY") {
        @Override
        public String shortname() {
            return "sun";
        }
    },
    MONDAY(1, "HARD") {
        @Override
        public String shortname() {
            return "mon";
        }
    },
    TUESDAY(2, "WORK") {
        @Override
        public String shortname() {
            return "tue";
        }
    },
    WEDNESDAY(3, "MIDDLE") {
        @Override
        public String shortname() {
            return "wed";
        }
    },
    THURSDAY(4, "WORK") {
        @Override
        public String shortname() {
            return "thu";
        }
    },
    FRIDAY(5, "SHORT DAY") {
        @Override
        public String shortname() {
            return "fri";
        }
    },
    SATURDAY(6, "REST") {
        @Override
        public String shortname() {
            return "sun";
        }
    };

    public abstract String shortname();

    int number;
    String status;

    private Days(int number, String status) {
        this.number = number;
        this.status = status;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {

        for (Days d: Days.values()) {
            System.out.println(d.shortname());
        }
    }
}

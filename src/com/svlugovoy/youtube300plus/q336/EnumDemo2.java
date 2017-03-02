package com.svlugovoy.youtube300plus.q336;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 13.03.2016.
 */
enum Day implements Runnable {
    SUNDAY(7, "GOOD  DAY"), MONDAY(1, "HARD"), TUESDAY(2, "WORK"), WEDNESDAY(3, "MIDDLE"),
    THURSDAY(4, "WORK"), FRIDAY(5, "SHORT DAY"), SATURDAY(6, "REST");

    public void run() {
        System.out.println("name()=" + name() +
                ", toString()=" + toString());
    }

    int order;
    String descr;

    Day(int order, String descr) {
        this.order = order;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Day{" +
                "descr='" + descr + '\'' +
                ", order=" + order +
                '}';
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {

        for (Day d: Day.values()) {
            d.run();
        }

    }
}

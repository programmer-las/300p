package com.svlugovoy.youtube300plus.q163;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.03.2016.
 */
public class ExamDemo {
    public static void main(String[] args) {

        Exam<Double> md1 = new Exam<>(75.95, "Math");
        Exam<Double> md2 = new Exam<>(75.75, "Math");

        System.out.println(md1.equalsToMark(md2));

        Exam<Integer> mi = new Exam<>(76, "Math");
//        System.out.println(mi.equalsToMark(md1));

    }
}

class Exam<T extends Number> {

    private String name;
    private T mark;

    public Exam(T mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue());
    }

    public boolean equalsToMark(Exam<T> obj) {
        return roundMark() == obj.roundMark();
    }

//    public boolean equalsToMark(Exam<?> obj) {
//        return roundMark() == obj.roundMark();
//    }

}

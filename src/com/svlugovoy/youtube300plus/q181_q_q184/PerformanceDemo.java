package com.svlugovoy.youtube300plus.q181_q_q184;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.03.2016.
 */
public class PerformanceDemo {
    public static void main(String[] args) {

        long start;
        long end;
        double delta;


        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        delta = (double) (end - start) / 1000000000;
        System.out.println("StringBuffer Time : " + String.format("%10.8f", delta) + " sec");

        StringBuilder sbd = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sbd.append("a");
        }
        end = System.nanoTime();
        delta = (double) (end - start) / 1000000000;
        System.out.println("StringBuilder Time : " + String.format("%10.8f", delta) + " sec");

    }
}

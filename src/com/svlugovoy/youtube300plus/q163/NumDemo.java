package com.svlugovoy.youtube300plus.q163;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.03.2016.
 */
public class NumDemo {
    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
        list.add((byte) 25);
        list.add((short) 29000);
        list.add(1_900_000_000);
        list.add(2_900_000_000L);
        list.add((float) 3.14);
        list.add(55.55);
        list.add(new BigInteger("123456789101112131415"));
        list.add(new BigDecimal("2.1e309"));

        for (Number n : list) {
            System.out.println(n);
        }

    }
}

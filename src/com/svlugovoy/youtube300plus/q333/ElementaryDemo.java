package com.svlugovoy.youtube300plus.q333;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.03.2016.
 */
public class ElementaryDemo {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(new Date());
        System.out.println("-----------------------");

        LocalDate d1 = LocalDate.of(2016, Month.JANUARY, 10);
        LocalDate d2 = LocalDate.of(2016, 1, 10); // с 1 !!!
        System.out.println(d1.equals(d2));
        System.out.println("-----------------------");

        LocalTime t1 = LocalTime.of(10, 30);
        LocalTime t2 = LocalTime.of(10, 30, 45);
        LocalTime t3 = LocalTime.of(10, 30, 45, 200);
        System.out.println(t1 + " " + t2 + " " + t3);
        System.out.println("-----------------------");

        LocalDateTime dt1 = LocalDateTime.of(2016, Month.JANUARY, 10, 10, 30, 45);
        LocalDateTime dt2 = LocalDateTime.of(d1, t2);
        System.out.println(dt1.equals(dt2));
        System.out.println("-----------------------");

//        LocalDateTime wrong = new LocalDateTime(); // does not compile!
//        LocalDateTime wrong = LocalDateTime.of(2016, Month.JANUARY, 32, 10, 30); // 32 ! DateTimeException!

        LocalDate date = LocalDate.of(2016, Month.JANUARY, 10);
        System.out.println(date);
        System.out.println(date.plusDays(2));
        System.out.println(date.plusWeeks(4));
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusYears(2).plusDays(1).minusWeeks(2));
        System.out.println(date);
        System.out.println("-----------------------");

        System.out.println(Period.ofDays(1));
        System.out.println(Period.ofMonths(3));

        Period p = Period.of(1, 0, 7);
        Period p1 = Period.ofYears(1).ofWeeks(1);
        System.out.println(p.equals(p1));
        Period p2 = Period.ofYears(1);
        p2 = Period.ofWeeks(1);
        System.out.println(p1.equals(p2));

        LocalDate ld = LocalDate.of(2016, Month.JANUARY, 10);
        LocalTime lt = LocalTime.of(10, 30);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        Period per = Period.ofMonths(1);
        System.out.println(ld.plus(per));
        System.out.println(ldt.plus(per));
//        System.out.println(lt.plus(per)); // UnsupportedTemporalTypeException
        System.out.println("-----------------------");

        LocalDate lDate = LocalDate.of(2016, Month.JANUARY, 10);
        LocalTime lTime = LocalTime.of(13, 30);
        LocalDateTime lDateTime = LocalDateTime.of(lDate, lTime);
        System.out.println(lDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(lTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(lDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        DateTimeFormatter shortDT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDT.format(lDateTime));
        System.out.println(shortDT.format(lDate));
//        System.out.println(shortDT.format(lTime)); // UnsupportedTemporalTypeException

        System.out.println(lDateTime.format(shortDT));
        System.out.println(lDate.format(shortDT));
//        System.out.println(lTime.format(shortDT)); // UnsupportedTemporalTypeException
        DateTimeFormatter mediumDT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(lDateTime.format(mediumDT));
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy =*/ HH:mm");
        System.out.println(lDateTime.format(f));

    }
}

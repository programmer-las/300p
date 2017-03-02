package com.svlugovoy.youtube300plus.q333;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.03.2016.
 */
public class TimeDateDemo {
    public static void main(String[] args) {

        // Clock
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);   // legacy java.util.Date
        System.out.println(clock + "\n" + millis + "\n"
                + instant + "\n" + legacyDate);
        System.out.println("-----------------------");

        // Часовые пояса
        System.out.println(ZoneId.getAvailableZoneIds());
//        String[] arr = ZoneId.getAvailableZoneIds().toString().split(",");
//        for (String s : arr) {
//            System.out.println(s.trim());
//        }
        ZoneId zone1 = ZoneId.of("Europe/Kiev");
        ZoneId zone2 = ZoneId.of("America/New_York");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        System.out.println("-----------------------");

        // LocalTime
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println( now1 + "\n" + now2);
        System.out.println(now1.isAfter(now2));
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
        System.out.println(hoursBetween);
        System.out.println(minutesBetween);
        System.out.println("-----------------------");

        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);
        DateTimeFormatter gsFormatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);
        LocalTime t = LocalTime.parse("13:37", gsFormatter);
        System.out.println(t);
        System.out.println("-----------------------");

        // LocalDate
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println(today + " " + tomorrow + " " + yesterday);
        LocalDate independenceDay = LocalDate.of(2016, Month.JULY, 4);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek);

        DateTimeFormatter gmFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate d = LocalDate.parse("01.05.2016", gmFormatter);
        System.out.println(d);
        System.out.println("-----------------------");

        // LocalDateTime
        LocalDateTime ny = LocalDateTime.of(2016, Month.DECEMBER, 31, 23, 59, 59);

        DayOfWeek dow = ny.getDayOfWeek();
        System.out.println(dow);
        Month month = ny.getMonth();
        System.out.println(month);
        long md = ny.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(md);
        Instant inst = ny
                .atZone(ZoneId.systemDefault())
                .toInstant();
        Date dt = Date.from(inst);
        System.out.println(inst + "\n" +dt);
        System.out.println("-----------------------");

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("MM dd, yyyy - HH:mm");

        LocalDateTime parsed = LocalDateTime.parse("03 20, 2016 - 07:15", formatter);
        String s = formatter.format(parsed);
        System.out.println(s);

        // Period
        LocalDate td = LocalDate.now();
        LocalDate ivanovBirthday = LocalDate.of(1990, Month.MAY, 20);
        Period period = Period.between(ivanovBirthday, td);
        long ivDays = ChronoUnit.DAYS.between(ivanovBirthday, td);
        String result = String.format(
                "Ivanov is %s years, %s months, and %s days old. (%s days total)",
                period.getYears(), period.getMonths(), period.getDays(), ivDays);
        System.out.println(result);

    }
}

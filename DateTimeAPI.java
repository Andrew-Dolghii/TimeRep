package andrew.Time;

import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today = " + today);

        ZoneId timezone = ZoneId.of("Europe/Paris");
        LocalDate todayParis = LocalDate.now(timezone);
        System.out.println("In Paris = " + todayParis);

        LocalDate date1 = LocalDate.of(2023, Month.FEBRUARY, 22);

        LocalDate date2 = LocalDate.ofYearDay(2023, 45);
        System.out.println("Today = " + date2);

        LocalDate date3 = LocalDate.ofEpochDay(1);
        System.out.println("Today = " + date3);

        LocalDate birthday = LocalDate.of(2022, 11, 10);
        LocalDate nextBirthday = birthday.plusYears(1);
        LocalDate firstBirthday = birthday.minusYears(16);
        System.out.println(birthday);
        System.out.println(nextBirthday);
        System.out.println(firstBirthday);

        //useful for alarm clocks, because no date
        LocalTime time = LocalTime.now();
        System.out.println("Now = " + time);

        LocalTime time2 = LocalTime.ofSecondOfDay(10000);
        System.out.println(time2);

        LocalTime time3 = time2.plusHours(2);
        LocalTime time4 = time2.minusMinutes(40);
        LocalTime time5 = time2.plusSeconds(3600);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Now = " + ldt);

        LocalDate datex = LocalDate.now();
        LocalTime timex = LocalTime.now();
        LocalDateTime currentx = LocalDateTime.of(datex, timex);
        System.out.println("Now = " + currentx);

        LocalDateTime dateLdt = LocalDateTime.of(2019, Month.MAY, 15, 12, 15, 2);
        System.out.println("Now = " + dateLdt);

        Instant timestamp = Instant.now();
        System.out.println(timestamp);

        long n = timestamp.toEpochMilli();
        Instant timet = Instant.ofEpochMilli(n);
        System.out.println(timet);

    }
}

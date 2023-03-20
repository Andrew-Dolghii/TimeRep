package andrew.Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateTimePractise {
    public static void outLengthMonths(int year){
        for(int month = 1; month <= 12; month++){
            YearMonth monthObj = YearMonth.of(year, month);
            int days = monthObj.lengthOfMonth();
            System.out.println("Month #" + month + ": " + days);
        }
    }

    public static boolean isFriday13th(Calendar date){
        int day = date.get(Calendar.DAY_OF_WEEK);
        return day == 6;
    }

    public static void checkAge(LocalDate birthday){
        LocalDate today = LocalDate.now();
        LocalDate age = today.minusYears(birthday.getYear());
        age = age.minusMonths(birthday.getMonthValue());
        age = age.minusDays(birthday.getDayOfMonth());

        int ageInYears = age.getYear();

        if(ageInYears < 0)
            System.out.println("Not born yet!");
        else
            System.out.println(ageInYears);
    }

    public static void main(String[] args) {

        //Task No. 1:
        outLengthMonths(2000);

        //Task No. 2:
        Calendar calendarEx = new GregorianCalendar(2023, Calendar.OCTOBER, 13);
        System.out.println(isFriday13th(calendarEx));

        //Task No. 3:
        LocalDate birthdayEx = LocalDate.of(2006, 11, 10);
        checkAge(birthdayEx);

        //Task No. 4:
        LocalDate myBirthday = LocalDate.of(2006, 11, 10);
        System.out.println("Day of week: " + myBirthday.getDayOfWeek());
        System.out.println("Day of month: " + myBirthday.getDayOfMonth());
        System.out.println("Day in year: " + myBirthday.getDayOfYear());
        System.out.println("Month: " + myBirthday.getMonth());
        System.out.println("Year: " + myBirthday.getYear());

        LocalDate today = LocalDate.now();
        System.out.println("Today is before my Birthday: " + today.isBefore(myBirthday));
        System.out.println("Today is after my Birthday: " + today.isAfter(myBirthday));

        long daysBetween = DAYS.between(myBirthday, today);
        System.out.println("Days passed since my birthday: " + daysBetween);
    }
}

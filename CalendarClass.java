package andrew.Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarClass {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        Date date = calendar.getTime();
        //System.out.println(date);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2017);
        calendar2.set(Calendar.MONTH, 0);
        calendar2.set(Calendar.DAY_OF_MONTH, 25);
        calendar2.set(Calendar.HOUR_OF_DAY, 19);
        calendar2.set(Calendar.MINUTE, 42);
        calendar2.set(Calendar.SECOND, 12);
        //changes other values accordingly (goes into previous year before December)
        //calendar2.add(Calendar.MONTH, -2);
        //Does not change other values (only impacts that specific one)
        calendar2.roll(Calendar.MONTH, -2);
        System.out.println(calendar2.getTime());
        System.out.println("Year: " + calendar2.get(Calendar.YEAR));

        GregorianCalendar cannes = new GregorianCalendar(216, Calendar.AUGUST, 2);
        cannes.set(Calendar.ERA, GregorianCalendar.BC);
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
        System.out.println(df.format(cannes.getTime()));
    }
}

package andrew.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateToString {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(1212121212121L);
        System.out.println(formatter.format(date));

        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat formatter2 = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        System.out.println(formatter2.format(date));

        try{
            Date date2 = formatter2.parse(strDate);
            System.out.println(formatter2.format(date2));
        }
        catch(ParseException e){
            e.printStackTrace();
            System.out.println("abc");
        }

        //M 2 times is number, M 3 times is month acronym, M 4 times is month full name
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String text = dtf.format(LocalDateTime.now());
        System.out.println(text);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        LocalDate date3 = LocalDate.parse("February-23-2019", dtf3);
        System.out.println(date3);

    }
}

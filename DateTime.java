package andrew.Time;

import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws InterruptedException {

        //time passed since Jan. 1 1970
        Date date = new Date(373733173732L);
        System.out.println(date);


        Date date1 = new Date();
        Thread.sleep(2000);
        Date date2 = new Date();
        System.out.println(date1.getTime());
        System.out.println(date1.getTime());
        System.out.println(date1.before(date2));
        System.out.println(date1.getHours());
    }
}

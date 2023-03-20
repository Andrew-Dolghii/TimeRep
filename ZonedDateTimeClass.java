package andrew.Time;

import java.time.*;

public class ZonedDateTimeClass {
    public static void main(String[] args) {

        for(String s: ZoneId.getAvailableZoneIds())
            System.out.println(s);

        ZoneId zone = ZoneId.of("Europe/Paris");
        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(time);

        ZoneId zoneMontreal = ZoneId.of("America/Los_Angeles");
        ZonedDateTime timeMontreal = ZonedDateTime.now(zoneMontreal);
        LocalDate localDate = timeMontreal.toLocalDate();
        LocalTime localTime = timeMontreal.toLocalTime();
        LocalDateTime localDateTime = timeMontreal.toLocalDateTime();
        System.out.println(localDateTime);
    }
}

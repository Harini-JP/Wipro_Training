package Day4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime{
    public static void main(String[] args) {
        // Current Date
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date: " + date);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current Date and Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: " + dateTime);
    }
}

package Day25_Constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/y");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println("Today date & time is: "+ starts.format(dtf));

        LocalDateTime list = LocalDateTime.of(2020,11,24,13,00);

        System.out.println(list.format(dtf));
    }
}
//1. use the LocalDateTime get the date and time in the following format:
//            Tuesday, 1:00 pm, Nov/24/2020
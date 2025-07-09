package itmo.java.basics.lessons.lesson14;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(date);

        Date start = new Date(0);
//        System.out.println(start);

//        double years = (date.getTime() - start.getTime()) / 1000.0 / 60 / 60 / 24 / 365;
//        System.out.println(new DecimalFormat("#.##").format(years));


//        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
//
//        System.out.println(Arrays.toString(Month.values()));
//        System.out.println(Month.APRIL.ordinal());
//        System.out.println(Month.APRIL.name());


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

//        Date timeZoneDate = null;
//        try {
//            timeZoneDate = dateFormat.parse("2010-05-23T09:01:02");
//        } catch (ParseException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(timeZoneDate);
//
//        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.of("Asia/Seoul"));
//        System.out.println(zonedDateTime);

//        DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String currentDate = dateFormat2.format(date);
//        System.out.println(currentDate);


        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);


        LocalDateTime dateTime = LocalDateTime.of(2014, 5, 3, 12, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2014, Month.FEBRUARY, 3, 12, 15, 30);
//        System.out.println(dateTime);

        LocalDate someDate = localDate.plusMonths(60);
//        System.out.println(someDate);

//        String formattedDate = now.format(DateTimeFormatter.ofPattern("HH:mm:ss yyyy/MM/dd"));
//        System.out.println(formattedDate);
//
//        System.out.println(localDate);
//        LocalDate parse = LocalDate.parse("123-2020-12", DateTimeFormatter.ofPattern("dd-yyyy-MM"));
//        System.out.println(parse);

//        Period period = Period.between(localDate, someDate);
//        System.out.println(period.getYears());

        Date any = new Date();
        LocalDateTime ofInstant = LocalDateTime.ofInstant(any.toInstant(), ZoneId.of("UTC"));
    }


    public Date convertToDateViaSqlDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }

    public Date convertToDateViaSqlTimestamp(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }

}

package com.herbalife.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class WorkingWithDateAndTime {
    public static void main(String[] args) throws ParseException {
        //Old style
        Date dt = new Date();
        System.out.println(dt.toString());
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());

        //java.time
        Instant now = Instant.now();
        System.out.println(now.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(sdf.format(dt));
        System.out.println(sdf.parse(localDate.toString())); //Need to refer to the documentation
    }
}

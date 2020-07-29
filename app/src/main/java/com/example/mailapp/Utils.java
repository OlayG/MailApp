package com.example.mailapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

// This class is a Utility class that has miscellaneous methods to perform different tasks
public class Utils {

    // This method allows me to Convert Calendar to friendly display time string
    public static String calendarToFormattedTime(Calendar calendar) {
        //Displaying current time in 12 hour format with AM/PM
        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa", Locale.getDefault());
        return dateFormat.format(calendar.getTime());
    }
}

package com.quest.Dec4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class IndianDate {
    public static void main(String[] args) {

        SimpleDateFormat indianDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        String formattedDate = indianDateFormat.format(new Date());

        System.out.println("Date in Indian format: " + formattedDate);
    }
}


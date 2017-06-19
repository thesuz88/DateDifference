package com.jetbrains;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //get first date input from user
        System.out.println("Enter a date (yyyy-mm-dd): ");
        String dateString1 = scnr.next();

        //check format for first date
        while(!dateString1.matches("\\d{4}['-]\\d{2}['-]\\d{2}")){
            System.out.println("Format is incorrect, please re-enter date: ");
            dateString1 = scnr.next();
        }

        //get second date input from user
        System.out.println("Enter a second date (yyyy-mm-dd): ");
        String dateString2 = scnr.next();

        //check format for second date
        while(!dateString2.matches("\\d{4}['-]\\d{2}['-]\\d{2}")){
            System.out.println("Format is incorrect, please re-enter date: ");
            dateString2 = scnr.next();
        }

        //convert string to LocalDate
        LocalDate date1 = LocalDate.parse(dateString1);
        LocalDate date2 = LocalDate.parse(dateString2);

        //calculate days between
        Period period = Period.between(date1, date2);

        //break days between into yr, mo, days
        System.out.println("Difference in years: " + period.getYears()); //print difference in years
        System.out.println("Difference in months: " + period.getMonths());//print difference in months
        System.out.println("Difference in days: " + period.getDays()); //print difference in days


    }

}

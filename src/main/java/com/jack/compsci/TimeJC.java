package com.jack.compsci;

import java.util.Scanner;

public class TimeJC {

    public static void main(String[] arg) {
        String timeDisplay;
        int days= 0; // Number of days to display
        int hours = 0; // Number of hours to display
        int minutes = 0; // Number of minutes to display
        int totalSeconds = 60; //Number of seconds entered by user (60 by default)


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a time in seconds.");
        totalSeconds = scanner.nextInt(); //Reads input from user

        if(totalSeconds >= 86400) {
            days = totalSeconds / 86400;
            totalSeconds -= days * 86400; // Removing days from total
        }
            if (totalSeconds >= 3600) {
                hours = totalSeconds / 3600;
                totalSeconds -= hours * 3600; // Removing Hours from total
            }
            if (totalSeconds >= 60) {
                minutes = totalSeconds / 60;
                totalSeconds -= minutes * 60; // Removing Minutes from total
            }

            System.out.println("You have entered " + days + "d " + hours + "h " + minutes + "m " + totalSeconds + "s");


    }
}

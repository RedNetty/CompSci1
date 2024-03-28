package com.jack.compsci;

import java.util.Scanner;

public class StringManipulatorJC
{


    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String cityName = "Nashville"; // Just setting it to Nashville by default.

        System.out.println("Please enter your favorite city name.");
        cityName = scanner.nextLine();

        System.out.println("There are " + cityName.length() + " characters in your favorite city's name.");
        System.out.println("All Capitalized: " + cityName.toUpperCase());
        System.out.println("All Lowercase: " + cityName.toLowerCase());
        System.out.println("The First Character of your city is " + (cityName.charAt(0)) );

    }
}

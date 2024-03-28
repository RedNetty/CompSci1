package com.jack.compsci;

import java.util.Scanner;

public class MagicDatesJC {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (in numeric form): ");
        int month = input.nextInt();

        System.out.print("Enter a day: ");
        int day = input.nextInt();

        System.out.print("Enter a two-digit year: ");
        int year = input.nextInt();

        if (month * day == year) {
            System.out.println("The date is magic.");
        } else {
            System.out.println("The date is not magic.");
        }

        input.close();
    }
}

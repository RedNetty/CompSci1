package com.jack.compsci;


import com.jack.compsci.friends.Person;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Add {

    public static void main(String[] args) {
        double ourSubTotal = ThreadLocalRandom.current().nextDouble(16, 34);
        double ourStatesSalesTax = 9.5;
        double ourTip = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your subtotal is $" + formatFinal(ourSubTotal) +
                "\nYour states sales tax is $" + formatFinal(calculateTax(ourSubTotal, ourStatesSalesTax))
                + "\nPlease enter your tip amount: ");

        while (ourTip == 0) {
            try {
                ourTip = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect format please enter your desired tip.");
            }
        }


        double finalCost = calculateTotal(ourSubTotal, ourStatesSalesTax, ourTip);
        System.out.println("Your finished total is: $" + formatFinal(finalCost));

    }

    private static String formatFinal(double cost) {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        return decimalFormat.format(cost);
    }

    private static double calculateTax(double subtotal, double salesTax) {
        return subtotal * salesTax / 100;
    }

    private static double calculateTotal(double subtotal, double salesTax, double tip) {
        return subtotal + calculateTax(subtotal, salesTax) + tip;
    }


}
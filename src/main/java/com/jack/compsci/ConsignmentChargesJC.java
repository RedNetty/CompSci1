package com.jack.compsci;

import java.util.Scanner;

public class ConsignmentChargesJC {

    public static void main(String[] args) {
        int weight, miles;
        int rateMultiplier = 0;
        double priceToCharge = 1.10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the weight of your package.");

        weight = scanner.nextInt();

        System.out.println("Please enter estimated miles for your package.");

        miles = scanner.nextInt();

        if(weight > 2 && weight <= 6) {
            priceToCharge = 2.20;
        } else if (weight >6 && weight <= 10) {
            priceToCharge = 3.70;

        } else if (weight > 10) {
            priceToCharge = 3.80;
        }

        while(miles >= 1) {
            miles -= 500;
            rateMultiplier++;
        }

        System.out.println("Your estimated shipping price is: $" + (priceToCharge * rateMultiplier) );
    }
}

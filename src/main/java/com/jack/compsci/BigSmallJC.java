package com.jack.compsci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigSmallJC {


    public static void main(String[] args) {
        List<Integer> numbersEntered = new ArrayList<>();
        int lowestNumber = 0;
        int highestNumber = 0;
        System.out.println("Please enter your series of numbers, and type -99 when finished.");

        Scanner scanner = new Scanner(System.in);

        try {

            while (!numbersEntered.contains(-99)) {
                    numbersEntered.add(scanner.nextInt());

            }

            for (int number : numbersEntered) {
                if(number == -99) continue;
                if (!numbersEntered.contains(0) && lowestNumber == 0)
                    lowestNumber = number; // Making sure 0 is never picked if not in the lot
                if (!numbersEntered.contains(0) && highestNumber == 0) highestNumber = number;

                if (number < lowestNumber) {
                    lowestNumber = number;
                }
                if (number > highestNumber) {
                    highestNumber = number;
                }
            }

            System.out.print("Your lowest number is: " + lowestNumber + " and your highest is: " + highestNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

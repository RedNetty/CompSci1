package com.jack.compsci;

import java.util.Scanner;

public class AreaOfRectJC {


    private static double length = 0;
    private static double width = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayData(getLength(scanner), getWidth(scanner), getArea());
    }
    private static void displayData(double length, double width, double area) {
        System.out.println("You length is: " + length +
                "\nYour width is: " + width +
                "\nYour area is: " + area);

    }
    private static double getArea() {
        return length * width;
    }

    private static double getLength(Scanner scanner) {
        System.out.println("Enter the length.");
        length = scanner.nextInt();
        return length;
    }

    private static double getWidth(Scanner scanner) {
        System.out.println("Enter the width.");
        width  = scanner.nextInt();
        return width;
    }
}

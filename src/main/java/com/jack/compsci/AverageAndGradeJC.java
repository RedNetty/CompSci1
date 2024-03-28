package com.jack.compsci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageAndGradeJC {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> enteredGrades = new ArrayList<>();
        boolean finished = false;

        System.out.println("Please enter your test grades (Once finished enter 'complete')");

        while(!finished) {
            if(scanner.nextLine().equalsIgnoreCase("complete")) {
                finished = true;
                System.out.println("Grade entry completed..\nIf you would like to view your Average enter 'A' \n" +
                        "For your letter grade enter 'L'");

                outputDecider(scanner, enteredGrades); // Sends the grades and Scanner Object to a secondary method
            }
            if(scanner.hasNextInt()) enteredGrades.add(scanner.nextInt());
        }

    }
    private static void outputDecider(Scanner scanner, List<Integer> grades) {
        switch (scanner.nextLine().toLowerCase()) {
            case "a":
                System.out.println("Your average grade is " + calcAverage(grades));
                outputDecider(scanner, grades); //Allows Re-entry if user wants to check letter grade
                break;
            case "l":
                System.out.println("Your letter grade is " + determineGrade(grades));
                outputDecider(scanner, grades); //Same as above
                break;
            default:
                System.out.println("Please enter one of the two options.. \nIf you would like to view your Average enter 'A' \n" +
                        "For your letter grade enter 'L'");
        }
    }
    public static int  calcAverage(List<Integer> grades)  {
        int addedGrade = 0; //Basic Averaging Arithmetic
        for (Integer grade : grades) {
            addedGrade += grade;
        }

        return addedGrade / grades.size();
    }
    public static char determineGrade(List<Integer> grades)  {
        int studentAverage = calcAverage(grades);
        if(studentAverage >= 90) { //Simple Else-If logic to decide letter grade
            return 'A';
        }else if(studentAverage >= 80) {
            return 'B';
        }else if(studentAverage >= 70) {
            return 'C';
        }else if(studentAverage >= 60) {
            return 'D';
        }
        return 'F';
    }

}

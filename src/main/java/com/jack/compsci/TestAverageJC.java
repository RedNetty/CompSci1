

import java.util.Scanner;

public class TestAverageJC {


    public static void main(String[] args) {
        int score1, score2, score3, average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first test score.");
        score1 = scanner.nextInt();

        System.out.println("Please enter your second test score.");
        score2 = scanner.nextInt();

        System.out.println("Please enter your third test score.");
        score3 = scanner.nextInt();

        System.out.println("Your current test scores are " + score1 + ", " + score2 + ", " + score3);

        average = (score1+score2+score3) / 3;

        System.out.print("The average of all three scores is " + average);
    }
}

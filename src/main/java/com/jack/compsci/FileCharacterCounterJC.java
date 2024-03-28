package com.jack.compsci;

import java.io.*;
import java.util.Scanner;

public class FileCharacterCounterJC {

    public static void main(String[] arg) throws FileNotFoundException {
        // Initialize variables to store the character to search for and its count
        char charToCheck = 0;
        int charCount = 0;

        // Initialize file name (null for initial loop)
        String fileName = null;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Repeat until a valid file name is provided
        while (fileName == null) {
            System.out.println("[File Char Counter] - Please enter a proper file name");
            String enteredFileName = scanner.nextLine();

            // If the entered name is empty, use a default file name
            fileName = "./" + (enteredFileName.isEmpty() ? "RandomWikipediaPage.txt" : enteredFileName);
        }

        System.out.println("[File Char Counter] - Please enter char to check for.");
        // Get the first character entered by the user
        charToCheck = scanner.nextLine().charAt(0);

        // Use try-with-resources to automatically close the reader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Convert the line into a character array
                for (char c : line.toCharArray()) {
                    // Check if the current character matches the character to count
                    if (c == charToCheck) {
                        charCount++;
                    }
                }
            }
            System.out.println("[File Char Counter]  There are [" + charCount + "] of the character '" + charToCheck + "' in your text.");
        } catch (IOException e) {
            // Handle exceptions (e.g., file not found) and rethrow for the program to halt
            throw new RuntimeException(e);
        }
    }
}

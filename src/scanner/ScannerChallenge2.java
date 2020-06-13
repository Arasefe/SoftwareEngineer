package scanner;

import java.util.Scanner;

public class ScannerChallenge2 {
    /*
-Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Create a Scanner1.Scanner,
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x:Åh where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you donÅft need it anymore.
-Create a project with the name ReadingUserInputChallenge.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count < 11) {
            System.out.println("Please enter the " + count + " # number :");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;

            } else {
                System.out.println("Invalid Value");
            }

            scanner.nextLine();                         //handle end of line enter key

        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}

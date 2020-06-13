package scanner;

import java.util.Scanner;

public class ScannerChallenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        boolean isNextInt = scanner.hasNextInt();
        int min = 0;
        int max = 0;


        while (true) {

            if (isNextInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < max) {
                    min = number;
                } else {
                    break;
                }
                scanner.nextLine();             //handle input
            }
            scanner.close();
        }
    }
}

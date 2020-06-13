package scanner;

import java.util.Scanner;

public class InputCalculator {
        public static void inputThenPrintSumAndAverage(){
            Scanner scanner=new Scanner(System.in);
            // int numbers=scanner.nextInt();
            System.out.println("Please enter the number");
            boolean isNextInt=scanner.hasNextInt();
            int count=0;
            while (true) {
                int number = scanner.nextInt();
                number+=number;
                count++;
                long average=number/count;
                if(!isNextInt){

                    System.out.println("SUM = "+number+ " AVG = "+average);
                }
            }

        }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    }


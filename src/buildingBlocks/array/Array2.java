package buildingBlocks.array;

import java.util.Scanner;

public class Array2 {
    private static Scanner scanner = new Scanner(System.in);        // why static

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {                   //return type is int[]
        System.out.println("Enter " + number + " integer value");
        int[] values = new int[number];                             //capacity = number

        for(int i=0; i<values.length; i++) {                        //elements = scanner.nextInt()
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
}

package buildingBlocks.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           // System.out.println("Element " + i + " contents " + array[i]);
        }
        System.out.println(Arrays.toString(array));

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);         //Assigned the copy of array to sortedArray
        int temp=0;
        for (int i=0;i<sortedArray.length;i++){
            for (int k=i+1;k<sortedArray.length;k++){
                if (sortedArray[i]< sortedArray[k]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[k];
                    sortedArray[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }

}
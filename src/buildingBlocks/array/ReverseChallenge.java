package buildingBlocks.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {
    /**
     * Write a method called reverse() with an int array as a parameter.
     * The method should not return any value. In other words, the method is allowed to modify the array parameter.
     * In main() test the reverse() method and print the array both reversed and non-reversed.
     * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
     * For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
     */
    public static void main(String[] args) {
        reverse(new int[]{12,34,23,43,14,54,2,3,56});

    }
    public static void reverse(int[] number){
        int []reversed=new int[number.length];
        int temp;
        for (int i=0,k=number.length-1;i<number.length;i++,k-- ){
            reversed[k]=number[i];

        }
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(reversed));
    }
}

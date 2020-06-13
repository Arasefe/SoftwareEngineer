package buildingBlocks.array;


import java.util.Scanner;

public class Array3 {
    public static Scanner scanner=new Scanner(System.in);           //CLASS SCANNER
    public static void main(String[] args) {
       int []numbers= getInteger(5);
       for(int i=0;i<numbers.length;i++){
            System.out.println("Element "+ i +" ,typed value is " + numbers[i]);
       }
        System.out.println("The average is "+ getAverage(numbers));


    }
    public static int[] getInteger(int number){
        System.out.println("Enter "+ number + " integer value");
        int[]values=new int[number];

        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();

        }
        return values;
    }


    static public double getAverage(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}

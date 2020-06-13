package buildingBlocks.variables;


public class Primitives {
    public static void main(String[]args) {
        int a=Integer.MAX_VALUE;
        System.out.println(a+1);        // OVERFLOW

        byte b=Byte.MIN_VALUE;
        System.out.println(b-1);        // UNDERFLOW

        short s=Short.MAX_VALUE;
        System.out.println(s+1);        // OVERFLOW

        long l=Long.MIN_VALUE;
        System.out.println(l-1);        // UNDERFLOW


    }


}

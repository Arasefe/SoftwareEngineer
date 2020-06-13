package numbers;

public class DecimalComparator {
    public static boolean decimalComparator(double num1, double num2){
        if((int)(num1*1000)==(int)(num2*1000)){
            System.out.println("true");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        decimalComparator(3.134,3.134);
    }
}

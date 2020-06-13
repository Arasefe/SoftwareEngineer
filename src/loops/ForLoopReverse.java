package loops;

public class ForLoopReverse {
    public static void main(String[] args) {
        for(double i=8; i>=2;i--){
            double amount = 10_000;
            System.out.println(calculateInterest(amount,i));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
}

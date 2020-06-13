package numbers;

public class EvenDigitSum {
    private static int getEvenDigitSum(int number) {      //157
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number = number / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(147823));
    }
}

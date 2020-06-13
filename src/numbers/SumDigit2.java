package numbers;

public class SumDigit2 {
    public static int sumDigit(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum+=digit;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigit(45230));
        System.out.println(sumDigit(-23423));
        System.out.println(sumDigit(11));
        System.out.println(sumDigit(762398634));
        System.out.println(sumDigit(5));
    }
}

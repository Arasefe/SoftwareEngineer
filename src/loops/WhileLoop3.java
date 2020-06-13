package loops;

public class WhileLoop3 {
    public static String isEvenNumber(int number) {
        if (number % 2 == 0) {
            return "Even Number";
        }
        return "Odd Number";
    }

    public static void main(String[] args) {
        int count = 0;
        int start = 12, end = 36;
        while (start <= end) {        //12
            start++;
            if (isEvenNumber(start) == "Even Number") {
                System.out.println("Even number " + start);
                count++;
                if (count == 5) {
                    break;
                }
            }

        }
        System.out.println("The total numbers of found as an even " + count);
    }
}

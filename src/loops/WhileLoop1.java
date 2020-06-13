package loops;

public class WhileLoop1 {
    public static void main(String[] args) {
        int number = 5, finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!evenNumber(number)) {           // If the number is not even number the code ignores and goes to the next one and tests it.
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean evenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}


package numbers;

public class EvenNumber2 {
    public static void evenNumber(int start, int end) {
        if ((start > end) || (end < 1)) {
            System.out.println("Invalid value");;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        evenNumber(3,45);
    }
}

package numbers;

public class EvenNumber1 {
    public static boolean evenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(evenNumber(5));
    }
}

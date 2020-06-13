package loops;

public class WhileLoop2 {
    /*
    Modify the while code above
    Make it also record the total number of even numbers it has found and break once 5 are found
    and at the end, display the total number of even numbers found.
    Create a method called isEvenNumber that takes a parameter of type int
    Its purpose is to determine if the argument passed to the method is an even number or not.
    return true if an even number, otherwise return false;
     */

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int count=0;
        int start=12,end=36;
        while(start<=end) {        //12
            start++;
            if(!isEvenNumber(start)){
                continue;
            }
            System.out.println("Even number "+ start);
            count++;
            if(count==5){
                break;
            }
        }
        System.out.println("The total numbers of found as an even "+count);
    }
}

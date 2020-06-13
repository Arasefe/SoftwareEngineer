package numbers;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(23));
    }
    public static long factorial(int n){
        int i;
        long fact;
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }
        else{

            if(n==0){
                return 1;
            }
            fact=1;
            for(i=1;i<=n;i++){
                fact*=i;
            }
            return fact;
        }
    }
}

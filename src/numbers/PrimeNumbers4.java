package numbers;

public class PrimeNumbers4 {
    public static boolean isPrime(int number){
        if (number==1){
            return false;
        }
        for (int i=2;i<=number/2;i++){          //number/2 olmak zorunda
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count=0;
        for (int j=2;j<=150;j++){
            if(isPrime(j)){
                System.out.println("The number "+ j + "is a prime number");
                count ++;
            }
            if(count==35){
                System.out.println("Exiting the code");
                break;
            }
        }
    }

}

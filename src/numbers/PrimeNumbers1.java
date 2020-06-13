package numbers;

public class PrimeNumbers1 {
    /*
     Create a for statement using any range of numbers
     Determine if the number is a prime number using the isPrime method
     if it is a prime number, print it out AND increment a count of the
     number of prime numbers found if that count is 3 exit the for loop
     */
    public static void isPrime(int number) {        //5
        String primeNumbers="";
       for (int i = 2; i <= number; i++) {          //2 3 4 5
           int count=0;
            for (int j = i; j>=1; j--) {          //2 3 4 5
                if (i % j == 0 ) {                 //2 3 4 5
                    count++;
                }
            }
            if(count==2){
                primeNumbers=primeNumbers+i;
            }
       }
        System.out.println(primeNumbers);
    }

    public static void main(String[] args) {
        isPrime(15);
    }
}


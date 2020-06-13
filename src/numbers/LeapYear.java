package numbers;

public class LeapYear {
        public static boolean isLeapYear(int year){
            if(year>=1 && year<=9999){
                if((year%4==0) && ((year%100!=0) || (year%400==0))){
                    System.out.println(year+" is a LeapYear");
                    return true;
                }
                System.out.println(year+" is not a LeapYear");
                return false;
            }
            else{
                System.out.println(year+" is not a LeapYear");
                return false;
            }
        }

    public static void main(String[] args) {
        isLeapYear(1924);
    }

}

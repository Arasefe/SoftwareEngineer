package numbers;

public class MinutesDaysYears {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long hour=minutes/60;               //525600/60=8766
            long remainderMinutes=minutes%60;   //0
            long day=hour/24;                   //8766/24=365
            long remainderHour=hour%24;         //6
            long year=day/365;                  //365/365=1
            long remainderDay=day%365;
            System.out.println(minutes+ " min = " + year+ " y and "+remainderDay+ " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}

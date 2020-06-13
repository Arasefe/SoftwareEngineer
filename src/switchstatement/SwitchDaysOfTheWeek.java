package switchstatement;

public class SwitchDaysOfTheWeek {
    /*
    Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
The method should not return any value (hint: void)
Using a switch statement print Sunday, Monday, Åc ,Saturday if the int parameter
day is 0, 1, 2 , 6 respectively, otherwise it should print Invalid day.
Bonus:
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name DayOfTheWeekChallenge
     */
    public static void printDayOfTheWeek(int day) {
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a day");
                break;
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(12);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
    }
}

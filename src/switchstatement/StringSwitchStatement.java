package switchstatement;

public class StringSwitchStatement {
    public static void main(String[] args) {
        String month="June";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("First month of the year");
                break;
            case "february":
                System.out.println("Second month of the year");
                break;
            case "march":
                System.out.println("Third month of the year");
                break;
            case "april":
                System.out.println("My wife was borne in this month");
                break;
            case "may":
                System.out.println("The fifth month of the year");
                break;
            case "june":
                System.out.println("My son Tulpar and i were born in this month");
                break;
            case "july":
                System.out.println("The seventh month of the year");
                break;
            case "august":
                System.out.println("Victory month");
                break;
            case "september":
                System.out.println("My son Aras was born in this month");
                break;
            case "october":
                System.out.println("October fest ");
                break;
            case "november":
                System.out.println("The eleventh month of the year");
                break;
            case "december":
                System.out.println("The last month of the year");
                break;
        }
    }
}

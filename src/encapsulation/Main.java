package encapsulation;

public class Main {
    public static void main(String[] args) {
        //Player player=new Player("ARAS",99,"Right Kick");
        //System.out.println("initial health is "+ player.getHealth());


        Printer printer=new Printer(34,true);
        System.out.println("Initial page count"+ printer.getPagesPrinted());
        int pagesPrinted=printer.printPage(35);
        System.out.println("Total pages printed was "+ pagesPrinted+ "new total print count for printer ="+ pagesPrinted);
        pagesPrinted=printer.printPage(20);
        System.out.println("Total pages printed was "+ pagesPrinted+ "new total print count for printer ="+ pagesPrinted);



    }
}

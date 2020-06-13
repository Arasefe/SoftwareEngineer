package encapsulation;

public class Printer {
    /**
     *Create a class and demonstrate proper encapsulation techniques
     *the class will be called Printer. It will simulate a real Computer Printer
     *It should have fields for the toner Level, number of pages printed, and
     *also whether its a duplex printer (capable of printing on both sides of the paper).
     *Add methods to fill up the toner (up to a maximum of 100%), another method to
     *simulate printing a page (which should increase the number of pages printed).
     *Decide on the scope, whether to use constructors, and anything else you think is needed.
     */
    private int tonerLevel;
    private int pagesPrinted=0;                 // set to 0
    private boolean isDublex;
    public Printer(int tonerLevel, boolean isDublex){
        this.tonerLevel=tonerLevel;
        //this.pagesPrinted=pagesPrinted;
        this.isDublex=isDublex;
    }
    public int getTonerLevel(){
        return tonerLevel;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
    public boolean isDublex(){
        return isDublex;
    }
    public int addToner(int addAmount) {
        if (addAmount <= 100 && addAmount > 0) {
            if (this.tonerLevel + addAmount > 100) {
                return -1;
            }
            this.tonerLevel+=addAmount;
            return this.tonerLevel;

        }else {
            return -1;
            }
        }
    public int printPage(int pages){
        int pagesToPrint=pages;
        if(this.isDublex){
            pagesToPrint=(pages/2)+pages%2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesPrinted;
    }
}

package composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("22B","Apple","240",dimensions);
        Monitor monitor=new Monitor("13 Inch","Apple", 13,new Resolution(2540,1440));
        Motherboard motherboard=new Motherboard("BJ-320","Apple",64,"v.2.44.01");
        PC thePC=new PC(theCase,monitor,motherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"yellow");
        thePC.getMotherboard().loadProgram("Windows 8.0");
        thePC.getTheCase().getDimensions();


        Resolution theResolution=new Resolution(1800,2400);
        Table theTable=new Table("IKEA","126BS65",65,180,86);
        Couch theCouch=new Couch("IKEA","FRIHETEN",230,140);
        Carpet theCarpet=new Carpet("IKEA","HEMNES","180X120","Wool");
        Television theTV=new Television("Samsung","4200","65",theResolution);

        Room theRoom=new Room(theTV,theTable,theCouch,theCarpet);
        theRoom.getTheTelevision().getManufacturer();
        theRoom.getTheTelevision().getModel();
        theRoom.getTheTelevision().getResolution();



    }
}

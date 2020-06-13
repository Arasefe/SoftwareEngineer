package composition;

public class Television {
    private String manufacturer;
    private String model;
    private String size;
    private Resolution theResolution;

    public Television(String manufacturer, String model, String size, Resolution theResolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.theResolution = theResolution;
    }
    public void turnOn(){
        System.out.println("Tv->Turning on");
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public Resolution getResolution() {
        return theResolution;
    }
}

package composition;

public class Couch {
    private String manufacturer;
    private String model;
    private int length;
    private int width;
    private boolean isCouchBed;

    public Couch(String manufacturer, String model, int length, int width) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.length = length;
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean isCouchBed() {
        return isCouchBed;
    }
}

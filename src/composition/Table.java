package composition;

public class Table {
    private String manufacturer;
    private String model;
    private int width;
    private int length;
    private int height;

    public Table(String manufacturer, String model, int width, int length, int height){
        this.manufacturer=manufacturer;
        this.model=model;
        this.width=width;
        this.length=length;
        this.height=height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}

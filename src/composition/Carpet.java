package composition;

public class Carpet {
    private String manufacturer;
    private String model;
    private String size;
    private String content;

    public Carpet(String manufacturer, String model, String size, String content) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.content = content;
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

    public String getContent() {
        return content;
    }
}

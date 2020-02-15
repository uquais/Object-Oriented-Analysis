import enums.*;

public class Guitar {

    private String serialNumber, model;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, String model, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }
}





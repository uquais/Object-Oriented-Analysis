import enums.*;

public class Guitar {

    private String serialNumber, model;
    private eBuilder builder;
    private eType type;
    private eWood backWood,topWood;
    private double price;

    public Guitar(String serialNumber, eBuilder builder, String model, eType type, eWood backWood, eWood topWood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public eBuilder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public eType getType() {
        return type;
    }

    public eWood getBackwood() {
        return backWood;
    }

    public eWood getTopwood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}

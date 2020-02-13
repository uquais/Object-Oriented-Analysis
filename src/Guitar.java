public class Guitar {

    private String serialNumber,builder, model, type, backWood, topWood;
    private double price;

    public Guitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    @Override
    public String toString() {
        return serialNumber;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackwood() {
        return backWood;
    }

    public String getTopwood() {
        return topWood;
    }

    public double getPrice() {
        return price;
    }
}

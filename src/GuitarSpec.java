import enums.*;

public class GuitarSpec {

    private eBuilder builder;
    private eType Type;
    private eWood backWood, topWood;

    public GuitarSpec(eBuilder builder, eType type, eWood backWood, eWood topWood) {

        this.builder = builder;
        Type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


    public eBuilder getBuilder() {
        return builder;
    }

    public eType getType() {
        return Type;
    }

    public eWood getBackWood() {
        return backWood;
    }

    public eWood getTopWood() {
        return topWood;
    }
}

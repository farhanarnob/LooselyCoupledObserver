package model;

public class DataModel {
    private int power = 10;
    private String powerName = "Power Of java";

    public int getPower() {
        return power;
    }

    public DataModel setPower(int power) {
        this.power = power;
        return this;
    }

    public String getPowerName() {
        return powerName;
    }

    public DataModel setPowerName(String powerName) {
        this.powerName = powerName;
        return this;
    }
}

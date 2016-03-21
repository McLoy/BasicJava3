package objects;

/**
 * Created by McLoy on 21.03.2016.
 */
public class Phone {
    private  int ram, battery;
    private String name,type,color;

    public Phone() {
    }

    public Phone(int ram, String name, String type) {
        this.ram = ram;
        this.name = name;
        this.type = type;
    }

    public Phone(int ram, int battery, String name, String type, String color) {
        this.ram = ram;
        this.battery = battery;
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}

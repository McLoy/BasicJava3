import objects.Phone;

/**
 * Created by McLoy on 21.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(1024,"Samsung","GSM");
        System.out.println(phone.getType());

        Phone phone2 = new Phone(1024, 2000, "Lenovo", "GSM", "Black");
        System.out.println("Batery: " + phone2.getBattery());
        System.out.println("Color: " + phone2.getColor());
    }
}

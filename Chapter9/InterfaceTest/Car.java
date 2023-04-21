package Chapter9.InterfaceTest;

public class Car implements Comparable {

    private String brand;
    private String model;
    private int speed;
    private int price;

    // {
    // brand = "Unknown";
    // model = "Unknown";
    // speed = 0;
    // price = 0;
    // }

    @Override
    public String toString() {
        return "Car [brand:" + brand + ", model:" + model + ", speed:" + speed + ", price:" + price + "]";
    }

    public Car() {
        this("Unknown", "Unknown", 0, 0);
    }

    public Car(String brand, String model, int speed, int price) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Comparable obj) {
        Car car = (Car) obj;
        if (price > car.getPrice()) {
            return 1;
        } else if (price == car.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}

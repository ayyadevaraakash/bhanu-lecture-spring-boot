class Car {
    private static Car obj = null;

    private Car() {}

    String color;
    int mileage;

    void run() {
        System.out.println("Car is running");
    }

    public static Car getCarObject() {
        if (obj == null) {
            obj = new Car();
        }
        return obj;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Car car = Car.getCarObject();
        Car car2 = Car.getCarObject();

        if (car == car2) {
            System.out.println("both are same");
        } else {
            System.out.println("both are different");
        }
    }
}

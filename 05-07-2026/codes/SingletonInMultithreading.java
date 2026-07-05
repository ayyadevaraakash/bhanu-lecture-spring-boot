class Car {
    private static Car obj = null;

    private Car() {}

    String color;
    int mileage;

    void run() {
        System.out.println("Car is running");
    }

    public synchronized static Car getCarObject() {
        if (obj == null) {
            obj = new Car();
        }
        return obj;
    }
}

public class SingletonInMultithreading {
    public static void main(String[] args) throws Exception {
        Car[] objs = new Car[2];

        Runnable r1 = () -> {
            objs[0] = Car.getCarObject();
        };

        Runnable r2 = () -> {
            objs[1] = Car.getCarObject();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        if (objs[0] == objs[1]) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are different");
        }
    }
}

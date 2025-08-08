
public class Car {
    String model;
    int year;
    double speed;

    void accelerate(double plus) {
        speed += plus;
    }

    void break() {
        speed = 0;
    }
}

    void print() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Chevette";
        car.year = 1980;
        car.speed = 0.0;

        car.print();
        car.accelerate(60.0);
        car.print();
        car.break();
        car.print();
    }
}

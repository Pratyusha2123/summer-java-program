class Vehicle {

    void run() {

        System.out.println("Vehicle is running");

    }
}

class Car extends Vehicle {

    @Override
    void run() {

        System.out.println("Car is running fast");

    }
}

public class MethodOverRiding {

    public static void main(String[] args) {

        Car c = new Car();

        c.run();

    }
}


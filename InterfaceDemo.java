interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Vehicle c = new Car();

        c.start();
    }
}

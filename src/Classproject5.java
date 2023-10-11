
class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car extends Vehicle {
    public Car() {
        super("Car");
    }
}

class Bus extends Vehicle {
    public Bus() {
        super("Bus");
    }
}

class Train extends Vehicle {
    public Train() {
        super("Train");
    }
}

class Truck extends Vehicle {
    public Truck() {
        super("Truck");
    }
}

public class Classproject5 {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();
        Truck truck = new Truck();

        // Calling recursive methods
        recursiveMethod1(5);
        System.out.println();

        recursiveMethod2(5);
        System.out.println();

        recursiveMethod3(5);
        System.out.println();

        recursiveMethod4(5);
        System.out.println();
    }

    // Rcursive methods call itself, like forloops
    public static void recursiveMethod1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            recursiveMethod1(n - 1); //calling recursive method 1
        }
    }

    public static void recursiveMethod2(int n) {
        if (n > 0) {
            recursiveMethod2(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void recursiveMethod3(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            recursiveMethod3(n - 1);
        }
    }

    public static void recursiveMethod4(int n) {
        if (n > 0) {
            recursiveMethod4(n - 1);
            System.out.print(n + " ");
        }
    }
}


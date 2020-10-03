package pom;

public interface Vehicle {

    void cleanVehicle();
    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }

    static void helperVehicle() {
        System.out.println("I am helper Vehicle");
    }
}



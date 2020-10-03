package pom;

public class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }
    public static void main(String args[]) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread t = new Thread(runnable);
        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());


         Car car = new Car();
         car.cleanVehicle();
         car.startVehicle();
        Vehicle.helperVehicle();
    }

//     public void helperVehicle() {
//        System.out.println("I am ");
//    }



}



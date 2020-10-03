package pom;

public class WaitingState implements Runnable{

        public static Thread t1;


        public static void main(String[] args) {
            t1 = new Thread(new WaitingState());
            t1.start();
        }

        public void run () {
            Thread t2 = new Thread(new DemoThread());
            t2.start();
            try {
                t2.join(); // or object.wait()  or LockSupport.park()
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted "+ e);
            }

        }
}

class DemoThread implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted" + e);
        }
//        System.out.println(WaitingState.t1.getState());
    }
}

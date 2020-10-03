package pom;

public class BlockedState {

    public static void main (String []args) throws InterruptedException {
        Thread t1 = new Thread(new DemoThreadB());
        Thread t2 = new Thread(new DemoThreadB());

        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.exit(0);

    }

    static class DemoThreadB implements Runnable {
        @Override
        public void run() {
            commonResource();
        }

        public  synchronized void commonResource() {
            while(true) {
            }
        }
    }
}

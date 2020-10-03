package pom;


public class ThreadWorking {
        // This thing is basically our runnable target which we can run by creating an innstance of Thread class and passing an instance of this to
    // to it
     static class Tester  implements Runnable {
          private int max;
          private CommonTask commonTask;
          private boolean isEvenNumber;

          public Tester(int max , CommonTask commonTask, boolean isEvenNumber) {
              this.max = max ;
              this.commonTask = commonTask;
              this.isEvenNumber = isEvenNumber;
          }

          @Override
          public void run() {
              int number = isEvenNumber ? 2 : 1;
              while(number <= max) {
                  if(isEvenNumber) {
                      commonTask.printEven(number);
                  }
                  else {
                      commonTask.printOdd(number);
                  }

                  number +=2;
              }
          }
      }
      static class  CommonTask{
          private volatile boolean isOdd;
          synchronized  void printEven(int number) {
             while(!isOdd) {
                 try {
                     wait();
                 }
                 catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                 }
             }
             System.out.println(Thread.currentThread().getName()+ ":" + number);
             isOdd = false;
             notify();
          }

          synchronized void printOdd(int number) {
              while(isOdd) {
                  try{
                      wait();
                  }
                  catch(InterruptedException e) {
                      Thread.currentThread().interrupt();
                  }
              }
              System.out.println(Thread.currentThread().getName()+ ":"+number);
              isOdd = true;
              notify();
          }
      }


      public static void main(String args[]) {
         CommonTask commonTask = new CommonTask();
         Thread t1 = new Thread(new Tester(10, commonTask, false), "Odd");
         Thread t2 = new Thread(new Tester(10, commonTask, true), "Even");
         t1.start();
         t2.start();
      }
}

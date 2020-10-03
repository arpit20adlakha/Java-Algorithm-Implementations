package pom;

public class Implementer implements InterfaceA, InterfaceB {
    @Override
    public void printSomething() {
        System.out.println(
                "I am inside Main class"
        );
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String args[]) {
        Implementer main = new Implementer();
        main.printSomething();
    }
}

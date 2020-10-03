package com.company;

public class HelloWorld {
    public static String test1(String a){
        System.out.println(a);
        a = "USA";
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        String a = "INDIA";
        a = test1(a);
        B b = new B();
        b.setZ("England");
        System.out.println(test1(b.getZ()));
    }

    private static class B{
        private String z = "CHINA";

        private void setZ(String z) {
            this.z = z;
        }

        private String getZ(){
            return this.z;
        }
    }
}

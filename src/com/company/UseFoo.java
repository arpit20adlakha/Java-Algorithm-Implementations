package com.company;

import java.util.function.Function;

public class UseFoo {
    public static String add(String string, Fooo foo) {
        return foo.method(string);
    }


    public static void main (String[] args) {
        Fooo foo = p -> p + "from lambda";
        String result = add("Message", foo);
        System.out.println(result);

        Function<String, String> fen = p-> p + "lambda ";
        String result1 = addFunctional("hello", fen);
        System.out.println(result1);
    }

    public static String addFunctional(String string, Function<String, String> fn) {
        return fn.apply(string);
    }



}

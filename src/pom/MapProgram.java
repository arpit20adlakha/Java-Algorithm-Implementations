package pom;

import java.util.HashMap;

public class MapProgram {
    public static void main(String args[]) {
        java.util.Map<String, String> languages = new HashMap<String, String>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in use");
        }
        else {
            languages.put("Java", "this course is about Java");
        }
        languages.put("Java", "a compiled high level, object-oriented, platform independant language");
        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all purpose language"));
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this course is a java course"));
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in use");
        }
        else {
            languages.put("Java", "this course is about Java");
        }
//        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("Algol not removed , pair not found");

        }
        System.out.println(languages.replace("Lisp", "a functional programming language"));

        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String language : languages.keySet() ) {
            System.out.println(language + "::" + languages.get(language));
        }


    }
}

package pom;

import java.io.Console;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CoinEnergyProblem {

    static int x = 0;
    public static void main(String[] args) throws IOException {
// insert code here
        //
        Stream<String> stream1 = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer", "Portal");

        // Print the stream
        stream1.forEach(s -> System.out.println(s));

        Stream<String> stream = Stream.of("A", "B", "C");

        stream.collect(Collectors.toList());

        stream.forEach(System.out::println);
        System.out.println();
        Integer arr[] = new Integer[5];
        arr[0] = 345;
        arr[1] = 346;
        arr[2] = 347;
        arr[3] = 348;
        arr[4] = 356;

//        for(Integer item : arr) {
//            System.out.println(item);
//        }


        List<Integer> list = Arrays.asList(arr);

        stream.peek(s -> System.out.println(s)).count();

        list.stream().forEach(s -> System.out.println(s));

        try {

            // Print the stream
            stream.forEach(s -> System.out.println(s));
        }

        catch (Exception e) {

            System.out.println("\nException: " + e);
        }

//        list.stream().forEach(System.out::print);

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.printf("%s", distinct);

        Queue<String> x = new PriorityQueue<String>();
        x.add("one");
        x.add("two");
        x.add("TWO");
        System.out.println(x.poll());


        	    for(int t=0;t<5;t++) {
                    System.out.print(t);
                }


//		 Console c = System.console();
//    int i = (int)c.readLine("Enter value: ");
//    for (int j = 0; j < i; j++) {
//  c.format(" %2d",j);
//    }

    }
}


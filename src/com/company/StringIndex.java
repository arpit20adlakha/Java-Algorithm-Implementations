package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringIndex {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while(testCases > 0) {
            String first = input.next();
            String second = input.next();
            System.out.println(first);
            System.out.println(second);
            Map<Character, Character> map= new HashMap<>();
            for(int i= 0; i< second.length(); i++) {
                map.put(second.charAt(i), second.charAt(i));
            }
            int j=0;
            int t =0;
            for( j=0; j< first.length(); j++){
                if (map.containsKey(first.charAt(j))) {
                    System.out.println(map.get(first.charAt(j)));
                    t=1;
                    break;
                }
            }
            if (t ==0) {
                System.out.println('$');
            }
            testCases--;
        }
    }
}

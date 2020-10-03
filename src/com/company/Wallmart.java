package com.company;

import java.util.Arrays;
import java.util.List;

public class Wallmart {
public static void main (String []args) {
     String str = "12223411241432233333214";
    int countLocalMax =1;
    int countGlobalMax = 0;
    int startIndex = 0;
    int endIndex =0;
    int startIndexMax =0;
    for (int  i=1; i< str.length(); i++){
        if (str.charAt(i) == str.charAt(i-1)) {
            countLocalMax++;
            if (countGlobalMax < countLocalMax) {
                countGlobalMax = countLocalMax;
                startIndexMax = startIndex;
                endIndex = i;
            }
        }
        else {
            countLocalMax =1;
            startIndex= i;
        }
    }
    List<String> list = Arrays.asList(str.substring(startIndexMax, endIndex+1), Integer.toString(startIndexMax), Integer.toString(endIndex));
    for(String item : list) {
        System.out.println(item);
    }
}
}

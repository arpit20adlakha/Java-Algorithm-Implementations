package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LIS {

    public  static void main (String [] args) {
       List<Integer> A = Arrays.asList( 69, 54, 19, 51, 16, 54, 64, 89, 72, 40, 31, 43, 1, 11, 82, 65, 75, 67, 25, 98, 31, 77, 55, 88, 85, 76, 35, 101, 44, 74, 29, 94, 72, 39, 20, 24, 23, 66, 16, 95, 5, 17, 54, 89, 93, 10, 7, 88, 68, 10, 11, 22, 25, 50, 18, 59, 79, 87, 7, 49, 26, 96, 27, 19, 67, 35, 50, 10, 6, 48, 38, 28, 66, 94, 60, 27, 76, 4, 43, 66, 14, 8, 78, 72, 21, 56, 34, 90, 89);
        int[] primitive = A.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .toArray();
       int arr[] = A.stream().mapToInt(Integer::intValue).toArray();

       Integer lis[] = new Integer[arr.length];

       for (int i=0;i< arr.length; i++) {
           lis[i] =1;
        }
       lis[0] =1;

       int maxLengthGlobal = 1;
       for(int i=1; i< arr.length; i++) {
           int maxIncreasingLength = 0;
           for (int j=0; j < i ; j++) {
               if ((arr[i] > arr[j]) && (lis[j] >=lis[i])) {
                   lis[i]= lis[j]+1;
                   maxIncreasingLength = lis[i];

               }
           }
           if (maxIncreasingLength > maxLengthGlobal) {
               maxLengthGlobal = maxIncreasingLength;
           }
       }
       System.out.println("The length of longest increasing subsequence is " + maxLengthGlobal);

    }
}

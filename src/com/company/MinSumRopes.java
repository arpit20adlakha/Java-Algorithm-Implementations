package com.company;
import java.util.*;
public class MinSumRopes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  arraySize = input.nextInt();
        int arr[] = new int[arraySize];

        for(int i=0; i< arraySize; i++) {
            arr[i] = input.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0;i< pq.size(); i++) {
            pq.add(arr[i]);
        }
        int sum=0;

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            sum += first+ second;
            pq.add(first+second);
        }
        System.out.println(sum);

    }
}

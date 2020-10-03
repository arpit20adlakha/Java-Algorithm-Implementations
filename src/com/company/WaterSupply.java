package com.company;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WaterSupply {
    static  int max = 0;

    static void DFS(int u, List<Integer> adjList[], int blocked[], boolean visited[]) {
        Iterator<Integer> itr = adjList[u].iterator();
        visited[u] = true;
        max++;
        while(itr.hasNext()) {
            int currentVertex = itr.next();
            if (blocked[currentVertex] != 1 && !visited[currentVertex]) {
                DFS(currentVertex, adjList, blocked, visited);
            }
        }
    }

    public static void main (String args[]) {
        int t;

        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        List<Integer> adjList[] = new ArrayList[t];
        int blocked[] = new int[t];
        boolean visited[] = new boolean[t];

        for(int i=0; i< t; i++){
            adjList[i] = new ArrayList<>();
        }

        for (int i=0; i < t; i++) {

            int u =input.nextInt();
            int v = input.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);

        }

        for (int i=0; i< t; i++) {
             blocked [i] = input.nextInt();
        }

        int finalMaxValue = 0;

        for(int i=0;i < t; i++) {
            if (finalMaxValue < max) {
                finalMaxValue = max;
            }
            max = 0;
            for (int j=0; j< t;j++) {
                visited[j] =false;
            }
            DFS(i, adjList, blocked, visited);
        }
        System.out.println(finalMaxValue);
    }
}

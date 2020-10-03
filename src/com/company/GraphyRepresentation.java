package com.company;


import java.util.*;

public class GraphyRepresentation {

//    public static void addEdge( ArrayList<ArrayList<Integer>> adj, int u, int v) {
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//    }

    public static void printGraph( ArrayList<ArrayList<Integer>> adj){
        int index = 0;
        for (List arrayList : adj) {
            System.out.print(" Adjacency List Vertex " + index++ + " ");
            arrayList.stream().forEach(item -> {System.out.print("->");
            System.out.print(item);});
        }
    }

    public static void main (String agrs[]) {
        int V =5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i< V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        printGraph(adj);

    }


    public static void addEdge(ArrayList<ArrayList<Integer>> arrList , int u , int v) {
        arrList.get(u).add(v);
        arrList.get(v).add(u);
    }


}

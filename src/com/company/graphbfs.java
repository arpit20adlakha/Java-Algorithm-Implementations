package com.company;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class graphbfs {

    private int V;
    private List<Integer> adj[];

    graphbfs(int v) {
        V= v;
        adj = new LinkedList[v];
        for(int i=0; i< v;i++) {
            adj[i] = new LinkedList<>();
        }
    }
        public static void main(String [] args) {
            graphbfs g = new graphbfs(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);
            g.DFS(2);
//            g.BFS(2);
        }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v +" ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);

    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while(queue.size() > 0) {

            s = queue.poll();
            System.out.println(s+ " ");
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }

    }



}

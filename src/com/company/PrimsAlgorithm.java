package com.company;
import java.util.*;

public class PrimsAlgorithm {

    HashSet<Integer> hashSet = new HashSet<>();
//    HashMap<Integer, Integer> map = new HashMap<>();
//    ValueComparator bvc = new ValueComparator(map);
    TreeSet<WeightedEdges> queue = new TreeSet<>(new comparator());


//
//    Deque<Integer> de1 = new ArrayDeque<>();
//    Deque<Integer> deque = new LinkedList<>();



    public static void main(String [] args) {
        PrimsAlgorithm mst = new PrimsAlgorithm();
        int V = 5;

        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        WeightedEdges [] nodes = new WeightedEdges[V];

        int [] parent = new int [V];
        for(int i =0; i < V ; i++) {
            nodes[i] = new WeightedEdges();
        }

        for (int i=0;i<V; i++) {
            nodes[i].weight = Integer.MAX_VALUE;
            nodes[i].vertice = i;
            parent[i] =-1;
        }


        mst.hashSet.add(0);
        nodes[0].weight =0;


        for (int i = 0; i < V; i++)
            mst.queue.add(nodes[i]);

        while(!mst.queue.isEmpty()) {
            WeightedEdges weightedEdges = mst.queue.pollFirst();
            mst.hashSet.add(weightedEdges.vertice);


            for(int i =0; i < V ;i++) {
                if (!mst.hashSet.contains(i) && (graph[weightedEdges.vertice][i] != 0) ) {
                    if (graph[weightedEdges.vertice][i] < nodes[i].weight) {
                        mst.queue.remove(nodes[i]);
                        nodes[i].weight = graph[weightedEdges.vertice][i];
                        mst.queue.add(nodes[i]);
                        parent[i] = weightedEdges.vertice;
                    }
                }
            }
        }

        for(int i=1; i< V; i++) {
            System.out.println(parent[i] +"----"+ i);
        }
    }

}

class ValueComparator implements Comparator<Integer> {
    Map<Integer, Integer> base;

    public ValueComparator(Map<Integer, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(Integer a, Integer b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}


class comparator implements Comparator<WeightedEdges> {
    @Override
    public int compare(WeightedEdges o1, WeightedEdges o2) {
        return o1.weight - o2.weight;
    }
}

class WeightedEdges {
    int vertice;
    int weight;
}



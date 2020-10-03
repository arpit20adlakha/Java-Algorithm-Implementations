package com.company;

import java.util.*;

public class Djikstra {

    static class graphNode {
        int vertex;
        int weight;
        graphNode(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    static Integer V = 5;
    static int dist[]= new int[V];
    static List<graphNode> adjList[] = new ArrayList[V];
    static Set<Integer> hashSet = new HashSet<>();
    static TreeSet<Node> treeSet = new TreeSet<>(new Comparator<Node>() {
        @Override
        public int compare(Node o1, Node o2) {
            return o1.weight - o2.weight;
        }
    });



    public static void main(String args[]) {

        for(int i=0; i< V; i++) {
            adjList[i] =  new ArrayList<>();
        }
        adjList[0].add(new graphNode(1, 9));
        adjList[0].add(new graphNode(2, 6));
        adjList[0].add(new graphNode(3,5));
        adjList[0].add(new graphNode(4, 3));
        adjList[2].add(new graphNode(1, 2));
        adjList[2].add(new graphNode(3, 4));

        for (int i=0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[0]= 0;

        Node source = new Node(0, 0);
        treeSet.add(source);

        while(!(hashSet.size() == V)) {
            Node currentVertex = treeSet.pollFirst();
            hashSet.add(currentVertex.vertex);

            Iterator<graphNode> itr = adjList[currentVertex.vertex].listIterator();
            while(itr.hasNext()) {
                graphNode node = itr.next();
                int newDistance = node.weight + dist[currentVertex.vertex];
                if (!hashSet.contains(node.vertex)) {
                    if (newDistance < dist[node.vertex])
                        dist[node.vertex] = newDistance;
                        treeSet.add(new Node(node.vertex, newDistance));
                    }
                }
            }
        for (int i=0; i< dist.length; i++) {
            System.out.println("0 ---> " + i + " minimum distance is " + dist[i]);
        }

        }


    }


     class Node {
        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }


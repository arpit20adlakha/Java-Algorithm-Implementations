package pom;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Zigzag {

    static Stack<Node> stack1 = new Stack<>();
    static Stack<Node> stack2 = new Stack<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> priorityQueue = new PriorityQueue<>();
    static Deque<Node> deque = new ArrayDeque<>();
    Set<Integer> set = new HashSet<>();
    Set<Integer> set1 = new LinkedHashSet<>();
    Set<Integer> set2 = new TreeSet<>();
    Map<Integer, Integer> map1 = new HashMap<>();
    Map<String, String> map2 = new LinkedHashMap<>();
    Map<String, String> map3 = new ConcurrentHashMap<>();
    Map<String, String> map4 = new TreeMap<>();
    List<Integer> list = new LinkedList<>();
    List<Integer> list1 = new ArrayList<>();



    public static void main(String [] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node (5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        stack1.push(root);
        while (!stack1.isEmpty() && !stack1.isEmpty()) {
            while(!stack1.isEmpty()) {
                Node top = stack1.pop();
                System.out.println(top.data);
                if (top.right!= null)
                    stack2.push(top.right);
                if (top.left != null)
                    stack2.push(top.left);
            }

            while(!stack2.isEmpty()) {
                Node top = stack2.pop();
                System.out.println(top.data);
                if (top.left != null) {
                    stack1.push(top.left);
                }
                if(top.right != null) {
                    stack1.push(top.right);
                }
            }
        }

        deque.addFirst(root);

        while(!deque.isEmpty()) {
            int size = deque.size();
            while(size > 0) {
                size --;
                Node temp = deque.pollFirst();
                System.out.println(temp.data);
                if (temp.right != null) {
                    deque.addLast(temp.right);
                }
                if (temp.left != null){
                   deque.addLast(temp.left);
                }
            }
            size = deque.size();
            while(size > 0) {
                size --;
                Node temp = deque.pollLast();
                System.out.println(temp.data);
                if(temp.left != null) {
                    deque.addFirst(temp.left);
                }

                if (temp.right != null) {
                    deque.addFirst(temp.right);
                }
            }

        }

    }

}


class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }



}
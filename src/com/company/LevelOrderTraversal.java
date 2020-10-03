package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    Node1 root;


    void printLevelOrder() {
        Queue<Node1> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node1 node = queue.poll();
            System.out.println(node.data);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

        }
    }


    public static void main(String args[]) {
        LevelOrderTraversal treeLevel = new LevelOrderTraversal();
        treeLevel.root = new Node1(1);
        treeLevel.root.left = new Node1(2);
        treeLevel.root.right = new Node1(3);
        treeLevel.root.left.left = new Node1(4);
        treeLevel.root.left.right = new Node1(5);
        treeLevel.printLevelOrder();
    }

}

class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left= null;
        right = null;
    }
}

package com.company;
import java.util.*;

public class LRUCache {
    static Deque<Integer> dq;
    static int cacheSize;
    static HashSet<Integer> map;
    static HashMap<Integer, Iterator> itrmap;

    LRUCache(int size) {
        dq = new LinkedList<>();
        map = new HashSet<>();
        itrmap = new HashMap<>();
        cacheSize = size;
    }

    public void checkSizeAndRemove(int x) {
        if(!map.contains(x)) {
           if(dq.size() == cacheSize) {
               int removedElement  = dq.removeLast();
               map.remove(removedElement);
               itrmap.remove(removedElement);
           }
        }
    }

    public void removeExistingElement(int x) {
        Iterator<Integer> itr ;
        if (map.contains(x)) {
            itr = itrmap.get(x);
            dq.remove(itr);
        }
    }

    public void addNewElement(int x) {
        dq.addFirst(x);
        Iterator<Integer> itr = dq.iterator();
        map.add(x);

        itrmap.put(x, itr);
    }

    public void add(int x) {
        checkSizeAndRemove(x);
        removeExistingElement(x);
        addNewElement(x);
    }

    public void display() {
        Iterator<Integer> it = dq.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(4);
        cache.add(1);
        cache.add(2);
        cache.add(3);
        cache.add(1);
        cache.add(4);
        cache.add(5);
        cache.display();

    }
}

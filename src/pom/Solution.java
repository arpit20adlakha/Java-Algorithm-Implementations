package pom;

import java.util.ArrayList;

public class Solution {
        public static  int minPathSum(ArrayList<ArrayList<Integer>> A) {
            for (int j=1; j<A.get(0).size(); j++) {
                int sumValue = A.get(0).get(j) + A.get(0).get(j-1);
                A.get(0).set(j, sumValue);
            }

            for (int i=1; i< A.size() ; i++) {
                int sumValue = A.get(i).get(0) + A.get(i-1).get(0);
                A.get(i).set(0, sumValue);
            }
            int i = 1; int j =1;
           for (i =1; i <A.size(); i++) {
               for (j = 1; j <A.get(0).size(); j++) {
                   int sumValue = A.get(i).get(j) + Math.min(A.get(i - 1).get(j), A.get(i).get(j - 1));
                   A.get(i).set(j, sumValue);
               }
           }
            return A.get(A.size()-1).get(A.get(0).size()-1);
        }


        public static void main (String args[]) {

            ArrayList<ArrayList<Integer>>  newList = new ArrayList<ArrayList<Integer>>(3);
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            list1.add(0, 1);
            list1.add(1, 3);
            list1.add(2, 2);
            list2.add(0, 4);
            list2.add(1, 3);
            list2.add(2, 1);
            list3.add(0, 5);
            list3.add(1, 6);
            list3.add(2, 1);
            newList.add(list1);
            newList.add(list2);
            newList.add(list3);
            System.out.println(minPathSum(newList));

        }
    }

package com.company;
import java.util.*;
import java.lang.*;

    class GFG {
        public static int subArrayNumber(int arr[]) {
            int sum = 0;
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
            List<Pair> finalList = new ArrayList<>();
            for (int i=0; i< arr.length; i++) {
                sum += arr[i];

                if(sum ==0) {
                    finalList.add(new Pair(0, i));
                }
                if (map.containsKey(sum)) {
                    ArrayList<Integer> lis = map.get(sum);

                    for(int j=0; j< lis.size(); j++){
                        Pair p = new Pair(lis.get(0) +1, i);
                        finalList.add(p);
                    }
                    lis.add(i);
                    map.put(sum, lis);
                }
            }
            return finalList.size();
//            Assert.assertThat();
        }

        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            int n = input.nextInt();
            int sizeofArray = input.nextInt();
            int arr[] = new int[sizeofArray];
            for (int i=0; i< arr.length; i++){
                arr[i] = input.nextInt();
            }
            subArrayNumber(arr);

        }


    }


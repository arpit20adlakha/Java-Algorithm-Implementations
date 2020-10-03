package pom;


import java.util.*;
import java.util.Map.Entry;
public class TimedWaitingSatate {

    public class MapUtil {
        public  <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
            List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
            list.sort(Entry.comparingByValue());

            Map<K, V> result = new LinkedHashMap<>();
            for (Entry<K, V> entry : list) {
                result.put(entry.getKey(), entry.getValue());
            }

            return result;
        }
    }

    public String frequencySort(String s) {

        if(s == null) return null;

        if(s.length() == 0) return s;



        List<Entry<Character, Integer>> l1= new ArrayList<>();



        //Capture the character -> count map
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(char charRead: s.toCharArray())
            charCount.put(charRead, charCount.getOrDefault(charRead,0)+1);

        //Make a priority queue and insert the entry set by building a max heap
        final Set<Map.Entry<Character,Integer>> entrySet = charCount.entrySet();
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(charCount.size(),
                (freq1, freq2) -> freq2.getValue() - freq1.getValue());
        pq.addAll(entrySet);

        //Add it to the result in the decreasing order of frequency
        StringBuilder result = new StringBuilder();
        int count=0;
        Map.Entry<Character,Integer> entry = null;
        while(!pq.isEmpty()) {
            entry = pq.poll();

            //Add the characters until their frequency is exhausted
            while(count++<entry.getValue())
                result.append(entry.getKey());
            count=0;
        }

        return result.toString();
    }
//    public List<List<Integer>> pathSum(TreeNode root, int sum) {
//        Map<Character, Integer> m = new TreeMap<>(new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o2-o1;
//            }
//        });
//
//        m.forEach();
//
//
//        Stack<Integer> s1 = new Stack<>();
//int i = Integer.MAX_VALUE;
//        s1.push(5);
//        s1.isEmpty()
//        List<List<Integer>> list= new ArrayList<>();
//
//        if (root == null) {
//            return list;
//        }
//
//        List<List<Integer>> listpath1 = pathSum(root.left, sum - root.val);
//        List<List<Integer>> listpath2 = pathSum(root.right, sum - root.val );
//
//        if(root.right == null && root.left == null) {
//            if (root.val - sum == 0){
//                List<Integer> newList= new LinkedList<>();
//                newList.add(0, root.val);
//                list.add(newList);
//                return list;
//            }
//            else {
//                return list;
//            }
//
//        }
//
//
//
//
//        for(List<Integer> leftList : listpath1) {
//            int temp = 0;
//            for(Integer i : leftList) {
//               temp +=i;
//            }
//            temp += root.val;
//
//            if (temp == sum) {
//                leftList
//                leftList.addFirst(root.val);
//                list.add(leftList);
//            }
//        }
//
//
//
//        for(List<Integer> rightList : listpath2) {
//            int temp =0;
//            for (Integer i : rightList) {
//                temp +=i;
//            }
//            temp += root.val;
//
//            if (temp == sum ){
//                rightList.add(root.val);
//                list.add(rightList);
//            }
//        }
//
//        return list;
//
//
//
//    }

    public static <T> void  spy(String msg, T x) {

        System.out.println(msg + x);

    }

    public static void main(String []args) throws InterruptedException{
        String s = "Aabbccc";
        TreeMap<Character, Integer> m = new TreeMap<>();

        for(int i=0; i< s.length(); i++){
            if (m.get(s.charAt(i)) == null) {
                m.put(s.charAt(i), 1);
            }
            else {
                int currentCount = m.get(s.charAt(i));
                m.put(s.charAt(i), currentCount+1);
            }
        }
        List<Entry<Character, Integer>> newList = new ArrayList<>(m.entrySet());
        newList.sort(Entry.comparingByValue());

        Map<Character, Integer>  m2 = new LinkedHashMap<>();  // We need to use the linked hash map to maintain the order
        for(Entry<Character, Integer> entry : m2.entrySet()) {
            spy("key is", entry.getKey());
            System.out.println("value is "+ entry.getValue());
        }

        Set<Map.Entry<Character, Integer>> set = m.entrySet();
        List<Map.Entry<Character, Integer>> setList = new ArrayList<>(set);
        Collections.sort(setList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        char arr[] = new char[s.length()];
        int i =0;
        for (Map.Entry<Character, Integer> c : setList) {
            int counter = c.getValue();
            while(counter-- > 0) {
                arr[i++] = c.getKey();
            }

        }

       System.out.println(new String(arr));
    }


//        int count =0;
//        ArrayList<String >  arr = new ArrayList<>();
//        String abc= "100";
//        BigInteger bigInteger = new BigInteger("100");
//        BigInteger bigInteger1 = new BigInteger("230");
//        BigInteger b = bigInteger.add(bigInteger1);
//        b.toString()
//        Long.parseLong(abc);
//        abc.toString();
//
//        DemoThread obj1 = new DemoThread();
//
//        Thread t1 = new Thread(obj1);
//        t1.start();
//
//        Thread.sleep(1000);
//        System.out.println(t1.getState());
//    }
//
//    public static void abc() {
//       static  int a = 9;
//    }
//
//
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }

}

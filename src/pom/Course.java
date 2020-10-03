package pom;

import java.util.ArrayList;

public class Course {


    public static void main(String args[]) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        Team<FootballPlayer> abc = new Team<>("abc");
        abc.addPlayer(joe);


        Team<BaseballPlayer>  baseballPlayerTeam = new Team<>("tatii");
        baseballPlayerTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("this wont work");
//        brokenTeam.addPlayer("no-one");
        ArrayList<Integer> item = new ArrayList();

        item.add(1);
        item.add(2);
        item.add(3);
        item.add(5);
        printDoubled(item);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Object i : n) {
            System.out.println((Integer) i*2);
        }
    }

}





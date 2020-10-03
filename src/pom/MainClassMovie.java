package pom;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassMovie {

    public static void main(String args[]) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        for(Movie movie : list){
            System.out.println(movie.getName() + " "+ movie.getRating()+ " "+ movie.getYear());
        }

        // Using it for making changes to Strategy Design Pattern

        StateDesignPattern.FanWallControl fanWallControl = new StateDesignPattern.FanWallControl();
        System.out.println(fanWallControl.toString());
        fanWallControl.rotate();
        System.out.println(fanWallControl.toString());
        fanWallControl.rotate();
        System.out.println(fanWallControl.toString());
        fanWallControl.rotate();
        System.out.println(fanWallControl.toString());
        fanWallControl.rotate();
        System.out.println(fanWallControl.toString());
    }
}

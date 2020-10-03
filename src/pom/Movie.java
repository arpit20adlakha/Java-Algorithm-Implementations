package pom;

import java.util.*;

 class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    @Override
    public int compareTo(Movie movie) {
       return this.year - movie.year;
    }
    public Movie(final String name, final double rating, final int yr) {
        this.name = name;
        this.rating = rating;
        this.year = yr;
    }

     public double getRating() {
         return rating;
     }

     public String getName() {
         return name;
     }

     public int getYear() {
         return year;
     }

     class RatingCompare implements Comparator<Movie> {
         @Override
         public int compare(Movie o1, Movie o2) {
             if (o1.getRating() < o2.getRating()) return -1;
             if (o1.getRating() > o2.getRating()) return 1;
             return 0;
         }
     }

     class NameCompare implements Comparator<Movie> {
        @Override
         public int compare(Movie o1, Movie o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
     }

 }

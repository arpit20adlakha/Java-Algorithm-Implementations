package pom;


import java.util.*;

public class MainClassCollections {

    public static void main (String []args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        }
        else {
            System.out.println("Seat already reserved");
        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        }
        else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        System.out.println(" ");
        System.out.println(" ");
        printList(priceSeats);
        System.out.println(" ");
        System.out.println(" ");
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats);
//
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
//
//        if (theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for A02");
//        }
//        else {
//            System.out.println("Seat already reserved");
//        }
//
//        Collections.reverse(seatCopy);
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seat copy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat  minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min Seat Number is " + minSeat.getSeatNumber());
//        System.out.println("Max Seat Number is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted List");
//        printList(seatCopy);
//        Collections.sort(theatre.seats, new Comparator<Theatre.Seat>() {
//            @Override
//            public int compare(Theatre.Seat o1, Theatre.Seat o2) {
//                return 0;
//            }
//        });

//       theatre.getSeats();
//
//        if (theatre.reserveSeat("H11"))
//         {
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Sorry, seat is taken");
//        }
//        }
    }
        public static void printList(List<Theatre.Seat> list) {
            for(Theatre.Seat seat : list) {
                System.out.print(" "+ seat.getSeatNumber() + " "+ seat.getPrice());
            }
            System.out.println();
        }

//        public static void sortList(List<? extends Theatre.Seat> list) {
//            for(int i=0; i< list.size() -1 ; i++) {
//                for (int j=i+1; j < list.size(); j++) {
//                    if (list.get(i).compareTo(list.get(j)) > 0) {
//                        Collections.swap(list, i, j);
//                    }
//                }
//            }
//        }
    }




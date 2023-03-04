package org.cinemas.src;

public class CinnamonCinemas {

    private static String seatMap[] = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5"};
    private static int noOfSeatBooked = 0; //initially set to 0
    private static int noOfSeatAvailable = 15; //initially set to 15
    public final static int noOfSeatTotal = 15; //total seats

    public String[] getSeatMap() {
        return seatMap;
    }

    public int getNumberOfSeatAvailable() {
        return noOfSeatAvailable  = noOfSeatTotal - noOfSeatBooked;
    }

    /* Assumption : 0 < noOfSeats <=3 */
    public boolean bookSeats(int requestedSeats) {  // print seat numbers  noOfSeats

        if (getNumberOfSeatAvailable() < requestedSeats) {
            System.out.println("Sorry!!! Requested number of seats are not available. ");
            return false;
        }
        System.out.println("Seats Available :  " + noOfSeatAvailable);
        System.out.println("Seats Requested :  " + requestedSeats);

        noOfSeatBooked += requestedSeats;
        noOfSeatAvailable -= requestedSeats;

        System.out.println("Seats Available Now :  " + noOfSeatAvailable);
        System.out.println("Seats Booked Now : " + noOfSeatBooked);
        System.out.println("Seat Booked :  ");
        for (int j = requestedSeats; j >=1 ; j--) {
            System.out.print(" " + seatMap[noOfSeatBooked - j]);
        }
        System.out.println("\n *********************************************");

        return true;
    }
}

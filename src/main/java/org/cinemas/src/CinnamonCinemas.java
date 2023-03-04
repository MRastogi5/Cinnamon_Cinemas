package org.cinemas.src;

import java.util.Arrays;
import java.util.Random;

public class CinnamonCinemas {

     /*int seatMap[][][] = {{{'A',1},{'A',2},{'A',3},{'A',4},{'A',5}},
                        {{'B',1},{'B',2},{'B',3},{'B',4},{'B',5}},
                        {{'C',1},{'C',2},{'C',3},{'C',4},{'C',5}}};*/
     private static String seatMap[] = {  "A1","A2","A3","A4","A5",
                            "B1","B2","B3","B4","B5",
                            "C1","C2","C3","C4","C5"};

    private static int noOfSeatBooked = 0;
    private static int noOfSeatAvailable = 15;
    public final static int noOfSeatTotal = 15;

    public String getSeatLastBooked() {
        return seatLastBooked;
    }

    public void setSeatLastBooked(String seatLastBooked) {
        this.seatLastBooked = seatLastBooked;
    }

    private String seatLastBooked = "None";

    public String[] getSeatMap() {
        return seatMap;
    }

    public int NumberOfSeatAvailable() {
        System.out.println(noOfSeatTotal - noOfSeatBooked);
        return noOfSeatTotal - noOfSeatBooked;
    }

    public int NumberOfSeatBooked() {
        return noOfSeatBooked;
    }

    // Assumption : 0 < noOfSeats <=3
    public boolean bookSeats(int i) {  // return seat numbers  noOfSeats

        System.out.println("No. Of Seats Available :  "+noOfSeatAvailable);
        System.out.println("No. Of Seats Booked :  "+noOfSeatBooked);
        System.out.println("seatLastBooked :  "+seatLastBooked);
        System.out.println("No. Of Seats Requested :  "+i);

        if(noOfSeatAvailable >= i) {
           // for (int row = 0; row < 15; row++) {
                noOfSeatBooked = noOfSeatBooked + i;
                noOfSeatAvailable = noOfSeatAvailable - noOfSeatBooked;
            //}
        } else {
            System.out.println("Sorry!!! Requested number of seats are not available. ");
            return false;
        }

        seatLastBooked = seatMap[noOfSeatBooked -1];

        System.out.println("No. Of Seats Available Now :  "+noOfSeatAvailable);
        System.out.println("No. Of Seats Booked Now :   :  "+noOfSeatBooked);
        System.out.println("seatLastBooked Now :  "+seatLastBooked);

        System.out.println("*********************************************");

        //System.out.print("seatLastBooked :  "+seatLastBooked);
        return true;
    }
}

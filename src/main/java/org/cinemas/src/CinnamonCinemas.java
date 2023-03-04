package org.cinemas.src;

import java.util.Arrays;
import java.util.Random;

public class CinnamonCinemas {

     /*int seatMap[][][] = {{{'A',1},{'A',2},{'A',3},{'A',4},{'A',5}},
                        {{'B',1},{'B',2},{'B',3},{'B',4},{'B',5}},
                        {{'C',1},{'C',2},{'C',3},{'C',4},{'C',5}}};*/
     private static String seatMap[][] = {  {"A1","A2","A3","A4","A5"},
                            {"B1","B2","B3","B4","B5"},
                            {"C1","C2","C3","C4","C5"}};

    private static int noOfSeatBooked = 0;
    private static int noOfSeatAvailable =0;
    public final static int noOfSeatTotal =15;

    public String[][] getSeatMap() {
        return seatMap;
    }
    public int NumberOfSeatRequested() {
        Random rand = new Random();
        return rand.nextInt(3);
    }
    public int NumberOfSeatAvailable() {
        System.out.println(noOfSeatTotal - noOfSeatBooked);
        return noOfSeatTotal - noOfSeatBooked;
    }

    public int NumberOfSeatBooked() {
        return noOfSeatBooked;
    }
}

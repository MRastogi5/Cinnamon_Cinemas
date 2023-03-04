package org.cinemas.src;

import java.util.Random;

public class CinnamonCinemas {


    public int NumberOfSeatRequested() {
        Random rand = new Random();
        return rand.nextInt(3);
    }
}

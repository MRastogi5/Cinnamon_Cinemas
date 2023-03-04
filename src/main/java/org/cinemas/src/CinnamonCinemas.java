package org.cinemas.src;

import java.util.Random;

public class CinnamonCinemas {
    public int NumberOfSeatRequested() {
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public int NumberOfSeatAvailable() {

        return 0;
    }

    public int NumberOfSeatBooked() {
        return 0;
    }
}

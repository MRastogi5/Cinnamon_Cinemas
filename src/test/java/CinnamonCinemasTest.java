import org.cinemas.src.CinnamonCinemas;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CinnamonCinemasTest {

    CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();

    public int NumberOfSeatRequested() {
        Random rand = new Random();
        return rand.nextInt(3);
    }
    @Test
    public void testNumberOfSeatRequested(){
        //CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(NumberOfSeatRequested()>=0);
        assertTrue(NumberOfSeatRequested()<=3);
    }

    @Test
    public void testTotalNumberOfSeatBeforeBooking(){
        //CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatAvailable()==15);
        assertTrue(cinnamonCinemas.NumberOfSeatBooked()<=0);
    }

    @Test
    public void testTotalNumberOfSeatAvailable(){
        //CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatAvailable()<=15);
        assertTrue(cinnamonCinemas.NumberOfSeatAvailable()>=0);
    }

    @Test
    public void testGetSeatMap(){
        //CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertNotNull(cinnamonCinemas.getSeatMap());
    }
    @Test
    public void testBookSeats(){
        while(true) {
            int NumberOfSeatRequested = NumberOfSeatRequested();
            if(cinnamonCinemas.bookSeats(NumberOfSeatRequested) == false){
                break;
            }
            else {
                assertTrue(cinnamonCinemas.bookSeats(NumberOfSeatRequested));
            }
        }
    }
}

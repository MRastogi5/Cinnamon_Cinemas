import org.cinemas.src.CinnamonCinemas;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CinnamonCinemasTest {

    CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();

    public int NumberOfSeatRequested() {
        return new Random().nextInt(2)+1; // get random number between 1 to 3
    }
    @Test
    public void testNumberOfSeatRequested(){
        assertTrue(NumberOfSeatRequested()>0);
        assertTrue(NumberOfSeatRequested()<=3);
    }

    @Test
    public void testTotalNumberOfSeatAvailable(){
        assertTrue(cinnamonCinemas.getNumberOfSeatAvailable()<=15);
        assertTrue(cinnamonCinemas.getNumberOfSeatAvailable()>=0);
    }

    @Test
    public void testGetSeatMap(){
        assertNotNull(cinnamonCinemas.getSeatMap());
    }

    @Test
    public void testBookSeats(){
        while(true) {
            int NumberOfSeatRequested = NumberOfSeatRequested();
            if(cinnamonCinemas.getNumberOfSeatAvailable()>NumberOfSeatRequested){
                assertTrue(cinnamonCinemas.bookSeats(NumberOfSeatRequested));
            }
            else {
                break;
            }
        }
    }
}

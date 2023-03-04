import org.cinemas.src.CinnamonCinemas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CinnamonCinemasTest {

    @Test
    public void testNumberOfSeatRequested(){
        CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatRequested()>0);
        assertTrue(cinnamonCinemas.NumberOfSeatRequested()<3);
    }

    @Test
    public void testTotalNumberOfSeatBeforeBooking(){
        CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatAvailable()==15);
        assertTrue(cinnamonCinemas.NumberOfSeatBooked()<0);
    }

    @Test
    public void testTotalNumberOfSeatAvailable(){
        CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatRequested()==3);
        assertTrue(cinnamonCinemas.NumberOfSeatAvailable()==12);
    }

    @Test
    public void testGetSeatMap(){
        CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertNotNull(cinnamonCinemas.getSeatMap());
    }
}

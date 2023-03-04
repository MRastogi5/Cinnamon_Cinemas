import org.cinemas.src.CinnamonCinemas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CinnamonCinemasTest {

    @Test
    public void testNumberOfSeatRequested(){
        CinnamonCinemas cinnamonCinemas = new CinnamonCinemas();
        assertTrue(cinnamonCinemas.NumberOfSeatRequested()>0);
        assertTrue(cinnamonCinemas.NumberOfSeatRequested()<3);
    }
}

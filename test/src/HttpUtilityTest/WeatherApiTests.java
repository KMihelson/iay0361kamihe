package HttpUtilityTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Kaspar on 27.09.2017.
 */


public class WeatherApiTests {

    @Test
    public void testCoordinateFormat() {
        String example="123:456";
        assertEquals(coordcheckstyle(example), true);
    }

    @Test
    public void testLettersInCoord () {
        String wrong="sat:nav";
        assertEquals(coordcheckstyle(wrong), false);
    }

    @Test
    public void testLongCoord () {
        String longcoord="1245:000";
        assertEquals(coordcheckstyle(longcoord), false);
    }

    @Test
    public void testShortCoord () {
        String shortcoord="11:000";
        assertEquals(coordcheckstyle(shortcoord), false);
    }

    @Test
    public void testTempFormat () {
        String example="33 C";
        assertEquals(tempcheckstyle(example), true);
    }

    @Test
    public void testLettersTemp () {
        String failTemp="FF C";
        assertEquals(tempcheckstyle(failTemp), false);
    }

    @Test
    public void testNoSpaceTemp () {
        String noSpace="33C";
        assertEquals(tempcheckstyle(noSpace), false);
    }



}

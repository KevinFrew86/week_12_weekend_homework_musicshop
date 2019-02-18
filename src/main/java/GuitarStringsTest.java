import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Ernie Ball", "Strings", 200, 600);
    }

    @Test
    public void hasMake() {
        assertEquals("Ernie Ball", guitarStrings.getMake());
    }


    @Test
    public void hasType() {
        assertEquals("Strings", guitarStrings.getType());
    }




    @Test
    public void hasWholesalelPrice() {
        assertEquals(200, guitarStrings.getWholesale());
    }

    @Test
    public void hasRrp() {
        assertEquals(600, guitarStrings.getRrp());
    }

}

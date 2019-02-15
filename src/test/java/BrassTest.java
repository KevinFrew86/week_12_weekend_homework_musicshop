import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass brass;

    @Before
    public void before() {
        brass = new Brass("Holton", "T101", "Trumpet", "Gold", "Brass", "TOOT TOOT",600, 900, 3);
    }

    @Test
    public void hasMake() {
        assertEquals("Holton", brass.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("T101", brass.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Trumpet", brass.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", brass.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", brass.getMaterial());
    }

    @Test
    public void hasNoise() {
        assertEquals("TOOT TOOT", brass.getNoise());
    }

    @Test
    public void hasWholesalelPrice() {
        assertEquals(600, brass.getWholesale());
    }

    @Test
    public void hasRrp() {
        assertEquals(900, brass.getRrp());
    }

    @Test
    public void hasNumOfValves() {
        assertEquals(3, brass.getNumOfValves());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(300, brass.calculateMarkUp(600, 900));
    }

}

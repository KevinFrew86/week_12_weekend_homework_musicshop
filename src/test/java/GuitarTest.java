import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender", "American Standard", "Mustang", "Sonic Blue", "Maple", 350, 500, 6);
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("American Standard", guitar.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Mustang", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Sonic Blue", guitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Maple", guitar.getMaterial());
    }

    @Test
    public void hasWholesalelPrice() {
        assertEquals(350, guitar.getWholesale());
    }

    @Test
    public void hasRrp() {
        assertEquals(500, guitar.getRrp());
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }
}

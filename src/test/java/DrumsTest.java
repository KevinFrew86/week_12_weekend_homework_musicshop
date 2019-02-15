import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before() {
        drums = new Drums("Ludwig", "Vistalite", "Kick", "Blue", "Perspex", "BOOM BOOM",1250, 2000);
    }

    @Test
    public void hasMake() {
        assertEquals("Ludwig", drums.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Vistalite", drums.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Kick", drums.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", drums.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Perspex", drums.getMaterial());
    }

    @Test
    public void hasNoise() {
        assertEquals("BOOM BOOM", drums.getNoise());
    }

    @Test
    public void hasWholesalelPrice() {
        assertEquals(1250, drums.getWholesale());
    }

    @Test
    public void hasRrp() {
        assertEquals(2000, drums.getRrp());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(750, drums.calculateMarkUp(1250, 2000));
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Song Book Inc", "Notation", 500, 1300);
    }

    @Test
    public void hasMake() {
        assertEquals("Song Book Inc", sheetMusic.getMake());
    }


    @Test
    public void hasType() {
        assertEquals("Notation", sheetMusic.getType());
    }


    @Test
    public void hasWholesalelPrice() {
        assertEquals(500, sheetMusic.getWholesale());
    }

    @Test
    public void hasRrp() {
        assertEquals(1300, sheetMusic.getRrp());
    }
}

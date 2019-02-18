import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;


    @Before
    public void before() {
        shop = new Shop();
    }

    @Test
    public void canAddItemsToArrayList() {
        shop.addItem();
        assertEquals(1, shop.itemCount());
    }
}

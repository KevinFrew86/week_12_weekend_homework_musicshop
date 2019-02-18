import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;


    @Before
    public void before() {
        shop = new Shop();
    }

    @Test
    public void canAddItemsToArrayList() {
        shop.addItem(item);
        assertEquals(1, shop.itemCount());
    }
}

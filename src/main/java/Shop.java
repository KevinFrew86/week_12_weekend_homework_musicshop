import java.util.ArrayList;

public class Shop {

    private Item item;
    private ArrayList<Item> stock;

    public Shop() {
        this.stock = stock;
    }

    public void addItem(Item item) {
        this.stock.add(item);
    }

    public Item removeItem() {
        return this.stock.remove(0);
    }

    public int itemCount() {
        return this.stock.size();
    }

}

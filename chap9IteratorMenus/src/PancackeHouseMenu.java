import java.util.ArrayList;
import java.util.Iterator;

public class PancackeHouseMenu implements Menu {

    ArrayList menuItems;
    public PancackeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or straberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}

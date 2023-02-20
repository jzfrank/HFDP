import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancackeHouseMenu pancackeHouseMenu = new PancackeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList menus = new ArrayList(Arrays.asList(pancackeHouseMenu, dinerMenu, cafeMenu));
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}

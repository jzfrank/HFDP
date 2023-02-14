import java.util.Arrays;

public class TestDrive {
    public static void main(String[] args) {
        // Test Beverage
//        Tea tea = new Tea();
//        Coffee coffee = new Coffee();
//        System.out.println("\nMaking tea...");
//        tea.prepareRecipe();
//
//        System.out.println("\nMaking coffee...");
//        coffee.prepareRecipe();


        // Test sorting ducks
//        Duck[] ducks = {
//                new Duck("Daffy", 8),
//                new Duck("Dewey", 2),
//                new Duck("Howard", 7),
//                new Duck("Louie", 2),
//                new Duck("Donald", 10),
//                new Duck("Huey", 2)
//        };
//
//        System.out.println("Before sorting:");
//        display(ducks);
//
//        Arrays.sort(ducks);
//
//        System.out.println("\nAfter sorting:");
//        display(ducks);

        // Test MyFrame
        MyFrame myFrame = new MyFrame("HFDP");

    }

    public static void display(Duck[] ducks) {
        for (int i=0; i<ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
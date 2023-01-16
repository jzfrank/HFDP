// a straightforward solution that is guaranteed to work
// however, if the application concerns performance, we may switch to other methods

public class SynchronizedChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static SynchronizedChocolateBoiler uniqueInstance;
    private SynchronizedChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized SynchronizedChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("...filling...");

            // fill the boiler with a milk / chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            System.out.println("...draining...");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            System.out.println("...boiling...");

        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }


}


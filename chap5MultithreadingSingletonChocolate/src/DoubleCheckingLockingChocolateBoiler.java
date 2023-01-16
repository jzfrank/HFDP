// has to be after java 5
// double-checked locking is the safest, but might
// be an overkill for simpler problems

public class DoubleCheckingLockingChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static DoubleCheckingLockingChocolateBoiler uniqueInstance;
    private DoubleCheckingLockingChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static DoubleCheckingLockingChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            // note we only synchronize the first time through!
            synchronized (DoubleCheckingLockingChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    // if still null, create an instance
                    uniqueInstance = new DoubleCheckingLockingChocolateBoiler();
                }
            }
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

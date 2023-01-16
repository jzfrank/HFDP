// eager instantiation (a bit like global variables)
// if instantiation is resource intensive, might switch to other methods

public class EagerInstantiationChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static EagerInstantiationChocolateBoiler uniqueInstance =
            new EagerInstantiationChocolateBoiler();
    private EagerInstantiationChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static EagerInstantiationChocolateBoiler getInstance() {
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
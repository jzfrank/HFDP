public abstract class Pizza {

    protected String pizzaType;
    public void prepare() {
        System.out.println("preparing " + pizzaType);
    }

    public void bake() {
        System.out.println("baking " + pizzaType);
    }

    public void cut() {
        System.out.println("cutting " + pizzaType);
    }

    public void box() {
        System.out.println("boxing " + pizzaType);
    }


}

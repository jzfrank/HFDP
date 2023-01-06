public class PizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.oderPizza("cheese");
        pizzaStore.oderPizza("veggie");
        pizzaStore.oderPizza("pepperoni");
        pizzaStore.oderPizza("clam");
    }
}

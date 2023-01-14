public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChichagoStyleCheesePizza();
            case "veggie":
                return new ChichagoStyleVeggiePizza();
            case "clam":
                return new ChichagoStyleClamPizza();
            case "pepperoni":
                return new ChichagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}

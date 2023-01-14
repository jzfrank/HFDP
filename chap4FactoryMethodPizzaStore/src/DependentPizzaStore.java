// Suppose we do not use factory pattern and implement the
//     pizza store naively, this is what we get
//
// We can clearly see things are tightly coupled,
// if we want to create a new Pizza store, we need to go into
// this source code and add additional block of if-if-else
// which could be cumbersome and difficult to maintain
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChichagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChichagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChichagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChichagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
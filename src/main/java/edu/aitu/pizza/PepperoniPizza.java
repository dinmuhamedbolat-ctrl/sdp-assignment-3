package edu.aitu.pizza;

public final class PepperoniPizza extends Pizza {
    public PepperoniPizza(PizzaPreparation preparation) {
        super("tomato sauce, mozzarella, and pepperoni", preparation);
    }

    @Override
    public void prepare() {
        bake("Pepperoni pizza");
    }
}

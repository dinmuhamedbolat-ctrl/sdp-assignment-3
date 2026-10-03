package edu.aitu.pizza;

public final class MargheritaPizza extends Pizza {
    public MargheritaPizza(PizzaPreparation preparation) {
        super("tomato sauce, mozzarella, and basil", preparation);
    }

    @Override
    public void prepare() {
        bake("Margherita pizza");
    }
}

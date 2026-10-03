package edu.aitu.pizza;

import java.util.Objects;

public abstract class Pizza {
    private final String toppings;
    private PizzaPreparation preparation;

    protected Pizza(String toppings, PizzaPreparation preparation) {
        this.toppings = Objects.requireNonNull(toppings, "toppings must not be null");
        this.preparation = Objects.requireNonNull(
                preparation, "preparation must not be null");
    }

    public final void setPreparation(PizzaPreparation preparation) {
        this.preparation = Objects.requireNonNull(
                preparation, "preparation must not be null");
    }

    protected final void bake(String pizzaName) {
        preparation.bake(pizzaName, toppings);
    }

    public abstract void prepare();
}

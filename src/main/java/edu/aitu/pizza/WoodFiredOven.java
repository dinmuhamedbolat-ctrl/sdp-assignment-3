package edu.aitu.pizza;

public final class WoodFiredOven implements PizzaPreparation {
    @Override
    public void bake(String pizzaName, String toppings) {
        System.out.printf(
                "Baking %s with %s in a wood-fired oven at 400 C.%n",
                pizzaName,
                toppings);
    }
}

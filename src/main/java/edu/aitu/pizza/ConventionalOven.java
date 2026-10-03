package edu.aitu.pizza;

public final class ConventionalOven implements PizzaPreparation {
    @Override
    public void bake(String pizzaName, String toppings) {
        System.out.printf(
                "Baking %s with %s in a conventional oven at 220 C.%n",
                pizzaName,
                toppings);
    }
}

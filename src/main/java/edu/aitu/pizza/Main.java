package edu.aitu.pizza;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza(new ConventionalOven());
        Pizza pepperoni = new PepperoniPizza(new WoodFiredOven());

        System.out.println("Preparing pizzas with their initial methods:");
        margherita.prepare();
        pepperoni.prepare();

        System.out.println("\nChanging the Margherita preparation method at runtime:");
        margherita.setPreparation(new WoodFiredOven());
        margherita.prepare();
    }
}

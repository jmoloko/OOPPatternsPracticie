package main.java.com.moloko.patterns.behavioral.iterator;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        String[] vegetable = {"tomato", "olive", "paprika", "onion", "mushrooms", "gherkin"};
        VegetableFilling margaritaFilling = new VegetableFilling("Margarita", vegetable);
        Iterator iterator = margaritaFilling.getIterator();
        System.out.println("Pizza: " + margaritaFilling.getName());
        System.out.print("Filling: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}

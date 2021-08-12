package main.java.com.moloko.patterns.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class PizzaRecipe implements Visitor{
    @Override
    public void visit(Dough dough) {
        System.out.println("Slim dough");
    }

    @Override
    public void visit(Sauce sauce) {
        System.out.println("Tomato sauce");
    }

    @Override
    public void visit(Filling filling) {
        System.out.println("Vegetable and meat filling");
    }

    @Override
    public void visit(Pizza pizza) {
        System.out.println("Pepperoni pizza!");
    }
}

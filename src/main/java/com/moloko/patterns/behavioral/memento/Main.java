package main.java.com.moloko.patterns.behavioral.memento;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        TextNotebook notebook = new TextNotebook();
        Caretaker caretaker = new Caretaker();

        notebook.setText("some text1");
        caretaker.add(notebook.save());

        notebook.setText("another text");
        caretaker.add(notebook.save());

        notebook.setText("last change text");
        caretaker.add(notebook.save());

        notebook.setText("Test");
        System.out.println("Current text: " + notebook.getText());


        notebook.load(caretaker.get(0));
        System.out.println("First save: " + notebook.getText());

        notebook.load((caretaker.get(1)));
        System.out.println("Second save: " + notebook.getText());

        notebook.load((caretaker.get(2)));
        System.out.println("Third save: " + notebook.getText());
    }
}

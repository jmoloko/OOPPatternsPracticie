package main.java.com.moloko.patterns.behavioral.memento;

/**
 * @author Jack Milk
 */
public class TextNotebook {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save(){
        return new Memento(text);
    }

    public void load(Memento memento){
        text = memento.getState();
    }
}

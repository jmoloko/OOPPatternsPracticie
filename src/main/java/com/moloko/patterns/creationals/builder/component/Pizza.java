package main.java.com.moloko.patterns.creationals.builder.component;


import main.java.com.moloko.patterns.creationals.builder.component.Dough;
import main.java.com.moloko.patterns.creationals.builder.component.Sauce;
import main.java.com.moloko.patterns.creationals.builder.component.Size;

/**
 * @author Jack Milk
 */
public class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Size size;
    private String filling;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", size=" + size +
                ", filling='" + filling + '\'' +
                ", price=" + price +
                '}';
    }
}

package main.java.com.moloko.patterns.creationals.prototype;

/**
 * @author Jack Milk
 */
public class BasisOfPizza implements Copyable{
    private String dough;
    private String sauce;
    private String filling;

    public BasisOfPizza(String dough, String sauce, String filling) {
        this.dough = dough;
        this.sauce = sauce;
        this.filling = filling;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public Object copy() {
        BasisOfPizza copy = new BasisOfPizza(dough, sauce, filling);
        return copy;
    }

    @Override
    public String toString() {
        return "BasisOfPizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", filling='" + filling + '\'' +
                '}';
    }
}

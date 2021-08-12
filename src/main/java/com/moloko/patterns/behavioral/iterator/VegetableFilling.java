package main.java.com.moloko.patterns.behavioral.iterator;

/**
 * @author Jack Milk
 */
public class VegetableFilling implements Collections{
    private String name;
    private String[] vegetable;

    public VegetableFilling(String name, String[] vegetable) {
        this.name = name;
        this.vegetable = vegetable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getVegetable() {
        return vegetable;
    }

    public void setVegetable(String[] vegetable) {
        this.vegetable = vegetable;
    }

    @Override
    public Iterator getIterator() {
        return new VegetableIterator();
    }

    private class VegetableIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < vegetable.length;
        }

        @Override
        public Object next() {
            return vegetable[index++];
        }
    }
}

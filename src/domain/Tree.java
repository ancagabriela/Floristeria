package domain;

public class Tree extends Product {

    private double height;

    public Tree(double h, double price) throws Exception {
        super(price);
        this.height =h;

    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", price=" + price +
                '}';
    }
}

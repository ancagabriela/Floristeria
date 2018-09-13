package domain;


public class Flower extends Product {

    private String flowercolor;

    public Flower(String c, double price) throws Exception {
        super(price);
        this.flowercolor=c;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowercolor=" + flowercolor + "Price: "+ price +
                '}';
    }
}

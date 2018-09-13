package domain;

public class Product {
    protected double price;

    public Product(double price) throws Exception {
        if (price <= 0) throw new Exception();
        {
            this.price = price;
        }

    }
}

package domain;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {

    private String name;


    private static List<Flower> flowers = new ArrayList<>();


    public FlowerShop(String n) {

        this.name = n;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }


    public void addProduct(Product product) throws Exception {
        if (product == null) throw new Exception();
        products.add(product);
    }
}
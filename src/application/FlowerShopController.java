package application;

import domain.*;

import java.awt.*;

public class FlowerShopController {



    public FlowerShopController(){

    }
    public void createFlowerShop (String name) throws Exception{
        FlowerShop flowershop = new FlowerShop(name);
    }

    public void createDecoration (String material, int price) throws Exception{
        Product decoration = new Decoration(material, price);
        FlowerShop.addProduct(decoration);
    }

    public void createTree (int height, int price) throws Exception{
        Product tree = new Tree(height, price);
        FlowerShop.addProduct(tree);
    }

    public void createFlower (Color col, int price) throws Exception{
        Product flower = new Flower(col, price);
        FlowerShop.addProduct(flower);
    }

    public String getAllProducts() {
        String allProducts="";
        for(Product product : repository.getAllProducts()){
            allProducts += product.toString()+ " \n";
        }
        return allProducts;
    }
}

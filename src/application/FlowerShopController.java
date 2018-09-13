package application;

import domain.*;

public class FlowerShopController {

    FlowerShop flowerShop;

    public FlowerShopController(){

    }
    public void createFlowerShop (String name) throws Exception{
        flowerShop = new FlowerShop(name);
    }

    public void addDecoration(String material, double price) throws Exception{
        Decoration decoration = new Decoration(material, price);
        flowerShop.addDecoration(decoration);
    }

    public void addTree(double height, double price) throws Exception{
        Tree tree = new Tree(height, price);
        flowerShop.addTree(tree);
    }

    public void addFlower (String col, double price) throws Exception{
        Flower flower = new Flower(col, price);
        flowerShop.addFlower(flower);
    }

    public String getAllFlowers() {
        String allFlowers="";
        for(Flower flower : flowerShop.getAllFlowers()){
            allFlowers += flower.toString()+ " \n";
        }
        return allFlowers;
    }

    public String getAllTree() {
        String allTree="";
        for(Tree tree : flowerShop.getAllTree()){
            allTree += tree.toString()+ " \n";
        }
        return allTree;
    }

    public String getAllDecoration() {
        String allDecoration="";
        for(Decoration decoration : flowerShop.getAllDecoration()){
            allDecoration += decoration.toString()+ " \n";
        }
        return allDecoration;
    }

}

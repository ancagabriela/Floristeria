package view;

import application.FlowerShopController;

import java.awt.*;

public class Main {

    private static FlowerShopController controller=new FlowerShopController();

    public static void main(String[] args) throws Exception {
        controller.createFlowerShop("lapepita");

        controller.addDecoration("gdgda", 3);

        controller.addTree(12, 4);

        controller.addFlower("black", 4);
        controller.addFlower("blue", 5);
        controller.addTree(12, 13);

        String allDecoration= controller.getAllDecoration();

        System.out.println(allDecoration);

        String allTree= controller.getAllTree();

        System.out.println(allTree);

        String allFlowers= controller.getAllFlowers();

        System.out.println(allFlowers);


    }
}

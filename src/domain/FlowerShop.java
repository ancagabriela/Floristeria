package domain;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {

    private String name;


    private List<Product> products = new ArrayList<>();

    public FlowerShop(String n) {

        this.name = n;
    }

    public List<Flower> getAllFlowers() {

        List<Flower> allFlowers = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Flower) {
                allFlowers.add((Flower) p);
            }
        }
        return allFlowers;
    }


    public void addFlower(Flower flower) throws Exception {
        if (flower == null) throw new Exception();
        products.add(flower);


    }


    public List<Decoration> getAllDecoration() {

        List<Decoration> allDecorations = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Decoration) {
                allDecorations.add((Decoration) p);
            }
        }
        return allDecorations;

    }


    public void addDecoration(Decoration decoration) throws Exception {
        if (decoration == null) throw new Exception();
        products.add(decoration);
    }

    public List<Tree> getAllTree() {
        List<Tree> allTrees = new ArrayList<>();
        for (Product p : products) {
            if (p instanceof Tree) {
                allTrees.add((Tree) p);
            }
        }
        return allTrees;
    }


    public void addTree(Tree tree) throws Exception {
        if (tree == null) throw new Exception();
        products.add(tree);
    }

}
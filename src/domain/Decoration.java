package domain;

public class Decoration extends Product{

    private String material;

    public Decoration(String material, int price) {
        super(price);
        this.material = material;
    }
}

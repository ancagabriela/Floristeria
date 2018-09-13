package domain;

public class Decoration extends Product{

    private String material;

    public Decoration(String material, double price) throws Exception {
        super(price);
        if (!material.equals("plastic") && !material.equals("wood")) throw new Exception("only plastic or wood");
        this.material = material;

    }

    @Override
    public String toString() {
        return "Decoration{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}

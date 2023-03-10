package model;

public class Product {
    private String product;
    private int costInCent;

    public Product(String product, int costInCent) {
        this.product = product;
        this.costInCent = costInCent;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCostInCent() {
        return costInCent;
    }

    public void setCostInCent(int costInCent) {
        this.costInCent = costInCent;
    }
}

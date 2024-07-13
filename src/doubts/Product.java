package doubts;

public class Product 
{
	private String name;
    private int quantity;
    private int threshold;

    public Product(String name, int quantity, int threshold) {
        this.name = name;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public boolean isLowInventory() {
        return quantity < threshold;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', quantity=" + quantity + ", threshold=" + threshold + "}";
    }

}

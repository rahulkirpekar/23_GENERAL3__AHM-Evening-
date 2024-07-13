package doubts;

public class Main 
{
    public static void main(String[] args) 
    {
        Inventory inventory = new Inventory(10);

        Product product1 = new Product("Product1", 50, 10);
        Product product2 = new Product("Product2", 5, 10);
        Product product3 = new Product("Product3", 20, 15);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.printInventory();

        inventory.checkLowInventory();

        inventory.removeProduct("Product2");
        inventory.printInventory();
        inventory.checkLowInventory();
    }

}

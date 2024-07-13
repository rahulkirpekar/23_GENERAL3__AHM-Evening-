package doubts;

public class Inventory 
{
	 private Product[] products;
	    private int count;

	    public Inventory(int size) {
	        products = new Product[size];
	        count = 0;
	    }

	    public boolean addProduct(Product product) {
	        if (count < products.length) {
	            products[count++] = product;
	            return true;
	        } else {
	            System.out.println("Inventory is full. Cannot add product: " + product.getName());
	            return false;
	        }
	    }

	    public boolean removeProduct(String productName) {
	        for (int i = 0; i < count; i++) {
	            if (products[i].getName().equals(productName)) {
	                products[i] = products[--count];
	                products[count] = null;
	                return true;
	            }
	        }
	        System.out.println("Product not found: " + productName);
	        return false;
	    }

	    public void checkLowInventory() {
	        System.out.println("Checking for low inventory products...");
	        boolean lowInventoryFound = false;
	        for (int i = 0; i < count; i++) {
	            if (products[i].isLowInventory()) {
	                System.out.println(products[i]);
	                lowInventoryFound = true;
	            }
	        }
	        if (!lowInventoryFound) {
	            System.out.println("No products with low inventory.");
	        }
	    }

	    public void printInventory() {
	        System.out.println("Current Inventory:");
	        for (int i = 0; i < count; i++) {
	            System.out.println(products[i]);
	        }
	    }
	}	


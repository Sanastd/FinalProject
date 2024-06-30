package Store;
import java.util.HashMap;

public class Cart {
    private HashMap<Product, Integer> products;
    private double total;

    Cart (){
        this.products = new HashMap<Product, Integer>();
        this.total = 0.0;
    }

    public double getTotal() {
        total = 0.0;
        for (Product product: this.products.keySet())
            total += product.getPrice() * products.get(product);
        return total;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addToCart(Product product, int num){
        if (product.getQuantity() >= num){
            products.put(product, num);
            product.setQuantity(product.getQuantity() - num);
        }
        else {
            System.out.println("...");
        }
    }
    public void removeFromCart(Product product){
        products.remove(product);
    }



}

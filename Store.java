package Store;
import java.util.ArrayList;
import java.util.HashMap;

public class Store {
    private ArrayList<Product> allProducts;
    private ArrayList<Cart> allCarts;
    private ArrayList<User> users;
    private HashMap<User,String> passwords;
    private double totalBalance;

    Store(){
        this.allProducts = new ArrayList<Product>();
        this.allCarts = new ArrayList<Cart>();
        this.users = new ArrayList<User>();
        this.passwords = new HashMap<User,String>();
        this.totalBalance = 0.0;
    }

    public ArrayList<Product> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(ArrayList<Product> allProducts) {
        this.allProducts = allProducts;
    }

    public ArrayList<Cart> getAllCarts() {
        return allCarts;
    }

    public void setAllCarts(ArrayList<Cart> allCarts) {
        this.allCarts = allCarts;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public HashMap<User, String> getPasswords() {
        return passwords;
    }

    public void setPasswords(HashMap<User, String> passwords) {
        this.passwords = passwords;
    }
}

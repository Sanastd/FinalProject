package Store;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private double balance;
    private ArrayList<Cart> previousCarts;
    private Cart cart;

    Main main = new Main();
    Store store = main.store;


    User (String username, String password, String name, String phoneNumber, String address, double balance){
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.balance = balance;
        this.previousCarts = new ArrayList<Cart>();
        this.cart = new Cart();
        store.getPasswords().put(this, this.password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Cart> getPreviousCarts() {
        return previousCarts;
    }

    public void setPreviousCarts(ArrayList<Cart> previousCarts) {
        this.previousCarts = previousCarts;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void purchase(Cart cart){
        if (this.getBalance() >= cart.getTotal()) {
            this.setBalance(this.getBalance() - cart.getTotal());
            this.previousCarts.add(cart);


        }

    }
}

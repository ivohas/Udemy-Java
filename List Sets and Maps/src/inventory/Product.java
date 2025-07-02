package inventory;

import java.util.Objects;

public class Product {
    private final String name;
    private final Category category;
    private double price;
    private int quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public void removeStock(int amount) {
        quantity = Math.max(0, quantity - amount);
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    @Override
    public String toString() {
        return name + " [" + category + "] - $" + price + " x" + quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}


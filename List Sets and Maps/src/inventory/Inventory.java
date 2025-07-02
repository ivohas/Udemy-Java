package inventory;

import java.util.*;

public class Inventory {
    private final Map<String, Product> productMap = new HashMap<>();
    private final EnumMap<Category, List<Product>> categoryMap = new EnumMap<>(Category.class);

    public void addProduct(Product product) {
        productMap.put(product.getName(), product);

        categoryMap.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public void updateStock(String productName, int amount) {
        productMap.computeIfPresent(productName, (k, p) -> {
            p.addStock(amount);
            return p;
        });
    }

    public void removeStock(String productName, int amount) {
        productMap.computeIfPresent(productName, (k, p) -> {
            p.removeStock(amount);
            return p;
        });
    }

    public void replaceProduct(String name, Product newProduct) {
        productMap.replace(name, newProduct);
    }

    public void removeProduct(String name) {
        Product removed = productMap.remove(name);
        if (removed != null) {
            List<Product> categoryList = categoryMap.get(removed.getCategory());
            if (categoryList != null) categoryList.remove(removed);
        }
    }

    public void printInventory() {
        System.out.println("All Products:");
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public void printByCategory() {
        System.out.println("\nProducts by Category:");
        for (Map.Entry<Category, List<Product>> entry : categoryMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Product p : entry.getValue()) {
                System.out.println("   - " + p);
            }
        }
    }

    public Set<String> getProductNames() {
        return productMap.keySet();
    }

    public Collection<Product> getProducts() {
        return productMap.values();
    }

    public Set<Map.Entry<String, Product>> getEntries() {
        return productMap.entrySet();
    }
}

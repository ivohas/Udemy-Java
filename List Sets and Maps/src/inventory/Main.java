package inventory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Inventory Manager =====");
        Inventory inventory = new Inventory();

        Product apple = new Product("Apple", Category.FOOD, 0.99, 100);
        Product tv = new Product("Smart TV", Category.ELECTRONICS, 399.99, 20);
        Product jeans = new Product("Jeans", Category.CLOTHING, 49.99, 40);

        inventory.addProduct(apple);
        inventory.addProduct(tv);
        inventory.addProduct(jeans);

        inventory.updateStock("Apple", 20);
        inventory.removeStock("Jeans", 10);

        inventory.printInventory();
        inventory.printByCategory();
    }
}


package pirategame;

import java.util.List;

public class Game {

    public void start() {
        BankAccount account = new BankAccount("ACC123", 100.0);
        BankCustomer customer = new BankCustomer("Captain Jack", List.of(account));
        Player player = new Player("Jack Sparrow", customer);

        System.out.println(player);

        // Try to mutate balance (you can't! Instead you create new)
        BankAccount updated = account.deposit(50);
        System.out.println("After deposit: " + updated);

        // The original account is still unchanged
        System.out.println("Original: " + account);
    }
}

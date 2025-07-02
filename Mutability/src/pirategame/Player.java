package pirategame;

public final class Player {
    private final String name;
    private final BankCustomer customer;

    public Player(String name, BankCustomer customer) {
        this.name = name;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public BankCustomer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Player: " + name + " | " + customer;
    }
}

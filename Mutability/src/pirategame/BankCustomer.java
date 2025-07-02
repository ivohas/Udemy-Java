package pirategame;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public final class BankCustomer {
    private final String name;
    private final List<BankAccount> accounts;

    public BankCustomer(String name, List<BankAccount> accounts) {
        this.name = name;
        // Defensive copy and unmodifiable wrapper
        this.accounts = Collections.unmodifiableList(new ArrayList<>(accounts));
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return name + " with " + accounts.size() + " account(s)";
    }
}

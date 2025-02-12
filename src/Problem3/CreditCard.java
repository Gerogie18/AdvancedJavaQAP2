package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); // Create a copy of the limit
        this.balance = new Money(0); // Initialize balance to 0
    }

    public Money getBalance() {
        return new Money(this.balance); // Return a copy of the balance
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit); // Return a copy of the credit limit
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (this.balance.add(amount).compareTo(this.creditLimit) > 0) {
            System.out.println("Charge exceeds credit limit.");
        } else {
            this.balance = this.balance.add(amount);
        }
    }

    public void payment(Money amount) {
        this.balance = this.balance.subtract(amount);
    }
}
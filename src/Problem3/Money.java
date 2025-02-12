package Problem3;

public class Money {
    private long dollars;
    private long cents;


    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }
    public Money(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.dollars = (int) amount;
        this.cents = (int) Math.round((amount - dollars) * 100);
    }
    public Money (int dollars, int cents) {
        if (cents >= 100) {
            throw new IllegalArgumentException("cents cannot be greater than 100");
        }
        if (dollars < 0 || cents < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.dollars = dollars;
        this.cents = cents;
    }
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    //Add Constructor
    public Money add(Money otherAmount) {
        Money result = new Money(this);
        result.dollars += otherAmount.dollars;
        result.cents += otherAmount.cents;
        if (result.cents >= 100) {
            result.dollars += 1;
            result.cents -= 100;
        }
        return result;
    }
    public Money add(int dollars, int cents) {
        Money addMoney = new Money(dollars, cents);
        return this.add(addMoney);
    }
    public Money add(double otherAmount) {
        Money addMoney = new Money(otherAmount);
        return this.add(addMoney);
    }

    //Subtract Constructor
    public Money subtract(Money otherAmount) {
        if (otherAmount.dollars > this.dollars) {
            throw new IllegalArgumentException(otherAmount.toString() + " cannot be subtracted from amount");
        }
        if (otherAmount.dollars == this.dollars && otherAmount.cents > this.cents) {
            throw new IllegalArgumentException(otherAmount.toString() + " cannot be subtracted from amount");
        }
        Money result = new Money(this);
        result.dollars -= otherAmount.dollars;
        result.cents -= otherAmount.cents;
        if (result.cents < 0) {
            result.dollars -= 1;
            result.cents += 100;
        }
        return result;
    }
    public Money subtract(int dollars, int cents) {
        Money subtractMoney = new Money(dollars, cents);
        return this.subtract(subtractMoney);
    }
    public Money subtract(double otherAmount) {
        Money subtractMoney = new Money(otherAmount);
        return this.subtract(subtractMoney);
    }

    // Compare Constructor
    public int compareTo(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        } else {
            return Long.compare(this.cents, otherObject.cents);
        }
    }

    public int compareTo(int dollars, int cents) {
        Money compareMoney = new Money(dollars, cents);
        return this.compareTo(compareMoney);
    }

    public int compareTo(double otherAmount) {
        Money compareMoney = new Money(otherAmount);
        return this.compareTo(compareMoney);
    }


    //equals constructor
    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }
    public boolean equals(int dollars, int cents) {
        Money compareMoney = new Money(dollars, cents);
        return this.equals(compareMoney);
    }
    public boolean equals(double otherAmount) {
        Money compareMoney = new Money(otherAmount);
        return this.equals(compareMoney);
    }

    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }
}
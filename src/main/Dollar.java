package main;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }
    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money dollar= (Dollar) object;
        return amount == dollar.amount;
    }
}

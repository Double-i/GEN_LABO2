package main;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
        currency= "USD";
    }

    public Money times(int multiplier) {
        return new Dollar( amount * multiplier) ;
    }

    public boolean equals(Object object) {
        Money dollar= (Dollar) object;
        return amount == dollar.amount;
    }
}

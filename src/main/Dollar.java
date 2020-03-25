package main;

public class Dollar extends Money {


    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {

        return new Dollar( amount * multiplier) ;
    }

    @Override
    public String currency() {
        return "USD";
    }

    public boolean equals(Object object) {
        Money dollar= (Dollar) object;
        return amount == dollar.amount;
    }
}

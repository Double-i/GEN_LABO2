package main;

public class Dollar extends Money {

    private String currency;
    public Dollar(int amount) {
        this.amount = amount;
        currency= "USD";
    }

    public Money times(int multiplier) {

        return new Dollar( amount * multiplier) ;
    }

    @Override
    public String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money dollar= (Dollar) object;
        return amount == dollar.amount;
    }
}

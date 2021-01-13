package me.weekbelt;

abstract class Money {
    protected int amount;

    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    abstract Money times(int multiplier);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}

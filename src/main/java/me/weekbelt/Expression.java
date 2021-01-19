package me.weekbelt;

public interface Expression {
    Money reduce(Bank bank, String to);
}

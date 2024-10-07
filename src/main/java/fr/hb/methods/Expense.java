package fr.hb.methods;

public class Expense {
    private String name;
    private double amount;
    private String date;

    public Expense(String name, double amount, String date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }

    public double getAmount() {
        return amount;
    }
}

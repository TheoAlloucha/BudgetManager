package fr.hb.methods;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Expense> expenses;

    public BudgetManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void printSummary() {
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total des dépenses : " + total);
        expenses.forEach(System.out::println);
    }

    public static void main(String[] args) {
        BudgetManager manager = new BudgetManager();
        manager.addExpense(new Expense("Courses", 50.0, "2024-10-01"));
        manager.addExpense(new Expense("Transport", 15.0, "2024-10-02"));
        manager.printSummary();
    }
}

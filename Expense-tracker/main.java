import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addExpense(scanner);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    showTotalExpenses();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        } while (choice != 4);
        scanner.close();
    }

    private static void addExpense(Scanner scanner) {
        System.out.print("Enter Expense description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Expense expense = new Expense(amount, description);
        expenses.add(expense);
        System.out.println("Expense added successfully.");
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expense record yet.");
        } else {
            System.out.println("\nList of Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private static void showTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        System.out.println("Total Expenses: $" + total);
    }
}

// Nested class definition for Expense
class Expense {
    private double amount;
    private String description;

    public Expense(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return description + ": $" + amount;
    }
}

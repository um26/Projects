# Expense Tracker

A simple Java command-line application to help users manage and track their daily expenses. The application allows the user to add new expenses, view existing expenses, and calculate the total expenses. All functionalities are handled within a single `Main.java` file for simplicity.

## Features

- **Add Expense**: Allows users to input a description and amount for an expense.
- **View Expenses**: Displays all recorded expenses in a list.
- **Show Total Expenses**: Calculates and displays the total sum of all expenses recorded.
- **Exit**: Exits the program safely.

## How It Works

1. **Main Menu**: When the program starts, it shows a menu with options:
   - Add an expense
   - View all expenses
   - Show total expenses
   - Exit the application

2. **Add Expense**: Users can enter a description (e.g., "Lunch") and an amount (e.g., 10.50). The expense is then recorded in a list.

3. **View Expenses**: All previously recorded expenses are displayed in the format: 
   ```plaintext
   Description: $amount
4. **Show Total Expenses**: The total sum of all recorded expenses is calculated and displayed.

5. **Exit**: Exits the program.

  ## Code Overview
The application is composed of the following parts:

### **Main.java**:
Contains the entire program logic, including:
The menu-driven interface.
Methods to add, view, and calculate expenses.
Expense entries are stored in an ArrayList.

### **Expense Class**:
This is defined inside the Main.java file as a simple class to store an expense's description and amount.

## Example Output
Expense Tracker
1. Add Expense
2. View Expenses
3. Show Total Expenses
4. Exit
Enter Your Choice: 1
Enter Expense description: Coffee
Enter Expense amount: 5.50
Expense added successfully.

Expense Tracker
1. Add Expense
2. View Expenses
3. Show Total Expenses
4. Exit
Enter Your Choice: 2
List of Expenses:
Coffee: $5.50

Expense Tracker
1. Add Expense
2. View Expenses
3. Show Total Expenses
4. Exit
Enter Your Choice: 3
Total Expenses: $5.50

## License
This project is open-source and available under the MIT License.

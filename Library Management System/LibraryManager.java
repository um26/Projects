import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Available Books");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner. nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addBook(scanner);
                    break;
                case 2 :
                    addUser(scanner);
                    break;
                case 3 :
                    borrowBook(scanner);
                    break;
                case 4 :
                    returnBook(scanner);
                    break;
                case 5 :
                    viewAvailableBooks();
                    break;
                case 6 :
                    System.out.println("Exiting...");
                    break;
                default :
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 6);
        scanner.close();

    }

    private static void addBook(Scanner scanner){
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter Author:");
        String author = scanner.nextLine();
        System.out.println("Enter ISBN:");
        String ISBN = scanner.nextLine();
        books.add(new Book(title, author, ISBN));
        System.out.println("Book added successfully.");
    }

    private static void addUser(Scanner scanner){
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        users.add(new User(name));
        System.out.println("User added successfully. ");
    }

    private static void borrowBook(Scanner scanner){
        System.out.println("Enter User name: ");
        String userName = scanner.nextLine();
        User user = findUser(userName);

        if(user == null){
            System.out.println("User not found. ");
            return;
        }

        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        Book book = findBook(bookTitle);

        if(book == null || book.isBorrowed()){
            System.out.println("Book not available. ");
            return;
        }

        user.borrowBook(book);
        System.out.println("Book borrowed successfully.");

    }

    private static void returnBook(Scanner scanner){
        System.out.println("Enter User name: ");
        String userName = scanner.nextLine();
        User user = findUser(userName);

        if(user == null){
            System.out.println("User not found. ");
            return;
        }

        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        Book book = findBook(bookTitle);

        if(book == null || !user.getBorrowedBooks().contains(book)){
            System.out.println("Book not borrowed by this user.");
            return;
        }

        user.returnBook(book);
        System.out.println("Book returned successfully.");
    }

    private static void viewAvailableBooks(){
        System.out.println("\nAvailable Books:");
        for(Book book : books){
            if(!book.isBorrowed()){
                System.out.println(book);
            }
        }
    }

    private static User findUser(String name){
        for( User user: users){
            if(user.getName().equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }

    private static Book findBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }



}

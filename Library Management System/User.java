import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String name){
        this.name= name;
        this.borrowedBooks= new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.returnBook();
    }

    @Override
    public String toString(){
        return name+ " (BorrowedBooks: " + borrowedBooks.size() + ")";
    }
}

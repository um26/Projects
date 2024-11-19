public class Book{
    private String title;
    private String author;
    private String ISBN;
    private Boolean isBorrowed;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN= ISBN;
        this.isBorrowed= false;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public void borrow(){
        isBorrowed=true;
    }

    public void returnBook(){
        isBorrowed=false;
    }

    @Override
    public String toString(){
        return title + " by " + author + "( ISBN: " + ISBN + ") - " + (isBorrowed ? "Not Available" : "Available"); 
    }
}
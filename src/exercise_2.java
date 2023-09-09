// You have to implement a library using Java Class Library
// Methods: addBook, issueBook, borrowBook, showAvailableBooks
// Properties: Array to Store the Available books, Array to Store the issued books

public class exercise_2
{
    public static void main(String[] args)
    {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Autobiography of Yogi");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("OOPs : Java");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        System.out.println();
    }
}

class Library
{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book)
    {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are : ");
        for (String book: this.books) {
            if(book == null)
                continue;
            else
               System.out.println("* " + book);
        }
    }

    void issueBook(String book)
    {
        for (int i=0; i<this.books.length; i++) {
            if(this.books[i].equals(book)) {
                System.out.println("The Book has been issued.");
                this.books[i] = null;
                return;
            }
            System.out.println("This book does not exist");
        }
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    void removeBook(Book b) {
        books.remove(b);
        System.out.println("Book removed: " + b.title);
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "Rafi", "1111");
        Book b2 = new Book("Python Guide", "Ayan", "2222");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.removeBook(b1);
    }
}
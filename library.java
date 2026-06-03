import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered successfully.");
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void viewUsers() {

        if (users.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }

        for (User u : users) {
            System.out.println(u);
        }
    }

    public Book searchBook(int id) {

        for (Book b : books) {

            if (b.getBookId() == id) {
                return b;
            }
        }

        return null;
    }

    public void issueBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println("Book not found.");
            return;
        }

        if (book.isIssued()) {

            System.out.println("Book already issued.");
            return;
        }

        book.setIssued(true);

        System.out.println(
                "Book issued successfully.");
    }

    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {

            System.out.println(
                    "Book is already available.");
            return;
        }

        book.setIssued(false);

        System.out.println(
                "Book returned successfully.");
    }

    public void showStatistics() {

        int issuedCount = 0;

        for (Book b : books) {

            if (b.isIssued()) {
                issuedCount++;
            }
        }

        System.out.println("\n===== LIBRARY STATS =====");
        System.out.println(
                "Total Books      : " +
                        books.size());

        System.out.println(
                "Issued Books     : " +
                        issuedCount);

        System.out.println(
                "Available Books  : " +
                        (books.size() -
                                issuedCount));

        System.out.println(
                "Total Users      : " +
                        users.size());
    }
}

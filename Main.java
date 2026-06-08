import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println(
                    "\n=========================");
            System.out.println(
                    " LIBRARY MANAGEMENT");
            System.out.println(
                    "=========================");
            System.out.println(
                    "1. Add Book");
            System.out.println(
                    "2. Register User");
            System.out.println(
                    "3. View Books");
            System.out.println(
                    "4. View Users");
            System.out.println(
                    "5. Issue Book");
            System.out.println(
                    "6. Return Book");
            System.out.println(
                    "7. Statistics");
            System.out.println(
                    "8. Exit");

            System.out.print(
                    "Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print(
                            "Book ID: ");

                    int bookId =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Title: ");

                    String title =
                            sc.nextLine();

                    System.out.print(
                            "Author: ");

                    String author =
                            sc.nextLine();

                    library.addBook(
                            new Book(
                                    bookId,
                                    title,
                                    author));

                    break;

                case 2:

                    System.out.print(
                            "User ID: ");

                    int userId =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Name: ");

                    String name =
                            sc.nextLine();

                    System.out.println(
                            "1. Student");
                    System.out.println(
                            "2. Faculty");

                    System.out.print(
                            "Choose Type: ");

                    int type =
                            sc.nextInt();

                    if (type == 1) {

                        library.registerUser(
                                new StudentUser(
                                        userId,
                                        name));

                    } else {

                        library.registerUser(
                                new FacultyUser(
                                        userId,
                                        name));
                    }

                    break;

                case 3:

                    library.viewBooks();
                    break;

                case 4:

                    library.viewUsers();
                    break;

                case 5:

                    System.out.print(
                            "Enter Book ID: ");

                    library.issueBook(
                            sc.nextInt());

                    break;

                case 6:

                    System.out.print(
                            "Enter Book ID: ");

                    library.returnBook(
                            sc.nextInt());

                    break;

                case 7:

                    library.showStatistics();
                    break;

                case 8:

                    System.out.println(
                            "Thank you!");
                    break;

                default:

                    System.out.println(
                            "Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}

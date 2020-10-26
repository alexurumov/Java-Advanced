package library;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pod Igoto", 1912, "Ivan Vazov");
        Book book2 = new Book("Do Chikago I Nazad", 1234, "Aleko", "Konstantinov", "I brat mu");
        Book book3 = new Book("1001 noshti", 500);

        Library library = new Library(book1, book2, book3);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }

    }
}

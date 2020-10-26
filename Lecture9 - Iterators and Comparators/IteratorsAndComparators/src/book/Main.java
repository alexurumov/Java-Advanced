package book;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Pod Igoto", 1912, "Ivan Vazov");

        Book book1 = new Book("Do Chikago I Nazad", 1234, "Aleko", "Konstantinov", "I brat mu");

        book.getAuthors().forEach(System.out::println);
        book1.getAuthors().forEach(System.out::println);
    }
}

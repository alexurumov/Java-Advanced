package comparablebook;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Animal Farm", 2003, "George Orwell");
        Book book3 = new Book("The Documents in the Case", 2002);
        Book book2 = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

//        if (book1.compareTo(book2) > 0) {
//            System.out.println(String.format("%s is before %s", book1, book2));
//        } else if (book1.compareTo(book2) < 0) {
//            System.out.println(String.format("%s is before %s", book2, book1));
//        } else {
//            System.out.println("Books are equal");
//        }

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(new BookComparator());

        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }

    }
}

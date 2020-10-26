package comparablebook;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{


    @Override
    public int compare(Book o1, Book o2) {
        int titleCompare = o1.getTitle().compareTo(o2.getTitle());
        return titleCompare != 0 ? titleCompare : o2.getYear() - o1.getYear();

    }
}

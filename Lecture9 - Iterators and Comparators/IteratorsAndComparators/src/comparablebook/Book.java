package comparablebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book o) {
        int titleCompare = this.getTitle().compareTo(o.getTitle());
        return titleCompare != 0 ? titleCompare : o.getYear() - this.getYear();
    }
}
package util;

import basic.Book;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getAuthorName().compareTo(o2.getAuthorName()) < 0) {
            return -1;
        }
        if (o1.getAuthorName().compareTo(o2.getAuthorName()) > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

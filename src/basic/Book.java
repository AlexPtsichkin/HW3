package basic;

import java.util.Arrays;

public class Book {
    private String authorName;
    private String authorSurname;
    private String patronymic;
    private String publisher;
    private String genre;
    private int id;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int catalogueNumber = -1;

    public Book(String authorName, String authorSurname, String patronymic, String publisher, String genre) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.patronymic = patronymic;
        this.publisher = publisher;
        this.genre = genre;
        catalogueNumber++;
        id = catalogueNumber;
    }

    @Override
    public String toString() {
        return '\n' +
                "basic.Book{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                '}'+
                "ID" + id;

    }

    public static int getCatalogueNumber() {
        return catalogueNumber;
    }
}

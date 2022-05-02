package util;

import basic.Book;
import basic.Student;
import basic.User;
import data.BooksData;
import data.StudentsData;
import data.UserData;

import java.util.*;

public class Util {

    public static void startTask1() {

        //Create new LinkedList with 20 "Book" objects
        LinkedList<Book> booksLinkedlist = new LinkedList<>();
        for (int i = 0; i <= 19; i++) {
            booksLinkedlist.add(i, new Book(BooksData.returnRandomAuthorName(),
                    BooksData.returnRandomAuthorSurname(),
                    BooksData.returnPatronymic(),
                    BooksData.returnPublisher(),
                    BooksData.returnGenre()));
        }
        System.out.println(booksLinkedlist);
        //Delete element number 7
        booksLinkedlist.remove(7);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(booksLinkedlist);


    }

    public static void startTask2() {

        //Create new HashSet with 20 "Book" objects
        HashSet<Book> booksHashSet = new HashSet<>();
        for (int i = 0; i <= 19; i++) {
            booksHashSet.add(new Book(BooksData.returnRandomAuthorName(),
                    BooksData.returnRandomAuthorSurname(),
                    BooksData.returnPatronymic(),
                    BooksData.returnPublisher(),
                    BooksData.returnGenre()));
        }

        //Add to HashSet 6 equal Book
        Book equalBook = new Book(BooksData.returnRandomAuthorName(),
                BooksData.returnRandomAuthorSurname(),
                BooksData.returnPatronymic(),
                BooksData.returnPublisher(),
                BooksData.returnGenre());

        for (int i = 0; i <= 5; i++) {
            booksHashSet.add(equalBook);
        }

        System.out.println(booksHashSet);

        //Declare char of vowels
        char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U'};

        //Iterate HashSet to define Author name that start with vowel
        Iterator<Book> iterBooksHashSet = booksHashSet.iterator();
        while (iterBooksHashSet.hasNext()) {
            Book tempBook = iterBooksHashSet.next();
            for (int i = 0; i <= 4; i++) {
                if (vowels[i] == tempBook.getAuthorName().charAt(0)) {
                    System.out.println(tempBook);
                }
            }

        }

    }

    public static void startTask3() {

        //Create new ArrayList of "Book" objects
        ArrayList<Book> booksArrayList = new ArrayList<>();

        for (int i = 0; i <= 19; i++) {
            booksArrayList.add(i, new Book(BooksData.returnRandomAuthorName(),
                    BooksData.returnRandomAuthorSurname(),
                    BooksData.returnPatronymic(),
                    BooksData.returnPublisher(),
                    BooksData.returnGenre()));
        }

        //Declare comparator and sort ArrayList by authors name
        NameComparator authorNameComparator = new NameComparator();
        booksArrayList.sort(authorNameComparator);
        System.out.println(booksArrayList);
        System.out.println("------------------------------------------------------------------------------------------");

        //Declare comparator and sort ArrayList by authors surname
        SurnameComparator authorSurnameComparator = new SurnameComparator();
        booksArrayList.sort(authorSurnameComparator);
        System.out.println(booksArrayList);
        System.out.println("------------------------------------------------------------------------------------------");

        //Declare comparator and sort ArrayList by Authors patronymic
        PatronymicComparator authorPatronymicComparator = new PatronymicComparator();
        booksArrayList.sort(authorPatronymicComparator);
        System.out.println(booksArrayList);
    }

    public static void startTask4() {

        //Create TreeSet and add 20 "Student" objects...
        TreeSet<Student> studentTreeSet = new TreeSet<>();

        for (int i = 0; i <= 19; i++) {
            studentTreeSet.add(new Student(StudentsData.returnStudentName(),
                    StudentsData.returnStudentSurname(),
                    StudentsData.returnPatronymic()));
        }

        System.out.println(studentTreeSet);

        //remove even elements from TreeSet
        studentTreeSet.removeIf(id -> (id.getStudentNumber()%2 ==0));

        System.out.println(studentTreeSet);

    }

    public static void startTask5() {
        User userlist = new User(UserData.returnUserName(), 3);

    }

}

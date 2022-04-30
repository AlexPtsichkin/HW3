package data;

public class BooksData {
    static String[] authorName = {"Fred", "Irvin", "Harry", "Rob", "Alonso", "Kazimir", "Josh", "Kent", "David", "Mark", "Ostin"};

    static String[] authorSurname = {"Lesly", "Craft", "Udjin", "Epic", "Dark", "Zombie"};

    static String[] patronymic = {"Heraldovich", "Erko", "Young", "Freekovich", "Cheshko", "Carlsberg", "Bedovich"};

    static String[] publisher = {"Hasakiki", "Dialog", "Chestvo"};

    static String[] genre = {"Novel", "Crime", "Detective fiction", "Science fiction", "Cyberpunk", "Horror"};


    static public String returnRandomAuthorName() {
        return authorName[(int) (Math.random()*authorName.length-1)];
    }

    static public String returnRandomAuthorSurname() {
        return authorSurname[(int)(Math.random()* authorSurname.length-1)];
    }

    static public String returnPatronymic() {
        return patronymic[(int)(Math.random()* patronymic.length-1)];
    }

    static public String returnPublisher () {
        return publisher[(int)(Math.random()* publisher.length-1)];
    }

    static public String returnGenre (){
        return genre[(int)(Math.random()* genre.length-1)];
    }



}

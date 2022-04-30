package data;

public class UserData {
    private static String[] name = {"Alex", "Sergey", "John", "Konstantin", "Neo", "Vasiliy", "Bruce", "Antonio"};
    private static String[] surname = {"White", "Snow", "Rassel", "Black", "Karas", "Pinkerton", "Travolta"};

    public static String returnUserName () {
        return name[(int) (Math.random()*name.length-1)];
    }

    public static String returnUserSurname () {
        return surname[(int) (Math.random()* surname.length-1)];
    }
}

package data;

import java.util.Random;

public class StudentsData {
    private static String[] name = {"Alex", "Sergey", "John", "Konstantin", "Neo", "Vasiliy", "Bruce", "Antonio"};
    private static String[] surname = {"White", "Snow", "Rassel", "Black", "Karas", "Pinkerton", "Travolta"};

    public static String returnStudentName () {
        return name[(int) (Math.random()*name.length-1)];
    }

    public static String returnStudentSurname () {
        return surname[(int) (Math.random()* surname.length-1)];
    }

    public static String returnPatronymic () {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;

    }
}

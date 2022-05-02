import util.Util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("To start task 1 press 1");
        System.out.println("To start task 2 press 2");
        System.out.println("To start task 3 press 3");
        System.out.println("To start task 4 press 4");
        System.out.println("To start task 5 press 5");
        System.out.println("Your option: ");

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        switch (number) {
            case 1:
                Util.startTask1();
                break;
            case 2:
                Util.startTask2();
                break;
            case 3:
                Util.startTask3();
                break;
            case 4:
                Util.startTask4();
                break;
            case 5:
                Util.startTask5();
                break;
            default:
                break;
        }
    }
}

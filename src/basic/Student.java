package basic;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private String patronymic;
    private static int ID=0;
    private int studentNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return " " + studentNumber +
                " Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}' +
                '\n';
    }

    public Student(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        ID++;
        this.studentNumber = ID;

    }



    @Override
    public int compareTo(Student o) {
        if ( this.getStudentNumber() < o.getStudentNumber() ) {
            return -1;
        }
        if ( this.getStudentNumber() > o.getStudentNumber() ) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

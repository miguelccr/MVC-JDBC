package model;

import java.util.Date;

public class Student {
    private int      id,
                    grade;
    private String   firstname,
                    surname;
    private Date     birthday;

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student(int id, String firstname, String surname, Date birthday, int grade) {
        this.id = id;
        this.grade = grade;
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Student(){}
}

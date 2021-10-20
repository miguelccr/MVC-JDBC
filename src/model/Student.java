package model;

import java.util.Date;

public class Student {
    private int      id,
                    grade;
    private String   firstname,
                    surname;
    private Date     birthday;

    public Student(int id, String firstname, String surname, Date birthday, int grade) {
        this.id = id;
        this.grade = grade;
        this.firstname = firstname;
        this.surname = surname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }
}

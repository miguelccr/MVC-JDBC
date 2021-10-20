package controller;

import model.DB;
import model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public static Object[][] getData() {
        var students = getStudents();
        var studentList = new Object[students.length][4];
        for (int i = 0; i < students.length; i++) {
            studentList[i][0] = students[i].getFirstname();
            studentList[i][1] = students[i].getSurname();
            studentList[i][2] = students[i].getGrade();
            studentList[i][3] = students[i].getBirthday();
        }
        return studentList;
    }

    public static Student[] getStudents() {
        List<Student> students = new ArrayList<>();
        String query = "select * from students";
        ResultSet rs;
        try {
            rs = DB.getTable(query);
            while (rs.next()) {
                Student s = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getInt(5)
                );
                students.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students.toArray(new Student[0]);
    }
}

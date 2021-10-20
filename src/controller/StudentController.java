package controller;

import model.DB;
import model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentController {

    /*
    OJOOOOOO
    * private List<Student> alumnos;
    * */

    public static List getStudents() {
        List<Student> students = null;
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
        return students;
    }
}

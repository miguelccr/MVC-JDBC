package view;

import controller.StudentController;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox DBCombo;
    private JComboBox tableCombo;
    private JTextField minGradesField;
    private JButton button1;
    private JButton button2;

    public MainUI() {
        createTable();
        createDBCombo();
        createTableCombo();
    }

    private void createDBCombo() {
        DBCombo.setModel(new DefaultComboBoxModel(new String[]{"CESCR", "db2"}));
    }

    public void createTableCombo() {
        tableCombo.setModel(new DefaultComboBoxModel(new String[]{"Students", "otraTabla"}));
    };

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        Object[][] data = {
                {"Mig", "Mor", "3"},
                {"Ali", "Jim", "8"},
                {"Lor", "wat", "4"}
        };

        Object[] students = StudentController.getStudents().toArray();

        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Firstname", "Surname", "Grade"}
        ));
        TableColumnModel columns = showTable.getColumnModel();
        columns.getColumn(0).setMinWidth(200);
        columns.getColumn(1).setMinWidth(200);

        DefaultTableCellRenderer centeredRendered = new DefaultTableCellRenderer();
        centeredRendered.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(2).setCellRenderer(centeredRendered);
    }

    /*sample text
    la vista es independiente de la data source. el controlador se encarga te to-do lo relacionado con la base de datos.
    StudentController alumno = new StudentController();
    la conexion se destruye
    si en la construccion del controlador construyes el modelo, la conexion no se destruira hasta que se destruya
    el controlador (por el garbage collector)
    recomendacion: construccion del modelo en el get
    crear alumno model.


    instanciar modelo studentModel en el controlador.
    los metodos del modelo realizan la conexion a la base de datos.

    la vista obtiene los datos del controlador, el controlador obtiene los datos del modelo.

    tanto el modelo como el controlador deben tener un constructor.
    no enseñar llos id de la base de datos en la visto, en to-do caso mostar claves cadidatas.
    get de todos los alumnos, y posteriormento aplicar un flitro en la vista o el controlador.
    los modelos deben heredar de conexion
    */
}

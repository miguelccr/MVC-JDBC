package view;

import controller.StudentController;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox<String> DBCombo;
    private JComboBox<String> tableCombo;
    private JTextField minGradesField;
    private JButton button1;
    private JButton button2;

    public MainUI() {
        createTable();
        createDBCombo();
        createTableCombo();
    }

    private void createDBCombo() {
        DBCombo.setModel(new DefaultComboBoxModel<>(new String[]{"CESCR", "db2"}));
    }

    public void createTableCombo() {
        tableCombo.setModel(new DefaultComboBoxModel<>(new String[]{"Students", "otraTabla"}));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable() {
        showTable.setModel(new DefaultTableModel(
                StudentController.getData(),
                new String[]{"Firstname", "Surname", "Grade", "Birthday"}
        ));
        TableColumnModel columns = showTable.getColumnModel();
        columns.getColumn(0).setMinWidth(200);
        columns.getColumn(1).setMinWidth(200);

        DefaultTableCellRenderer centeredRendered = new DefaultTableCellRenderer();
        centeredRendered.setHorizontalAlignment(JLabel.CENTER);
        columns.getColumn(2).setCellRenderer(centeredRendered);
    }
}

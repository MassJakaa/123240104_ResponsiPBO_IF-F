/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employee.*;
import View.Karyawan.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab Informatika
 */
public class ControllerEmployee {
    ViewData halamanTable;
    InputData halamanInput;
    EditData halamanInput;
    IDAOEmployee dao;
    
    public ControllerEmployee(ViewData halamanTable){
        this.halamanTable = halamanTable;
        this.dao = new DAOEmployee();
    }
    
    public ControllerEmployee(InputData halamanInput){
        this.halamanInput = halamanInput;
        this.dao = new DAOEmployee();
    }
    
    public ControllerEmployee(EditData halamanEdit){
        this.halamanEdit = halamanEdit;
        this.dao = new DAOEmployee();
    }
    
    public void showALLEmployee(){
        List<ModelEmployee> List = dao.getALL();
        ModelTable table = new ModelTable(List);
        halamanTable.getTableEmployee().setModel(table);
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTable extends AbstractTableModel {
    List<ModelEmployee> daftaremEmployee;
    String[] kolom = {"id", "nama", "divisi", "nilai_target", "nilai_disiplin", "nilai_inovasi", "nilai_akhir", "status"};
    
    public ModelTable(list<ModelEmployee> daftarEmployee){
        this.daftaremEmployee = daftaremEmployee;
    }

    @Override
    public int getRowCount() {
        return daftaremEmployee.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelEmployee e = daftaremEmployee.get(rowIndex);
        switch (col) {
            case 0: return e.getid();
            case 1: return e.getnama();
            case 2: return e.getdivisi();
            case 3: return e.getnilai_target();
            case 4: return e.getnilai_disiplin();
            case 5: return e.getnilai_inovasi();
            case 6: return e.getnilai_akhir();
            case 7: return e.getstatus();
            default: return null
        }
    }
    
}

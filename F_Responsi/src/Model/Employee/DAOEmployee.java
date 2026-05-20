/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

import Model.Connector;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Lab Informatika
 */
public class DAOEmployee implements IDAOEmployee {

    @Override
    public void insert(ModelEmployee employee) {
        try {
            String query = "INSERT INTO evaluasi (nama. divisi, nilai_target, nilai_disiplin, nilai_inovasi, nilai_akhir, status)" + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = Connector.Connect().prepareStatement(query);
            st.setString(1,employee.getnama());
            st.setString(2, employee.getdivisi());
            st.setDouble(3, employee.getnilai_target());
            st.setDouble(4, employee.getnilai_disiplin());
            st.setDouble(5, employee.getnilai_inovasi());
            st.setDouble(6, employee.getnilai_akhir());
            st.setString(7, employee.getstatus());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Insert Failed" + e.getLocalizedMessage());
        }
    }

    @Override
    public void update(ModelEmployee employee) {
        try {
            String query = "UPDATE evaluasi SET nama=?, divisi=?, nilai_target=?, nilai_disiplin=?, nilai_inovasi=?, nilai_akhir=?, status=? WHERE id =?";
            PreparedStatement st = Connector.Connect().prepareStatement(query);
            st.setString(1,employee.getnama());
            st.setString(2,employee.getdivisi());
            st.setDouble(3,employee.getnilai_target());
            st.setDouble(4,employee.getnilai_disiplin());
            st.setDouble(5,employee.getnilai_inovasi());
            st.setDouble(6,employee.getnilai_akhir());
            st.setString(7,employee.getstatus());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Updaete Failed" + e.getLocalizedMessage());
        }    
    }

    @Override
    public void delete(int id) {
        try {
            String query = "DELETE FROM evaluasi WHERE id=?";
            PreparedStatement st = Connector.Connect().prepareStatement(query);
            st.setINT(1,id);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("Delete Failed" + e.getLocalizedMessage());
        }    }

    @Override
    public ListModelEmployee getALL() {
        List<ModelEmployee> list = new Arraylist<>();
        try {
            Statement st = Connector.Connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee")
            while (rs.next()){
                ModelEmployee e = new ModelEmployee();
                e.setid(rs.getINT("id"));
                e.setnama(rs.getString("nama"));
                e.setdivisi(rs.getString("divisi"));
                e.setnilai_target(rs.getDouble("nilai_target"));
                e.setnilai_disiplin(rs.getDouble("nilai_disiplin"));
                e.setnilai_inovasi(rs.getDouble("nilai_inovaso"));
                e.setnilai_akhir(rs.getDouble("nilai_akhir"));
                e.setstatus(rs.getString("status"));
                List.add(e);
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Get All Failed" + e.getLocalizedMessage());
        }    
        return list;
    }
    
}

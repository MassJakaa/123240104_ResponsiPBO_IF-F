/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface IDAOEmployee {
    public void insert (ModelEmployee employee);
    public void update (ModelEmployee employee);
    public void delete (int id);
    public List<ModelCandidate> getALL();
}

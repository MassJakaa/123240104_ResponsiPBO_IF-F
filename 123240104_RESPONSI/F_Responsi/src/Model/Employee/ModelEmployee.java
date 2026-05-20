/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

/**
 *
 * @author Lab Informatika
 */
public class ModelEmployee {
    private Integer id;
    private String nama, divisi; 
    private Double nilai_target, nilai_disiplin, nilai_inovasi, nilai_akhir
    private String status;
    private double score;
        
    public ModelEmployee(){}
    
    public void calculate(){
        if ("Divisi Teknis".equals(divisi)) {
            this.nilai_akhir = (nilai_target*0.5)+(nilai_disiplin*0.3)+(nilai_inovasi*0.2);
            this.status = (this.nilai_akhir >= 80.0) ? "PROMOSI" : "TETAP";
        } else {
            this.nilai_akhir = (nilai_target*0.5)+(nilai_disiplin*0.3)+(nilai_inovasi*0.2);
            this.status = (this.nilai_akhir >= 85.0) ? "PROMOSI" : "TETAP";
        }
        
        public Integer getid() {return id;}
        public void setid(Integer id) {this.id = id;}
        public Integer getnama() {return nama;}
        public void setnama(String nama) {this.nama = nama;}
        public Integer getdivisi() {return divisi;}
        public void setdivisi(String divisi) {this.divisi = divisi;}
        public Double getnilai_target() {return nilai_target;}
        public void setnilai_target(Double nilai_target) {this.nilai_target = nilai_target;}
        public Double getnilai_disiplin() {return nilai_disiplin;}
        public void setnilai_disiplin(Double nilai_disiplin) {this.nilai_disiplin = nilai_disiplin;}
        public Double getnilai_inovasi() {return nilai_inovasi;}
        public void setnilai_inovasi(Double nilai_disiplin) {this.nilai_disiplin = nilai_disiplin;}
        public Double getnilai_akhir() {return nilai_akhir;}
        public void setnilai_akhir(Double nilai_akhir) {this.nilai_akhir = nilai_akhir;}
        public String getstatus() {return status;}
        public void setstatus(String status) {this.status = status;}

    }
}

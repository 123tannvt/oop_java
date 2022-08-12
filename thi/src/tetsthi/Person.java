/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De02;

/**
 *
 * @author Admin
 */
public class Person {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String gioitinh;
    public Person(){
    
    }
    public Person(String ht, String ns, String dc, String gt){
    this.hoten=ht;
    this.ngaysinh=ns;
    this.diachi=dc;
    this.gioitinh=gt;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return this.hoten + "\t" + this.ngaysinh + "\t" + this.gioitinh +
                "\t" + this.diachi + "\t";
    }
    
}

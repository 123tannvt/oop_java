/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanghoa;

/**
 *
 * @author dell
 */
public class HangHoa {
    private String maHang,ten;
    private Double giaBan;
    public HangHoa(){
    
    }

    public HangHoa(String maHang, String ten, Double giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }
    public void hienThiTT(){
        System.out.println("Ma Hang:"+maHang);
        System.out.println("Ten:"+ten);
        System.out.println("gia ban:"+giaBan);
    }
    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", ten=" + ten + ", giaBan=" + giaBan + "";
    }
}

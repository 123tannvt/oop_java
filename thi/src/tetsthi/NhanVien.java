/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De02;

/**
 *
 * @author Admin
 */
public class NhanVien extends Person{
    private String phongBan;
    private int heSoLuong;
    private int thamNien;
    private double luongCoBan;

    public NhanVien() {
        super();
    }

    public NhanVien(String ht, String ns, String dc, String gt,String pb, int hsl,
            int thamnien, double lcb) {
        super(ht, ns, dc, gt);
        this.phongBan=pb;
        this.heSoLuong=hsl;
        this.thamNien=thamnien;
        this.luongCoBan=lcb;
    }

    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double luongThucLinh(){
    double luong;
    luong=this.luongCoBan*this.heSoLuong*(1+1.0*this.thamNien/100);
    return luong;
    }

    @Override
    public String toString() {
        return super.toString() + this.phongBan + "\t" + this.heSoLuong + "\t" + 
              this.thamNien + "\t" +  this.luongCoBan + "\t" + this.luongThucLinh()+ "\n" ; 
    }
    
}

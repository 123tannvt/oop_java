package b1;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien extends Person implements Serializable {
    private String phongBan;
    private double hsl;
    private int thamNien;
    private double luongCB;
    
    
    public NhanVien() {
        Scanner input = new Scanner(System.in);    
        System.out.print("Ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.print("Phong ban: ");
        phongBan = input.nextLine();
        System.out.print("He so luong: ");
        hsl = input.nextDouble();
        System.out.print("Tham nien: ");
        thamNien = input.nextInt();
        System.out.print("Luong co ban: ");
        luongCB = input.nextDouble();
    }
  
    public NhanVien( String hoTen, String ngaySinh, String diaChi, String gioiTinh,String phongBan, double hsl, int thamNien, double luongCB) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.hsl = hsl;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public double getLuongThucTe(){
        return ((int)(luongCB*hsl*(1+thamNien*1.0/100))*100)*1.0/100 ;
    }
    
    @Override
    public String toString() {
        return super.toString() + "$" + phongBan + "$" + hsl + "$" + thamNien + "$" + luongCB + "$" + getLuongThucTe();
    } 
}

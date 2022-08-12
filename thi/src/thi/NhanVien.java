/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;



import java.io.Serializable;
import java.util.Scanner;


public class NhanVien extends Person implements Serializable {
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private double luongCoBan;
    
    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, double luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, double luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
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
    
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("nhap phong ban");
        phongBan=sc.nextLine();
        System.out.println("nhap he so luong");
        heSoLuong=sc.nextFloat();
        sc.nextLine();
        System.out.println("nhap tham nien");
        thamNien=sc.nextInt();
        sc.nextLine();
        System.out.println("nhap luong co ban");
        luongCoBan=sc.nextDouble();
    }
    
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phong ban: " + phongBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Tham nien: " + thamNien);
        System.out.println("Luong co ban: " + luongCoBan);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnvde01;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Preson {
    private String hoTen,ngaySinh,gioiTinh,diaChi;
    public Preson(){
    
    }
    public Preson(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void hienThiTT(){
        System.out.println("ho ten:"+hoTen);
        System.out.println("ngay sinh:"+ngaySinh);
        System.out.println("gioi tinh:"+gioiTinh);
        System.out.println("dia chi:"+diaChi);
    }
    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" 
                + gioiTinh + ", diaChi=" + diaChi ;
    }
}

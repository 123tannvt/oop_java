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
public class Student extends Preson{
    private String maSV,email;
    private float diemTK;

    public Student() {
        super();
    }

    public Student(String maSV, String email, float diemTK, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(float diemTK) {
        this.diemTK = diemTK;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT(); 
        System.out.println("ma sinh vien:"+maSV);
        System.out.println("Email:"+email);
        System.out.println("diem tong ket:"+diemTK); 
    }

    @Override
    public String toString() {
        return super.toString()+ ", maSV=" + maSV + ", email=" + email + ", diemTK=" + diemTK ;
    }
    
}

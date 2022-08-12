package nhanvie;

import java.util.Scanner;

public class NhanVien extends person{
private String phongBan;
private int heSoLuong;
private int thamNien;
private int luongCoBan;
public NhanVien() {
	super();
}
public NhanVien(String phongBan, int heSoLuong, int thamNien, int luongCoBan) {
	super();
	this.phongBan = phongBan;
	this.heSoLuong = heSoLuong;
	this.thamNien = thamNien;
	this.luongCoBan = luongCoBan;
	Scanner sc=new Scanner(System.in);
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
public int getLuongCoBan() {
	return luongCoBan;
}
public void setLuongCoBan(int luongCoBan) {
	this.luongCoBan = luongCoBan;
}
public  int luongThucLinh() {
	return (this.luongCoBan)*(this.heSoLuong)*(1+this.thamNien/100);
}
public void NhapThongTin() {
	super.NhapThongTin();
	System.out.println("Moi ban nhap vao phòng");
	this.phongBan=sc.nextLine();
	System.out.println("Moi ban nhap vao he so Luong ");
	this.heSoLuong=Integer.parseInt(sc.nextLine());
	System.out.println("Moi ban nhap vao Tham Nien  ");
	this.thamNien=Integer.parseInt(sc.nextLine());
	System.out.println("Moi ban nhap vap Luong co ban ");
	this.luongCoBan=Integer.parseInt(sc.nextLine());	
}
public void InThongTin() {
	super.InThongTin();
	System.out.println("Phong Ban "+this.phongBan);
	System.out.println("He so luong "+this.heSoLuong);
	System.out.println("Tham Nien "+this.thamNien);
	System.out.println(" Luong co ban "+this.luongCoBan);
	System.out.println("Luong Thuc Linh "+luongThucLinh());
}
@Override
public String toString() {
	return super.getHoTen()+";"+super.getNgaySinh()+";"+super.getGioTinh()+";"+super.getDiaChi()+";"+this.phongBan+";"+this.heSoLuong+";"+this.thamNien+";"+this.luongCoBan;
}

}

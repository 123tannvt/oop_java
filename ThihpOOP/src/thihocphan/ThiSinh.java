package thihocphan;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ThiSinh {
	private String hoTen,ngaySinh,diaChi;
	public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public ThiSinh() {
		
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao ho va ten:");
		this.setHoTen(sc.nextLine());
		System.out.println("nhap vao ngay sinh:");
		this.setNgaySinh(sc.nextLine());
		System.out.println("nhap vao dia chi:");
		this.setDiaChi(sc.nextLine());
	}

	@Override
	public String toString() {
		return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi ;
	}
}

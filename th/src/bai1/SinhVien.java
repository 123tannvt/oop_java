package bai1;

import java.util.Calendar;
import java.util.Scanner;

public class SinhVien {
	String hoTen,lop;
	int namSinh;
	public SinhVien() {
		
	}
	public SinhVien(String hoTen,int namSinh, String lop) {
		this.hoTen=hoTen;
		this.namSinh=namSinh;
		this.lop=lop;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int age() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR)-this.getNamSinh();
	}
	public void Insert() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Mời nhập họ và tên");
		this.setHoTen(sc.nextLine());
		System.out.println("mời nhập năm sinh");
		this.setNamSinh(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập Lớp");
		this.setLop(sc.nextLine());
	}
@Override
public String toString() {
	return this.hoTen + "\t\t" + this.namSinh + "\t" + this.lop + "\t" + age();
}
}

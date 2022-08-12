package th32;

import java.util.Scanner;

public class NhanSu extends Person {
	private String maNhanSu;
	private float heSochuVu;
	private float heSoLuong;
	static int luongCoBan;
	
	public String getMaNhanSu() {
		return maNhanSu;
	}
	public void setMaNhanSu(String maNhanSu) {
		this.maNhanSu = maNhanSu;
	}
	static void setLuongCoBan(int lcb) {
		luongCoBan=lcb;
	}
	public float getHeSochuVu() {
		return heSochuVu;
	}
	public void setHeSochuVu(float heSochuVu) {
		this.heSochuVu = heSochuVu;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public void nhapTT() {
		super.nhapTT();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma nhan su:");
		this.setMaNhanSu(sc.nextLine());
		System.out.println("nhap he so chuc vu:");
		this.setHeSochuVu(sc.nextFloat());
		System.out.println(" nhap he so luong:");
		this.setHeSoLuong(sc.nextFloat());
	}
	public void inTT() {
		super.inTT();
		System.out.println(maNhanSu + "\t" + heSochuVu + "\t" + heSochuVu + "\t" + tinhLuong());
	}
	public double tinhLuong() {
		double luong=0;
		return luong=(this.heSoLuong +this.heSochuVu)*this.luongCoBan-this.heSoLuong*this.luongCoBan*0.05;
	}
	public static void main(String[] args) {
		Person person1=new Person();
		person1.nhapTT();
		person1.inTT();
		NhanSu ns=new NhanSu();
		ns.nhapTT();
		ns.setLuongCoBan(1490000);
		ns.inTT();
	}

}

package th;

import java.sql.Date;
import java.util.Scanner;

public class Giaodichnhadat {
	 static String magd;
	static String ngaygd;
	 static float dongia,dientich;
	
	public Giaodichnhadat() {
		
	}
	public Giaodichnhadat(String magd,String ngaygd,float dongia,float dientich) {
		this.magd=magd;
		this.ngaygd=ngaygd;
		this.dongia=dongia;
		this.dientich=dientich;
	}
	public float getDientich() {
		return dientich;
	}
	public void setDientich(float dientich) {
		this.dientich = dientich;
	}
	public String getMagd() {
		return magd;
	}
	public void setMagd(String magd) {
		this.magd = magd;
	}
	public String getNgaygd() {
		return ngaygd;
	}
	public void setNgaygd(String ngaygd) {
		this.ngaygd = ngaygd;
	}
	public float getDongia() {
		return dongia;
	}
	public void setDongia(float dongia) {
		this.dongia = dongia;
	}
	@Override
	public String toString() {
		return this.magd + "\t\t" + this.ngaygd + "\t\t" + this.dongia + "\t\t" + this.dientich + "\t\t" ;
	}
	public  static void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma giao dich");
		magd=sc.nextLine();
		System.out.println("nhap ngay giao dich");
		ngaygd=sc.nextLine();
		System.out.println("nhap don gia");
		dongia=sc.nextFloat();
		System.out.println("nhap dien tich");
		dientich=sc.nextFloat();
	}
}

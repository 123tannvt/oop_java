package bai4;
import java.sql.Date;
import java.util.Scanner;
public class Giaodich {
		private String magd;
	private String ngaygd;
		private  float dongia,dientich;
		
		public Giaodich() {
			
		}
		public Giaodich(String magd,String ngaygd,float dongia,float dientich) {
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
		public void insert() {
			System.out.println("nhap ma giao dich");
			magd=new Scanner(System.in).nextLine();
			System.out.println("nhap ngay giao dich");
			 ngaygd=new Scanner(System.in).nextLine();
			System.out.println("nhap don gia");
			dongia=new Scanner(System.in).nextFloat();
			System.out.println("nhap dien tich");
			dientich=new Scanner(System.in).nextFloat();
		}
	}

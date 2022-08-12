package bai4;

import java.util.Scanner;

public class Giaodichdat extends Giaodich {

	String loaidat;
	double thanhtien =0;
	public Giaodichdat() {
	
	}
	public Giaodichdat(String magd, String ngaygd, float dongia, float dientich,String loaidat) {
		super(magd, ngaygd, dongia, dientich);
		this.loaidat=loaidat;
	}
	public String getLoaidat() {
		return loaidat;
	}
	public void setLoaidat(String loaidat) {
		this.loaidat = loaidat;
	}
	
	public double tinhtiendat() {
		if((this.loaidat.trim().charAt(0))=='A') {
			thanhtien =super.getDientich()*super.getDongia()*1.5;
		}
		if((this.loaidat.trim().charAt(0))=='B' || (this.loaidat.trim().charAt(0))=='C') {
			thanhtien =super.getDientich()*super.getDongia();
	}
		return thanhtien;
	}
	@Override
	public String toString() {
		return super.toString() + loaidat+ "\t\t"  + this.tinhtiendat() + "\t" + "\n";
	}
	public void nhap() {
		super.insert();
		
		do {
			System.out.println("nhap loai dat");
			this.loaidat=new Scanner(System.in).nextLine();
			
		}while(this.loaidat.trim().charAt(0)!='A' && this.loaidat.trim().charAt(0)!='B' &&
			this.loaidat.trim().charAt(0)!='C');
		
	}
}

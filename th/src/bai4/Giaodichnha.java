package bai4;

import java.util.Scanner;

public class Giaodichnha extends Giaodich {
	String loainha,diachi;
	double thanhtien;
	public Giaodichnha() {
		
	}
	public Giaodichnha(String magd, String ngaygd, float dongia, float dientich, String loainha, String diachi) {
		super(magd, ngaygd, dongia, dientich);
		this.loainha=loainha;
		this.diachi=diachi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getLoainha() {
		return loainha;
	}
	public void setLoainha(String loainha) {
		this.loainha = loainha;
	}
	public double tinhtiennha() {
		if(this.loainha=="cao cấp") {
			thanhtien =super.getDientich()*super.getDientich() ;
		}
		else {
			thanhtien =super.getDientich()*super.getDongia()*0.9;
	}
		return thanhtien;
	}
	@Override
	public String toString() {
		return super.toString() + this.loainha + "\t\t" + this.diachi + "\t" + "\n";
	}
	public void nhap() {
		super.insert();
		
		do {
			System.out.println("nhap loai nha");
			this.loainha=new Scanner(System.in).nextLine();	
		} while(this.loainha!="cao cấp"  && this.loainha!="thường");
		
	}
	
}

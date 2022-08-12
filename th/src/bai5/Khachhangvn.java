package bai5;

import java.util.Date;
import java.util.Scanner;

public class Khachhangvn extends khachhang {
	public Khachhangvn(String makh, String hotenkh, Date ngayrahd, int soluong, double dongia,String obj,int dinhmuc) {
		super(makh, hotenkh, ngayrahd, soluong, dongia);
		this.obj=obj;
		this.dinhmuc=dinhmuc;
	}
	private String obj;
	private int dinhmuc;
	double thanhtien=0;
	public String getObj() {
		return obj;
	}
	public void setObj(String obj) {
		this.obj = obj;
	}
	public int getDinhmuc() {
		return dinhmuc;
	}
	public void setDinhmuc(int dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	private  Double  tinhtien() {
		if(super.getSoluong()<= this.dinhmuc) {
			thanhtien=super.getDongia()*super.getSoluong();
		}
		else
			thanhtien=super.getDongia()*this.dinhmuc 
			+ ((super.getSoluong()-this.dinhmuc)*super.getDongia()*2.5);
		return thanhtien;
	}
	public void nhap() {
		super.Insert();
		do {
		System.out.println("nhập đối tượng");
		this.setObj(new Scanner(System.in).nextLine());
		}while(this.obj=="sinh hoạt" || this.obj=="kinh doanh"  || this.obj=="sản xuất" );
		System.out.println("nhập định mức");
		this.setDinhmuc( new Scanner(System.in).nextInt());
	}	
	@Override
	public String toString() {
		return super.toString()  + obj + "\t\t" + dinhmuc + "\t\t" + tinhtien() + "\n";
	}
}

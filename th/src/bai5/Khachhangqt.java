package bai5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Khachhangqt extends khachhang {
	public Khachhangqt(String makh, String hotenkh, Date ngayrahd, int soluong, double dongia,String quoctich) {
		super(makh, hotenkh, ngayrahd, soluong, dongia);
		this.quoctich=quoctich;
	}
	private String quoctich;
	double thanhtien=0;
	
	public String getQuoctich() {
		return quoctich;
	}

	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	Double tinhtien() {
		return thanhtien=super.getDongia()*super.getSoluong();
	}
	public void nhap() {
		super.Insert();
		System.out.println("nhập quốc tịch");
		quoctich=new Scanner(System.in).nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + quoctich +"\t\t" + tinhtien() + "\n" ;
	}
}

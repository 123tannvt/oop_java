package Giaodich;

import java.util.Date;
import java.util.Scanner;

public class Giaodichvang extends Giaodich {
	private String loaivang;
	Scanner sc=new Scanner(System.in);
	public Giaodichvang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Giaodichvang(String magd, Date date, int dongia, int soluong,String loaivang) {
		super(magd, date, dongia, soluong);
		this.loaivang=loaivang;
	}

	public String getLoaivang() {
		return loaivang;
	}

	public void setLoaivang(String loaivang) {
		this.loaivang = loaivang;
	}
	public double thanhtien() {
		return super.getDongia()*super.getSoluong();
	}
	public void Insert() {
		super.Insert();
		System.out.println("nhập loại vàng");
		this.setLoaivang(sc.nextLine());
	}
	@Override
	public String toString() {
		return super.toString() + loaivang + "\t" + thanhtien() + "\n";
	}
}

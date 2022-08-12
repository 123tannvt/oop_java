package Giaodich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Giaodich {
	private	String magd;
	private Date date;
	private int dongia;
	private int soluong;
	SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc= new Scanner(System.in);
	public Giaodich() {
		
	}
public Giaodich(String magd,Date date,int dongia,int soluong) {
		this.magd=magd;
		this.date=date;
		this.dongia=dongia;
		this.soluong=soluong;
	}
	public String getMagd() {
		return magd;
	}
	public void setMagd(String magd) {
		this.magd = magd;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	@Override
	public String toString() {
		return magd + "\t" + fm.format(date) + "\t" + dongia + "\t" + soluong + "\t";
	}
	public void Insert() {
		System.out.println("nhập mã giao dịch");
		this.setMagd(sc.nextLine());
		System.out.println("nhập  ngày giao dịch");
		try {
			this.setDate(fm.parse(sc.nextLine()));
		} catch (ParseException e) {			
		}
		System.out.println("nhập đơn giá");
		this.setDongia(sc.nextInt());
		System.out.println("nhập sô lượng");
		this.setSoluong(sc.nextInt());
	}
}

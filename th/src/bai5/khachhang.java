package bai5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class khachhang {
	
	SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
	private String makh;
	private String hotenkh;
	private Date ngayrahd;
	private int soluong;
	private double dongia;
	public khachhang(String makh,String hotenkh,Date ngayrahd,int soluong,double dongia) {
		this.makh=makh;
		this.hotenkh=hotenkh;
		this.ngayrahd=ngayrahd;
		this.soluong=soluong;
		this.dongia=dongia;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHotenkh() {
		return hotenkh;
	}
	public void setHotenkh(String hotenkh) {
		this.hotenkh = hotenkh;
	}
	public Date getNgayrahd() {
		return ngayrahd;
	}
	public void setNgayrahd(Date ngayrahd) {
		this.ngayrahd = ngayrahd;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	@Override
	public String toString() {
		return makh + "\t\t" +  hotenkh + "\t\t" + fm.format(ngayrahd) + "\t\t" + soluong + "\t" + dongia + "\t";
	}
	public void Insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" nhập mã kh :");
		this.setMakh(sc.nextLine());
		System.out.println("nhập họ tên kh :");
		this.setHotenkh(sc.nextLine());
		try {
				
		System.out.println("nhập ngày in hoá đơn(ngày/tháng/năm) :");
		this.setNgayrahd(fm.parse(sc.nextLine()));
		}catch(Exception e) {
		}
		System.out.println("nhập số lượng");
		this.setSoluong(sc.nextInt());
		System.out.println("nhập đơn giá");
		this.setDongia(sc.nextDouble());
	}
	
	}

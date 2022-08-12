package th7bai4qltv;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Scanner;

public class SinhVien implements Serializable{
	private String name;
	private int birthday;
	private String lop;
	
	public SinhVien() {

	}
	public SinhVien(String hoten,int ns,String lop) {
		this.name=hoten;
		this.birthday=ns;
		this.lop=lop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int age() {
		Calendar now=Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.birthday;
	}
	public void Insert() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Mời nhập họ và tên");
		this.setName(sc.nextLine());
		System.out.println("mời nhập năm sinh");
		this.setBirthday(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập Lớp");
		this.setLop(sc.nextLine());
	}
	@Override
	public String toString() {
		return this.name + "\t\t" + this.birthday+ "\t" + this.lop + "\t" + age();
	}
	public String getFileLine() {
		return this.name + "," + this.birthday + "," + this.lop +"," + age();
	}

}

package th32;

import java.util.Scanner;

public class Person {
	private  String name;
	private String address;
	private int birthday;
	public Person() {

	}
	public Person(String name, String address,int birthday) {
		this.name=name;
		this.address=address;
		this.birthday=birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public void insertTT() {
		this.setName(name);
		this.setAddress(address);
		this.setBirthday(birthday);
	}
	public void inTT() {
		System.out.print(this.name + "\t" + this.address + "\t" + this.birthday + "\t");
	}
	public void nhapTT() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ho va ten:");
		this.setName(sc.nextLine());
		System.out.println(" nhap dia chi:");
		this.setAddress(sc.nextLine());
		System.out.println("nhap nam sinh:");
		this.setBirthday(sc.nextInt());
	}
}

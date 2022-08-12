package th5bai33;

import java.util.Calendar;
import java.util.Scanner;

public class NhanSu {
	private String name;
	private int birthday;
	private String job;
	public NhanSu() {
		
	}
	public NhanSu(String ht,int ns,String job) {
		this.name=ht;
		this.birthday=ns;
		this.job=job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int age() {
		Calendar now=Calendar.getInstance();
		return now.get(Calendar.YEAR)-this.birthday;
	}
	public void Insert() {
		Scanner sc= new Scanner(System.in);
		System.out.println(" nhap ho ten ");
		this.setName(sc.nextLine());
		System.out.println(" nhap nam sinh ");
		this.setBirthday(sc.nextInt());
		sc.nextLine();
		System.out.println(" nhap nghe nghiep ");
		this.setJob(sc.nextLine());
	}
	@Override
	public String toString() {
		return this.name + "\t" + this.birthday + "\t" + age() + "\t" + this.job +"\t";
	}
}

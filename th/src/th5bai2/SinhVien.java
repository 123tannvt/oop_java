package th5bai2;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	private String maSV;
	private String tenLop;
	private float diem1,diem2,diem3;
	public SinhVien() {
		super();
	}
	public SinhVien(String ht, String dc, int ns,String masv,String tenlop,float diem1,float diem2, float diem3) {
		super(ht, dc, ns);
		this.maSV=masv;
		this.tenLop=tenlop;
		this.diem1=diem1;
		this.diem2=diem2;
		this.diem3=diem3;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public float getDiem1() {
		return diem1;
	}
	public void setDiem1(float diem1) {
		this.diem1 = diem1;
	}
	public float getDiem2() {
		return diem2;
	}
	public void setDiem2(float diem2) {
		this.diem2 = diem2;
	}
	public float getDiem3() {
		return diem3;
	}
	public void setDiem3(float diem3) {
		this.diem3 = diem3;
	}
	public float tinhDiemTB() {
		return (diem1+diem2+3)/3;
	}
	public void nhapTT() {
		super.nhapTT();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma sinh vien:");
		this.setMaSV(sc.nextLine());
		System.out.println("nhap lop:");
		this.setTenLop(sc.nextLine());
		System.out.println(" nhap diem 1:");
		this.setDiem1(sc.nextFloat());
		System.out.println(" nhap diem 2:");
		this.setDiem2(sc.nextFloat());
		System.out.println(" nhap diem 3:");
		this.setDiem3(sc.nextFloat());
	}
	public void inTT() {
		super.inTT();
		System.out.println(maSV + "\t" + tenLop + "\t" + diem1 + "\t" + diem2 + "\t" + diem3 + "\t" + tinhDiemTB());
	}
	public static void main(String[] args) {
		Nguoi person=new Nguoi();
		Nguoi sv=new SinhVien();
		person.nhapTT();
		person.inTT();
		sv.nhapTT();
		sv.inTT();
	}

}

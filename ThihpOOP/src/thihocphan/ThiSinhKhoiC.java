package thihocphan;

import java.util.Scanner;

public class ThiSinhKhoiC extends ThiSinh {
	private float diemVan,diemSu,diemDia;

	public ThiSinhKhoiC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThiSinhKhoiC(String hoTen, String ngaySinh, String diaChi,float diemvan,float diemsu,float diemdia) {
		super(hoTen, ngaySinh, diaChi);
		this.diemVan=diemvan;
		this.diemSu=diemsu;
		this.diemDia=diemdia;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemSu() {
		return diemSu;
	}

	public void setDiemSu(float diemSu) {
		this.diemSu = diemSu;
	}

	public float getDiemDia() {
		return diemDia;
	}

	public void setDiemDia(float diemDia) {
		this.diemDia = diemDia;
	}
	
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		super.nhapThongTin();
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao diem van");
		this.setDiemVan(sc.nextFloat());
		sc.nextLine();
		System.out.println("nhap vao diem su");
		this.setDiemSu(sc.nextFloat());
		sc.nextLine();
		System.out.println("nhap vao diem dia");
		this.setDiemDia(sc.nextFloat());
		}

	@Override
	public String toString() {
		return super.toString() +  ", diemVan=" + diemVan + ", diemSu=" + diemSu + ", diemDia=" + diemDia ;
	}
	
}

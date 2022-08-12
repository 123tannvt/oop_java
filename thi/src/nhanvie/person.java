package nhanvie;

import java.util.Scanner;

public class person {
	Scanner sc=new Scanner(System.in);
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private String gioTinh;
	public person(String hoTen, String ngaySinh, String diaChi, String gioTinh) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.gioTinh = gioTinh;
	}
	public person() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGioTinh() {
		return gioTinh;
	}
	public void setGioTinh(String gioTinh) {
		this.gioTinh = gioTinh;
	}
	@Override
	public String toString() {
		return "person [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioTinh=" + gioTinh
				+ "]";
	}
	public void NhapThongTin() {
		System.out.println("MOi ban nhap vao ho ten ");
		this.hoTen=sc.nextLine();
		System.out.println("Moi ban nhap vao ngay Sinh ");
		this.ngaySinh=sc.nextLine();
		System.out.println("Moi ban nhap vao gio tinh ");
		this.gioTinh=sc.nextLine();
		System.out.println("Moi ban nhap vao dia chi");
		this.diaChi=sc.nextLine();		
	}
	public void InThongTin() {
		System.out.println("Ho Ten "+this.hoTen);
		System.out.println("Ngay Sinh "+this.ngaySinh);
		System.out.println("Gio Tinh "+this.gioTinh);
		System.out.println("Dia chi "+this.diaChi);
	}
}

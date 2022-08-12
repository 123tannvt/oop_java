package thihocphan;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh{
	private float diemToan,diemLy,diemHoa;
	Scanner sc=new Scanner(System.in);
	public ThiSinhKhoiA() {
		super();
	}

	public ThiSinhKhoiA(String hoTen, String ngaySinh, String diaChi, float diemToan, float diemLy, float diemHoa) {
		super(hoTen, ngaySinh, diaChi);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("nhap vao diem toan");
		this.setDiemToan(sc.nextFloat());
		sc.nextLine();
		System.out.println(" nhap vao diem ly");
		this.setDiemLy(sc.nextFloat());
		sc.nextLine();
		System.out.println("nhap vao diem hoa");
		this.setDiemHoa(sc.nextFloat());
	}

	@Override
	public String toString() {
		return super.toString() +", diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa ;
	}
	
}

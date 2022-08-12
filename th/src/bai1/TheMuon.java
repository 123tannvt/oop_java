package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien{
	 private int soPhieuMuon;
	private String id;
	private Date ngayMuon,hanTra;
	SimpleDateFormat fm= new SimpleDateFormat("dd/MM/yyyy");
	public TheMuon() {
	
	}
	public TheMuon(String hoTen, int namSinh, String lop) {
		super(hoTen, namSinh, lop);
	}
	public int getSoPhieuMuon() {
		return soPhieuMuon;
	}
	public void setSoPhieuMuon(int soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public Date getHanTra() {
		return hanTra;
	}
	public void setHanTra(Date hanTra) {
		this.hanTra = hanTra;
	}
	@Override
	public String toString() {
		return super.toString() + "\t" + this.soPhieuMuon + "\t" + fm.format(ngayMuon) + "\t" + fm.format(hanTra) + "\n";
	}
	public void Insert() {
		super.Insert();
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập số phiếu mượn");
		this.setSoPhieuMuon(sc.nextInt());
		sc.nextLine();
		System.out.println(" nhập mã sách");
		this.setId(sc.nextLine());
		System.out.println("nhập  ngày mượn");
		try {
			this.setNgayMuon(fm.parse(sc.nextLine()));
		} catch (ParseException e) {			
		}
		System.out.println("nhập  ngày hạn trả");
		try {
			this.setHanTra(fm.parse(sc.nextLine()));
		} catch (ParseException e) {			
		}
	}
}

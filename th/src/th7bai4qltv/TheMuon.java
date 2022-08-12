package th7bai4qltv;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soPhieuMuon;
	private Date ngaymuon,hantra;
	private String maSach;
	private static int tuoi;
	SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc=new Scanner(System.in);
	public TheMuon() {
		
	}
	
	public TheMuon(String hoten, int ns, String lop,int spm, Date ngaymuon,Date hantra,String maSach) {
		super(hoten, ns, lop);
		this.soPhieuMuon=spm;
		this.ngaymuon=ngaymuon;
		this.hantra=hantra;
		this.maSach=maSach;
	}

	public String getFileLine() {
		super.getFileLine();
		return this.soPhieuMuon + "," + this.ngaymuon + "," + this.hantra + "," +this.maSach +"\n";
	}
	public void parse(String line) {
		String[] params=line.split(",");
		try {
			super.getName()=params[0];
			birthday=Integer.parseInt(params[1]);
			lop=params[2];
			tuoi=Integer.parseInt(params[3]);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int getSoPhieuMuon() {
		return soPhieuMuon;
	}
	public void setSoPhieuMuon(int soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}
	public Date getNgaymuon() {
		return ngaymuon;
	}
	public void setNgaymuon(Date ngaymuon) {
		this.ngaymuon = ngaymuon;
	}
	public Date getHantra() {
		return hantra;
	}
	public void setHantra(Date hantra) {
		this.hantra = hantra;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public void Insert() {
		super.Insert();
		System.out.println(" nhap so phieu muon");
		this.setSoPhieuMuon(sc.nextInt());
		sc.nextLine();
		System.out.println(" nhap ma sach");
		this.setMaSach(sc.nextLine());
		try {
			System.out.println(" nhap ngay muon sach");
			this.setNgaymuon(fm.parse(sc.nextLine()));
		} catch (Exception e) {
		}
		try {
			System.out.println(" nhap ngay han tra");
			this.setHantra(fm.parse(sc.nextLine()));
		} catch (Exception e) {
		}
	}
	@Override
	public String toString() {
		return super.toString() + "\t" + this.soPhieuMuon + "\t" + this.maSach + fm.format(this.ngaymuon)
			+ "\t" + fm.format(this.hantra);
	}
}

package th5bai33;

import java.util.ArrayList;

public class HoDan extends NhanSu {
	private int soThanhVien;
	private String soNha;
	public void HoDan() {

	}
	public void HoDan(int soThanhVien,String soNha) {
		this.soThanhVien=soThanhVien;
		this.soNha=soNha;
	}

	public int getSoThanhVien() {
		return soThanhVien;
	}

	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}

	public String getSoNha() {
		return soNha;
	}

	public void setSoNha( String i) {
		this.soNha = i;
	}

	public static void main(String[] args) {
		ArrayList<NhanSu> list=new ArrayList<>();
		HoDan hodan=new HoDan();
		NhanSu nhansu=new NhanSu();
		hodan.setSoNha("A10");
		hodan.setSoThanhVien(3);
		int i=0;
		while(i<hodan.getSoThanhVien()) {
			System.out.println(" thanh vien thu :" + (i+1));
			nhansu.Insert();
			list.add(nhansu);
			i++;
		}
		for(NhanSu a:list) {
			System.out.println(a.toString());
		}
	}
}

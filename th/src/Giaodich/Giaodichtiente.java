package Giaodich;

import java.util.Scanner;

public class Giaodichtiente extends Giaodich {
	private int tygia;
	private String loai;
	double thanhtien=0;
	Scanner sc=new Scanner(System.in);
	public int getTygia() {
		return tygia;
	}
	public void setTygia(int tygia) {
		this.tygia = tygia;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public void Insert() {
		super.Insert();
		System.out.println("nhập tỷ giá");
		this.setTygia(sc.nextInt());
		do {
			System.out.println("nhập loại tiền tệ");
			this.setLoai(sc.nextLine());
		}while(this.getLoai() == "Việt Nam" ||this.getLoai() == "USD" || this.getLoai() == "Euro");
	}
	public double thanhtien() {
		if(this.getLoai()=="Việt Nam") {
			thanhtien=super.getDongia()*super.getSoluong();
		}
		else
			thanhtien=super.getDongia()*super.getSoluong()*this.getTygia();
		return thanhtien;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + tygia + "\t" + loai + "\t" + thanhtien() +"\n";
	}
}

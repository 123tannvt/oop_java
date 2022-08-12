package th32;

import java.util.Scanner;

public class SoPhuc {
	private double phanThuc;
	private double phanAo;
	public SoPhuc() {
		
	}
public SoPhuc(float pt,float pa) {
		this.phanThuc=pt;
		this.phanAo=pa;
	}
	void nhapSoPhuc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap phan thuc: ");
		this.setPhanThuc(sc.nextDouble());
		System.out.println("nhap phan ao: ");
		this.setPhanAo(sc.nextDouble());
	}
	void inSoPhuc() {
		if(this.getPhanAo()<0) {
			System.out.println(phanThuc + "-" + Math.abs(phanAo) + "*i");
		}
		else {
			System.out.println(phanThuc + "+" + phanAo + "*i");
		}
	}
	void congSoPhuc(SoPhuc sp) {
		double pt=this.getPhanThuc() + sp.getPhanThuc();
		double pa=this.getPhanAo() + sp.getPhanAo();
		System.out.println(pt + "+" + pa + "*i");
		
	}
	void nhanSoPhuc(SoPhuc sp) {
		double pt=this.getPhanThuc()*sp.getPhanThuc() - this.getPhanAo()*sp.getPhanAo();
		double pa=this.getPhanAo()*sp.getPhanThuc() + this.getPhanThuc()*sp.getPhanAo();
		System.out.println(pt + "+" + pa + "*i");
	}
	public double getPhanThuc() {
		return phanThuc;
	}
	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}
	public double getPhanAo() {
		return phanAo;
	}
	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}
	public static void main(String[] args) {
		SoPhuc sp1=new SoPhuc();
		SoPhuc sp2=new SoPhuc();
		System.out.println(" nhap so phuc 1");
		sp1.nhapSoPhuc();
		System.out.println(" nhap so phuc 2");
		sp2.nhapSoPhuc();
		System.out.print("so phuc thu 1 :");
		sp1.inSoPhuc();
		System.out.print("so phuc thu 2 :");
		sp2.inSoPhuc();
		System.out.println(" ket qua cong 2 so phuc " );
		sp1.congSoPhuc(sp2);
		System.out.println(" ket qua nhan 2 so phuc " );
		sp1.nhanSoPhuc(sp2);
	}
}

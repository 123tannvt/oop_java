package th7bai2matran;

import java.util.Scanner;
public class matrix {
	private int n,m;
	private double[][] a;
	Scanner sc=new Scanner(System.in);
	public matrix() {
	
	}
	public matrix(int dong,int cot) {
		this.n=dong;
		this.m=cot;
	}
	public matrix(double[][] a1) {
		this.a=a1;
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public double[][] getA() {
		return a;
	}

	public void setA(double[][] a) {
		this.a = a;
	}
	public void nhapMaTran() {
		System.out.println(" nhap so dong");
		this.setN(sc.nextInt());
		System.out.println(" nhap so cot");
		this.setM(sc.nextInt());
		a =new double[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
	}
	public void nhapMT(int n, int m) {
		a =new double[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
	}
	public void inMaTran() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public boolean kiemTraDoiXung() {
		for(int i=0;i<getN();i++) {
			for(int j=0;j< getM();j++) {
				if(this.a[i][j] != this.a[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
	public matrix congmatrix(matrix a1) {
		matrix m1=new matrix();
		m1.n=this.n;
		m1.m=this.m;
		m1.a=new double[m1.n][m1.m];
		for(int i=0;i<m1.n;i++) {
			for(int j=0;j<m1.m;j++) {
				m1.a[i][j]= this.a[i][j] + a1.a[i][j];
			}
		}
		return m1;
	}
	public matrix nhanMtrix(matrix a1) {
		matrix m1=new matrix();
		m1.n=this.n;
		m1.m=a1.m;
		m1.a=new double[m1.n][m1.m];
		for(int i=0;i<m1.n;i++) {
			for(int j=0;j<m1.m;j++) {
				m1.a[i][j]=0;
				for(int k=0;k<m1.m;k++) {
					m1.a[i][j]+=this.a[i][k]*a1.a[k][j];
				}
			}
		}
		return m1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		matrix mt=new matrix();
		matrix m2=new matrix();
		mt.nhapMaTran();
		mt.inMaTran();
		/*System.out.println(" nhap ma tran cong");
		matrix mt1=new matrix();
		mt1.nhapMT(mt.getN(), mt.getM());
		matrix s=mt.congmatrix(mt1);
		System.out.println(" cong hai ma tran");
		s.inMaTran();*/
		System.out.println(" nhap cot ma tran nha");
		int m21=sc.nextInt();
		m2.setN(mt.getM());
		m2.setM(m21);
		m2.nhapMT(mt.getM(),m21 );
		matrix s=mt.nhanMtrix(m2);
		System.out.println(" nhan 2 ma tran");
		s.inMaTran();
	}

}

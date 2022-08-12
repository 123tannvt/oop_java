package th4bai2;

import javax.tools.DiagnosticCollector;

public class Diem {
	private double x;
	private double y;
	public Diem() {
		
	}
	public Diem(double x1,double y1) {
		this.x=x1;
		this.y=y1;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void inTTDiem() {
		System.out.println(x+"="  +  ";"  + y+"=");
	}
	public double tinhKhoangCach(Diem d) {
		double a=this.getX() -d.getX();
		double b= this.getY() - d.getY();
		return Math.sqrt(a*a + b*b);
	}
	public static void main(String[] args) {
		Diem D1=new Diem(3,7);
		Diem D2=new Diem(9,3);
		System.out.println(D1.tinhKhoangCach(D2));
	}

}

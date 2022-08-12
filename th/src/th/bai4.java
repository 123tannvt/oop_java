package th;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class bai4 {
	  Soil sl=new Soil();
	Home home1=new Home();
	 SimpleDateFormat dMY = new SimpleDateFormat("ddMMyy");
	static Scanner sc=new Scanner(System.in);

	public  static void nhap() {
		Soil sl=new Soil();
		System.out.println("nhap ma giao dich");
		sl.setMagd(new Scanner(System.in).nextLine());
		System.out.println("nhap ngay giao dich");
		sl.setNgaygd(new Scanner(System.in).nextLine());
		System.out.println("nhap don gia");
		sl.setDongia(new Scanner(System.in).nextFloat());
		System.out.println("nhap loai dat");
		sl.setLoaidat(new Scanner(System.in).nextLine());
		sl.checkdat();
		System.out.println("nhap dien tich");
		sl.setDientich(new Scanner(System.in).nextFloat());
		sl.tinhtiendat();
	}
	public static void nhap2() {
		Home home1=new Home();
		System.out.println("nhap ma giao dich");
		home1.setMagd(new Scanner(System.in).nextLine());
		System.out.println("nhap ngay giao dich");
		home1.setNgaygd(new Scanner(System.in).nextLine());
		System.out.println("nhap don gia");
		home1.setDongia(new Scanner(System.in).nextFloat());
		System.out.println("nhap loai nha");
		home1.checknha();
		home1.setLoainha(new Scanner(System.in).nextLine());		
		System.out.println("nhap dien tich");
		home1.setDientich(new Scanner(System.in).nextFloat());
		System.out.println("nhap ma dia chi");
		home1.setDiachi(new Scanner(System.in).nextLine());
		home1.tinhtiennha();
	}
	public static void main(String[] args) {
		  Soil sl=new Soil();
		Home home1=new Home();
		ArrayList<Soil> list= new ArrayList<>();
		int z;
		System.out.println("moi ban nhap so luong");
		z=sc.nextInt();
		for (int i=0;i<z;i++) {
			System.out.println("lan thu" + (i+1));
			nhap();
			list.add(sl);
		}
		for(Soil b:list) {
			b.toString();
		}
	}

}

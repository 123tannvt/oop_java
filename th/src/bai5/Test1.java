package bai5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test1 {
	 static ArrayList<khachhang> list= new ArrayList<>();
	public  static void xuat092013() {
		
		for(khachhang a: list) {
			Calendar date= new GregorianCalendar();
			date.setTime(a.getNgayrahd());
			if((date.get(Calendar.MONTH) +1) == 9 && (date.get(Calendar.YEAR) )== 2013)
				System.out.println(a.toString());
		}
	}
	
	public static void main(String[] args) {
		khachhang kh1;
		
		ArrayList<khachhang> list= new ArrayList<>();
		
		int n=0,i=0;
		System.out.println("nhập số lượng");
		n=new Scanner(System.in).nextInt();
		while(i<n) {
			Khachhangvn vn=new Khachhangvn(null, null, null, n, n, null, i);
			System.out.println("thông tin kh thứ" + (i+1));
			vn.nhap();
			list.add(vn);
			i++;
		}
		for(khachhang a: list) {
			System.out.println(a.toString());
		}
		for(khachhang a: list) {
			Calendar date= new GregorianCalendar();
			date.setTime(a.getNgayrahd());
			if((date.get(Calendar.MONTH) +1) == 9 && (date.get(Calendar.YEAR) )== 2013)
				System.out.println(a.toString());
		}
		
	}

}

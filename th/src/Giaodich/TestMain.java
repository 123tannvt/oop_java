package Giaodich;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Giaodich> list= new ArrayList<>();
		Giaodich gd;
		int n,i=0;
		System.out.println("nhập số lượng giao dịch");
		n=sc.nextInt();
		while(i<n) {
			gd=new Giaodichvang();
			System.out.println("nhập giao dịch thứ" + (i+1));
			gd.Insert();
			list.add(gd);
			i++;
		}
		while(i<n) {
			gd=new Giaodichtiente();
			System.out.println("nhập giao dịch thứ" + (i+1));
			gd.Insert();
			list.add(gd);
			i++;
		}
		for(Giaodich a: list) {
			if(a instanceof Giaodichvang) {
				System.out.println(a.toString());
			}
			if(a instanceof Giaodichtiente) {
				System.out.println(a.toString());
			}
		}
	}
	
	

}

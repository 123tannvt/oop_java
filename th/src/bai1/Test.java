package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		ArrayList<TheMuon> list=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int i=0,n;
		System.out.println(" nhập số lượng sinh viên");
		n=sc.nextInt();
		while(i<n) {
			TheMuon sv=new TheMuon();
			System.out.println(" thông tin mượn sách sinh viên thứ" + (i+1));
			sv.Insert();
			list.add(sv);
			i++;
		}
		System.out.println("Hoten\t\tNăm sinh\tLớp\tTuổi\tSố Phiếu Mượn\tNgày Mượn\tHạn Trả\t");
		for(TheMuon a:list) {
			System.out.println(a.toString());
		}
	}
}

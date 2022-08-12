package th32;

import java.util.Scanner;

public class ToanHoc {
	public static boolean kiemtraNguyenTo(int k) {
		if(k<= 1) {
			return false;
		}
		for(int i=2;i<k;i++) {
			if(k%i==0) {
				return false;
			}
		}
		return true;
	}
	public static double tinhTong(int n) {
		int  sum=0;
		for(int i=1;i<=n;i++) {
		 sum+=i/i+1;
		}
		return sum;
	}
	public static boolean ktraHoanHao(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i ==0) {
			sum+=i;
			}
		}
		if(sum == n) return true;
		else return false;
	}
	public static int Fibo(int n) {
		if(n<=1) return 1;
		else return Fibo(n-1) + Fibo(n-2);
	}
	public static double dequi(int n) {
		if(n == 0) return 1;
		else return n*dequi(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" moi nhap n= ");
		int n=sc.nextInt();
		if(kiemtraNguyenTo(n)) {
			System.out.println(n + " la so nguyen to");
		}
		else {
			System.out.println(n + " khong la so nguyen to");
		}
		if(ktraHoanHao(n)) {
			System.out.println(n + " la so hoan hao");
		}
		else {
			System.out.println(n + " khong la so hoan hao");
		}
		System.out.println(" tong cua " + n + " so fibonaci la :" + Fibo(n));
		System.out.println(dequi(n));
		System.out.println(tinhTong(n));
	}

}

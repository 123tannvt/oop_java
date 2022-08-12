package thihocphan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Testtmain {
	static List<ThiSinh> dshs=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("menu");
			System.out.println("1.Nhap thong tin thi sinh"+"\n"+
								"2.xuat ds thi sinh trung tuyen"+"\n"+
								"0.thoat");
			int check=sc.nextInt();
			switch(check) {
			case 1:
				System.out.println(" nhap so thi sinh can thong ke");
				int n=sc.nextInt();
				System.out.println(" moi chon nhap thi sinh khoi");
				System.out.println("\t1.Thi sinh khoi A");
				System.out.println("\t2.thi sinh khoi C");
				int check2=sc.nextInt();
				switch(check2){
					case 1:
						for(int i=0;i<n;i++) {
							System.out.println(" nhap thong tin thi sinh thu "+(i+1));
							ThiSinhKhoiA tsA=new ThiSinhKhoiA();
							tsA.nhapThongTin();
							dshs.add(tsA);
						}
						break;
					case 2:
						for(int i=0;i<n;i++) {
							System.out.println(" nhap thong tin thi sinh thu "+(i+1));
							ThiSinhKhoiC tsC=new ThiSinhKhoiC();
							tsC.nhapThongTin();
							dshs.add(tsC);
						}
						break;
				}
				break;
			case 2:
				System.out.println("Thong Tin thi Sinh khoi A");
				for (ThiSinh a:dshs) {
					if(a instanceof ThiSinhKhoiA) {
						ThiSinhKhoiA svA= (ThiSinhKhoiA) a;
						if(svA.getDiemToan() + svA.getDiemLy() + svA.getDiemHoa()  > 20) {
						System.out.println(svA.toString());
					}
					}
				}
				System.out.println("Thong Tin thi Sinh khoi C");
				for (ThiSinh a:dshs) {
					if(a instanceof ThiSinhKhoiC) {
						ThiSinhKhoiC svC= (ThiSinhKhoiC) a;
						if(svC.getDiemVan() + svC.getDiemSu() + svC.getDiemDia()  > 20) {
						System.out.println(svC.toString());
					}
					}
				}
				break;
			case 0:
				break;
				default:
					System.out.println(" moi nhap lai");
			}
		}
	}
	
}

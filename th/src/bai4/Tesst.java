package bai4;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Tesst {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Giaodich> list=new ArrayList<>();
	while(true) {
			System.out.println("menu");
			System.out.println("1.nhap loai giao dich" + "\n" +
								"2.xuat danh sach giao dich" + "\n" +
								"3.so luong moi loai giao dich" + "\n" +
								"4.tinh tb tien giao dich moi loai" + "\n" +
								"5.xuat ra giao dich thang 9 nam 2013" + "\n" +
								"0.thoat");
			int check=sc.nextInt();
			switch (check) {
			case 1: 
				System.out.println("moi ban nhap so giao dich");
				int n=sc.nextInt();
				int i=0;
				System.out.println("moi ban chon loai giao dich");
				System.out.println("\t1.giao dich dat");
				System.out.println("\t2.giao dich nha");
			
					
					int check1=sc.nextInt();
					switch(check1) {
					case 1:
						while(i<n) {
						System.out.println("giao dich thu" + (i+1));
						Giaodichdat dat=new Giaodichdat();
						dat.nhap();
						list.add(dat);
						i++;
						}
						
						break;
					case 2:
						while(i<n) {
						System.out.println("giao dich thu" + (i+1));
						Giaodichnha nha= new Giaodichnha();
						nha.nhap();
						list.add(nha);
						i++;					
					}
						break;
				}
				
				break ;
				case 2:
				System.out.println("___________________________________");	
				for(Giaodich a: list) {
					if(a instanceof Giaodichdat) {
				
						System.out.println(a.toString());
					}
					if(a instanceof Giaodichnha) {
					
						System.out.println(a.toString());
					}
				}
				break;
				case 3:
					int demdat=0;
					int demnha=0;
					for(Giaodich a: list) {
						if(a instanceof Giaodichdat) {
							demdat++;
						}
						if(a instanceof Giaodichnha) {
							demnha++;
						}
					}
					System.out.println("so giao dich dat" + demdat);
					System.out.println("so giao dich nha" + demnha);

			break;
			case 4:
				int dem1=0, dem2=0;
				double tongtiendat=0, tongtiennha=0;
				for(Giaodich a: list) {
					if(a instanceof Giaodichdat) {
						Giaodichdat dat=(Giaodichdat) a;
						tongtiendat+=dat.tinhtiendat();
						dem1++;
					}
					if(a instanceof Giaodichnha) {
						Giaodichnha nha=(Giaodichnha) a;
						tongtiennha+=nha.tinhtiennha();
						dem2++;
					}
				}
				System.out.println("so giao dich dat" +(tongtiendat/dem1));
				System.out.println("so giao dich nha" +(tongtiennha/dem2));
		break;
		case 5:
			for(int z =0;z<list.size();z++) {
				String[] date=list.get(z).getNgaygd().split("/");
				if(date[2].equals("09" )
						&& date[4].equals("2013" )) {
				if(list instanceof Giaodichdat) {				
					System.out.println(list.toString());
				}
				if(list instanceof Giaodichnha) {
					System.out.println(list.toString());
				
				}
			}
			}
		break;
		case 0:
			break;
			default:
				System.out.println("moi ban nhap lai");
			}
		}
		
	}
	}


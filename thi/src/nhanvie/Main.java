package nhanvie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static List<NhanVien> dSNhanVien;
	public static List<NhanVien> dsNhanVien1;
	public static NhanVien nvgiday;
	
public static void main(String[] args) {
	sc=new Scanner(System.in);
	dSNhanVien =new ArrayList<NhanVien>();
	int choose;
	do {
		System.out.println("1. Nhap thong tin nhan vien. ");
		System.out.println("2. In thong tin nhan vien ");
		System.out.println("3. Khi vao file ");
		System.out.println("0. Thoat . ");
		choose=Integer.parseInt(sc.nextLine());
		switch(choose) {
		case 1: 
			NhapThongTin();
			end();
			break;
		case 2: 
			InThongTin();
			end();
			break;
		case 3:
			ghiFile();
			end();
			break;
		case 4: 
			
			dsNhanVien1=docFile();
			for(NhanVien nvdoc: dsNhanVien1) {
                        System.out.println(nvdoc.toString());
			}
			end();
			break;
		}
		
	}while(choose!=0);
}
private static void end() {
	System.out.println("An bat khi de tro lai menu");
	sc.nextLine();
}
private static void InThongTin() {
	System.out.println("Danh Sach Nhan Vien ");
	for(NhanVien nv2: dSNhanVien) {
		nv2.InThongTin();
		System.out.println("=============");
	}
}
private static void NhapThongTin() {
	sc=new Scanner(System.in);
	System.out.println("vui long nhap vao so luong nhan vien ");
	int n=Integer.parseInt(sc.nextLine());
	for(int i=0;i<n;i++) {
		NhanVien nv1 =new NhanVien();
		System.out.println("Moi ban nhap thong tin cua nhan vien "+(i+1));
		nv1.NhapThongTin();
		dSNhanVien.add(nv1);
	}
}
private static void ghiFile() {
	System.out.println("Da thuc hien ghi vao file ");
	try {
		FileWriter fw= new FileWriter("nhanvien.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		for(NhanVien nvtest: dSNhanVien){
			bw.write(nvtest.toString());
			bw.newLine();
		}
		bw.close();
		fw.close();
	} catch (Exception e) {
	}
}
public static List<NhanVien>  docFile() {
	List<NhanVien> dsNhanViens1= new ArrayList<NhanVien>();
	System.out.println("Da doc file ");
	try {
		FileReader fd=new FileReader("nhanvien.txt");
		try (BufferedReader bdtest = new BufferedReader(fd)) {
			String line="";
			// doc tung dong 
			while(true) {
				line=bdtest.readLine();
				if(line==null) {
					break;
				}
				String txt[]=line.split(";"); // cat o  cho co nhieu dau cach
				NhanVien nvtest1= new NhanVien();
				nvtest1.setHoTen(txt[0]);
				nvtest1.setNgaySinh(txt[1]);
				nvtest1.setGioTinh(txt[2]);
				nvtest1.setDiaChi(txt[3]);
				nvtest1.setPhongBan(txt[4]);
				nvtest1.setHeSoLuong(Integer.parseInt(txt[5]));
				nvtest1.setThamNien(Integer.parseInt(txt[6]));
				nvtest1.setLuongCoBan(Integer.parseInt(txt[7]));
				dsNhanViens1.add(nvtest1);
				
			}
                        bdtest.close();
                        fd.close();
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return dsNhanViens1;
}
}

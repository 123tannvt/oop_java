/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static List<Person> listHTTT;
    private static List<Person> listUTT;
    static Scanner sc;
    private static FileClass f;
    
    public static void main(String[] args) {
        listHTTT = new ArrayList<>();
        listUTT = new ArrayList<>();
        f = new FileClass();
        int choose;
        sc = new Scanner(System.in);
        do {
            System.out.println("\n<<<<-----MENU----->>>>");
            System.out.println("1. Them sinh vien.");
            System.out.println("2. Hien thi SinhvienHTTT.");
            System.out.println("0. Thoat.");
            System.out.print("Ban chon: ");
            choose = sc.nextInt();
            switch(choose) {
                case 1:
                    themSinhVien();
                    end();
                    break;
                case 2:
                    hienThiSinhVien();
                    sc.nextLine();
                    end();
                    break;
            }
        }while(choose != 0);
    }
    
    public static void themSinhVien() {   
                    NhanVien a = new NhanVien();
                    a.nhapThongTin();
                    listHTTT.add(a);
                    f.writeToFile(listHTTT, "svhttt.dat");
    }
    
    public static void hienThiSinhVien() {
                    listHTTT = f.readDataFromFile("svhttt.dat");
                    for(Person s:listHTTT) {
                        s.hienThiThongTin();
    }
    }
    public static void end() {
        System.out.print("\nAn phim bat ky de tro ve MENU.");
        sc.nextLine();
    }
}
        

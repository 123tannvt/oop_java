package b1;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QLNV {
 
    static File nhanviendat = new File("nhanvien.dat");
    
    public static void main(String args[]) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        int ch;
        menu();
        do{
            System.out.print("[/]: ");
            ch = input.nextInt();
            switch (ch){
                case 1:
                    nhapNhanVien();
                    break;
                case 2:
                    xuatFile();
                    break;
                case 3:
                    copySangtxt();
                    break;
                case 4:
                    copySangFileKhac();
                    break;
                default:
                    clearFile();
                    System.out.println("Good bye");
            }
        }while(ch>0&&ch<5);
    }

    private static void menu() {
        System.out.println("1. Them nhan vien\n"
                + "2. Xuat file nhanvien.dat\n"
                + "3. copy sang nhanvien.txt\n"
                + "4. copy sang file khac"); 
    }

    private static void nhapNhanVien() { 
        try { 
            List<NhanVien> l = docFile();
            System.out.print("So luong nhan vien: ");  
            int n = new Scanner(System.in).nextInt();
            for (int i=0;i<n;i++){
                l.add(new NhanVien() );
            }
            BufferedWriter buffer = new BufferedWriter(new FileWriter(nhanviendat));
            l.forEach(x->{
                try {
                    buffer.write(x.toString()+"\n");
                } catch (IOException ex) {
                    Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            buffer.close();
            System.out.println("Done"); 
        } catch (IOException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    private static void xuatFile() {
        List<NhanVien> l = docFile();
        if(l.size()==0){
            System.out.println("File rong");
        }else{
            //l.forEach(System.out::println); 
            for(NhanVien a:l){
                System.out.println(a);
            }
            System.out.println("END");
        }
    }

    private static  List<NhanVien> docFile (){
        List<NhanVien> l = new ArrayList<>();
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(new File("nhanvien.dat"))); 
            while((line=br.readLine())!=null){ 
                l.add(docMotNhanVien(line));
            } 
            br.close();
        } catch (FileNotFoundException ex) { 
        } catch (IOException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return l;
    }
    
    private static NhanVien docMotNhanVien(String s) {
        String[] a = s.split("\\$"); 
        double hsl = Double.parseDouble(a[5]);
        int thamNien =Integer.parseInt(a[6]);
        double luongCB = Double.parseDouble(a[7]);
        return new NhanVien(a[0],a[1],a[2],a[3],a[4],hsl,thamNien,luongCB);
    } 

    private static void copySangtxt() {
        List<NhanVien> l = docFile();
        try {  
            BufferedWriter buffer = new BufferedWriter(new FileWriter("nhanvien.txt"));
            l.forEach(x->{
                try {
                    buffer.write(x.toString()+"\n");
                } catch (IOException ex) {
                    Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            buffer.close();
            System.out.println("Done"); 
        } catch (IOException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    private static void copySangFileKhac() {
        List<NhanVien> l = docFile();
        try {  
            System.out.println("Ten file: ");
            File f = new File(new Scanner(System.in).nextLine());
            BufferedWriter buffer = new BufferedWriter(new FileWriter(f));
            l.forEach(x->{
                try {
                    buffer.write(x.toString()+"\n");
                } catch (IOException ex) {
                    Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            buffer.close();
            System.out.println("Done"); 
        } catch (IOException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 

    private static void clearFile() {
        nhanviendat.deleteOnExit();
        System.out.println("clear");        
    }

}

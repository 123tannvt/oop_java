package th7bai4qltv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int i=0;
		List<TheMuon> list=new ArrayList<>();
		System.out.println(" nhap so luong n =");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		while(i<n) {
			TheMuon themuon=new TheMuon();
			themuon.Insert();
			list.add(themuon);
			i++;
			}
		System.out.println(" ban co muon luu file khong (y/n)");
		String traloi="";
		traloi=new Scanner(System.in).nextLine();
		if(traloi.equalsIgnoreCase("y")) {
			FileOutputStream fos=null;
			try {
				fos =new FileOutputStream("themuon.dat",true);
				for(TheMuon a: list) {
					String line=a.getFileLine();
					byte[] b=line.getBytes("utf8");
					fos.write(b);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
				 try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		}
		 FileInputStream file=null;
		 InputStreamReader reader=null;
		 BufferedReader bufferedreader=null; 
		 try {
			 file=new FileInputStream("themuon.dat");
			reader= new InputStreamReader(file);
			bufferedreader= new BufferedReader(reader);
			String line="";
				while((line=bufferedreader.readLine()) !=null) {
					if(line.isEmpty()) {
						continue;
					}
				TheMuon tm=new TheMuon();
				list.add(tm);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 if(file!=null) {
				 try {
					file.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 if(reader!=null) {
				 try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			 if(bufferedreader!=null) {
				 try {
					bufferedreader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
		for(TheMuon a: list) {
			System.out.println(a.toString());
		}
	}

}

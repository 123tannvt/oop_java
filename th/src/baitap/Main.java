package baitap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static ArrayList<Student>  studentList=new ArrayList<>();
	static Scanner scanner=new Scanner(System.in);
	
public static void main(String[] args) {
	int choose;
	do {
		showMenu();
		choose= new Scanner(System.in).nextInt();
		switch(choose) {
		case 1:
			intputStudent();
			break;
		case 2:
			editStudentById();
			break;
		case 3:
			deleteStudentById();
			break;
		case 4:
			sortStudentByGPA();
			break;
		case 5:
			sortStudentByName();
			break;
		case 6:
			showInformation();
			break;
		case 7:
			saveFile();
			break;
		case 8:
			readFile();
			break;
		case 0:
			System.out.println("Thoát");
			break;
			default:
				System.out.println("Nhập sai vui lòng nhập lại");
				break;
		}	
	}while(choose!=0);
}
private static void readFile() {
	FileInputStream fis=null;
	InputStreamReader reader=null;
	BufferedReader bufferedReader=null;
	try {
		fis=new FileInputStream("student.txt");
		reader = new InputStreamReader(fis,StandardCharsets.UTF_8);
		bufferedReader =new BufferedReader(reader);
		// bo dem ho tro doc cho nhanh
		String line=null;
		while((line=bufferedReader.readLine())!=null) {
			if(line.isEmpty()) {
				continue;
			}
			Student std =new Student();
			std.parse(line);
			studentList.add(std);
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		if(fis!=null) {
			try {
				fis.close();
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
		if(bufferedReader!=null) {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
private static void saveFile() {
	System.out.println("Bắt đầu lưu ");
	FileOutputStream fos=null;
	try {
		fos=new FileOutputStream("student.txt",true);
		for(Student std: studentList) {
			String Line=std.getFileLine();
			byte[] b=Line.getBytes("utf8");
			fos.write(b);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(fos!=null) {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
private static void showInformation() {
	for(Student std:studentList) {
		std.output();
	}
}
private static void sortStudentByName() {
	Collections.sort(studentList,new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return -o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
}
private static void sortStudentByGPA() {
	Collections.sort(studentList,new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.getGpa()>o2.getGpa()) {
				return -1;
			}
			return 1;
		}
		
	});
}
private static void deleteStudentById() {
	System.out.println("Nhập Id sinh viên cần xóa ");
	int id=Integer.parseInt(scanner.nextLine());
	for(Student std: studentList) {
		if(std.getId()==id) {
			studentList.remove(std);
			break;
		}
	}
}
private static void editStudentById() {
	System.out.println("Nhập Id sinh viên cần sửa ");
	int id=Integer.parseInt(scanner.nextLine());
	for(Student std: studentList) {
		if(std.getId()==id) {
			std.input();
			break;
		}
	}
}
private static void intputStudent() {
System.out.println("Nhập số sinh viên cần thêm");
int n=Integer.parseInt(scanner.nextLine());
for(int i=0;i<n;i++) {
	Student std =new Student();
	std.input();
	studentList.add(std);
}
}
public static void showMenu() {
	System.out.println("1. THÊM SINH VIÊN ");
	System.out.println("2. SỬA SINH VIÊN THEO ID");
	System.out.println("3. XÓA SINH VIÊN THEO ID");
	System.out.println("4 SẮP XẾP THEO GPA");
	System.out.println("5. SẮP XẾP THEO TÊN ");
	System.out.println("6. HIỂN THỊ THÔNG TIN SINH VIÊN");
	System.out.println("7. LƯU VÀO FILE \"student.txt\"");
	System.out.println("8. ĐỌC NỘI dUNG SINH VIÊN TỪ FILE \"student.txt\"");
	System.out.println("THOÁT CHƯƠNG TRÌNH");
}
}

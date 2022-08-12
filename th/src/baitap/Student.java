package baitap;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class Student { 
public static int count=0;
private int id,age;
private String name,address;
float gpa;

public Student() {
	this.id=++count;
}
public Student( int age, String name, String address, float gpa) {
	super();
	this.id=++count;
	this.age = age;
	this.name = name;
	this.address = address;
	this.gpa = gpa;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}
@Override
	public String toString() {
		return "Student : "+"Id "+this.id+" name "+this.name+" Age "+this.age+" Address "+this.address+" GPA "+this.gpa+"\n";
	}
public String getFileLine() {
	return id+","+name+","+age+","+address+","+gpa;
}
public void output() {
	System.out.println("\tId :"+this.id);
	System.out.println("\tName :"+this.name);
	System.out.println("\tAge : "+this.age);
	System.out.println("\tAddress :"+this.address);
	System.out.println("\tGPA :"+this.gpa);
	
}
public void parse(String line) {
	String[] params=line.split(",");
	try {
		id=Integer.parseInt(params[0]);
		name=params[1];
		age=Integer.parseInt(params[2]);
		address=params[3];
		gpa=Float.parseFloat(params[4]);	
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
public void input() {
//	System.out.println("Id :");
//	this.id=new Scanner(System.in).nextInt();
	//this.id=Integer.parseInt(sc.nextLine());
	System.out.println("Name :");
	this.name=new Scanner(System.in).nextLine();
	System.out.println("Age : ");
	this.age=new Scanner(System.in).nextInt();
	System.out.println("Address :");
	this.address=new Scanner(System.in).nextLine();
	System.out.println("GPA :");
	this.gpa=new Scanner(System.in).nextFloat();
	
}
}

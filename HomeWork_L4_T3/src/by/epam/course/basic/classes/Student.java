package by.epam.course.basic.classes;

public class Student {
	private String FIO;
	private int �������1;
	private int �������2;
	private int �������3;

	public Student(String fIO, int �������1, int �������2, int �������3) {
		super();
		FIO = fIO;
		�������1 = �������1;
		�������2 = �������2;
		�������3 = �������3;
	}
	public int get�������1() {
		return �������1;
	}
	public void set�������1(int �������1) {
		�������1 = �������1;
	}
	public int get�������2() {
		return �������2;
	}
	public void set�������2(int �������2) {
		�������2 = �������2;
	}
	public int get�������3() {
		return �������3;
	}
	public void set�������3(int �������3) {
		�������3 = �������3;
	}
	
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	public double getMediana(){
		double mediana = 0;
		mediana = (this.get�������1() + this.get�������2() + this.get�������3()) / 3;
		
		return mediana;
	}
	
	public void show(){
		System.out.println("Student [FIO=" + FIO + ", �������1=" + �������1 + ", �������2=" + �������2 + ", �������3=" + �������3
				+ "]");
	}
	
	
	
}

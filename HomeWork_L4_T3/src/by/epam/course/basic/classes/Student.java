package by.epam.course.basic.classes;

public class Student {
	private String FIO;
	private int Предмет1;
	private int Предмет2;
	private int Предмет3;

	public Student(String fIO, int предмет1, int предмет2, int предмет3) {
		super();
		FIO = fIO;
		Предмет1 = предмет1;
		Предмет2 = предмет2;
		Предмет3 = предмет3;
	}
	public int getПредмет1() {
		return Предмет1;
	}
	public void setПредмет1(int предмет1) {
		Предмет1 = предмет1;
	}
	public int getПредмет2() {
		return Предмет2;
	}
	public void setПредмет2(int предмет2) {
		Предмет2 = предмет2;
	}
	public int getПредмет3() {
		return Предмет3;
	}
	public void setПредмет3(int предмет3) {
		Предмет3 = предмет3;
	}
	
	public String getFIO() {
		return FIO;
	}
	public void setFIO(String fIO) {
		FIO = fIO;
	}
	public double getMediana(){
		double mediana = 0;
		mediana = (this.getПредмет1() + this.getПредмет2() + this.getПредмет3()) / 3;
		
		return mediana;
	}
	
	public void show(){
		System.out.println("Student [FIO=" + FIO + ", Предмет1=" + Предмет1 + ", Предмет2=" + Предмет2 + ", Предмет3=" + Предмет3
				+ "]");
	}
	
	
	
}

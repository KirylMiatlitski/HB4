package by.epam.course.basic.classes;

public class Person {
	private String �������;
	private String ���;
	private String ��������;
	
	public Person() {
		this.���="";
		this.��������="";
		this.�������="";
	}
	
	public Person(String �������, String ���, String ��������) {
		this.������� = �������;
		this.��� = ���;
		this.�������� = ��������;
	}

	public String get�������() {
		return �������;
	}

	public void set�������(String �������) {
		this.������� = �������;
	}

	public String get���() {
		return ���;
	}

	public void set���(String ���) {
		this.��� = ���;
	}

	public String get��������() {
		return ��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}
	
	public void show(){
		System.out.println("���: "+ this.���);
		System.out.println("��������: "+ this.��������);
		System.out.println("�������: "+ this.�������);
	}

}

package by.epam.course.basic.classes;

public class Student extends Person {

	// ����������
	private int id;
	private String birthDay;
	private String adress;
	private String phoneNumber;
	private String ���������;
	private int ����;
	
	// ������������	
	public Student() {
		super();
		this.adress="";
		this.birthDay="";
		this.id=0;
		this.phoneNumber="";
		this.����=0;
		this.���������="";
	}

	public Student(String �������, String ���, String ��������) {
		super(�������, ���, ��������);
		this.adress="";
		this.birthDay="";
		this.id=0;
		this.phoneNumber="";
		this.����=0;
		this.���������="";
	}

	public Student(String �������, String ���, String ��������, int id, String birthDay, String adress,
			String phoneNumber, String ���������, int ����) {
		super(�������, ���, ��������);
		this.id = id;
		this.birthDay = birthDay;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.��������� = ���������;
		this.���� = ����;
	}
	
	// ������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String get���������() {
		return ���������;
	}
	public void set���������(String ���������) {
		this.��������� = ���������;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	
	public void show(){
		System.out.println("***���������� � ��������***");
		super.show();		
		System.out.println("Adress: "+ this.adress);
		System.out.println("Birth Day: "+ this.birthDay);
		System.out.println("Student Id: "+ this.id);
		System.out.println("Phone Number: "+ this.phoneNumber);
		System.out.println("����: "+ this.����);
		System.out.println("���������: "+ this.���������);
	}	
	
	public void getIdAndFullName(){
		System.out.println("***��� + ID**");
		super.show();		
		System.out.println("Student Id: "+ this.id);
		
	}

}

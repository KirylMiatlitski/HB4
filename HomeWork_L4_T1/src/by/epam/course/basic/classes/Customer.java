package by.epam.course.basic.classes;

public class Customer extends Person {
	
	// ����������
	private int id;
	private String adress;
	private String ����������������������;
	private String ���������������������;

	// ������������
	public Customer() {
		super();
		this.adress="";
		this.id=0;
		this.���������������������="";
		this.����������������������="";		
	}

	public Customer(String �������, String ���, String ��������) {
		super(�������, ���, ��������);
		this.adress="";
		this.id=0;
		this.���������������������="";
		this.����������������������="";
	}

	public Customer(String �������, String ���, String ��������, int id, String adress, String ����������������������,
					String ���������������������) {
		super(�������, ���, ��������);
		this.id = id;
		this.adress = adress;
		this.���������������������� = ����������������������;
		this.��������������������� = ���������������������;
	}
	
	// ������
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String get����������������������() {
		return ����������������������;
	}

	public void set����������������������(String ����������������������) {
		this.���������������������� = ����������������������;
	}

	public String get���������������������() {
		return ���������������������;
	}

	public void set���������������������(String ���������������������) {
		this.��������������������� = ���������������������;
	}
	
	public void show(){
		System.out.println("***���������� � �������***");
		super.show();		
		System.out.println("Adress: "+ this.adress);
		System.out.println("Student Id: "+ this.id);
		System.out.println("����� ����������� �����: "+ this.���������������������);
		System.out.println("����� ��������� ��������: "+ this.����������������������);		
	}	
	
	public void getIdAndFullName(){
		System.out.println("***��� + ID**");
		super.show();		
		System.out.println("Student Id: "+ this.id);
		
	}
	
	
}

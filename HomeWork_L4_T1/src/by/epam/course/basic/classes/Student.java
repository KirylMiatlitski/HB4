package by.epam.course.basic.classes;

public class Student extends Person {

	// переменные
	private int id;
	private String birthDay;
	private String adress;
	private String phoneNumber;
	private String факультет;
	private int курс;
	
	// конструкторы	
	public Student() {
		super();
		this.adress="";
		this.birthDay="";
		this.id=0;
		this.phoneNumber="";
		this.курс=0;
		this.факультет="";
	}

	public Student(String фамилия, String имя, String отчество) {
		super(фамилия, имя, отчество);
		this.adress="";
		this.birthDay="";
		this.id=0;
		this.phoneNumber="";
		this.курс=0;
		this.факультет="";
	}

	public Student(String фамилия, String имя, String отчество, int id, String birthDay, String adress,
			String phoneNumber, String факультет, int курс) {
		super(фамилия, имя, отчество);
		this.id = id;
		this.birthDay = birthDay;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.факультет = факультет;
		this.курс = курс;
	}
	
	// методы
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
	public String getФакультет() {
		return факультет;
	}
	public void setФакультет(String факультет) {
		this.факультет = факультет;
	}
	public int getКурс() {
		return курс;
	}
	public void setКурс(int курс) {
		this.курс = курс;
	}
	
	public void show(){
		System.out.println("***Информация о студенте***");
		super.show();		
		System.out.println("Adress: "+ this.adress);
		System.out.println("Birth Day: "+ this.birthDay);
		System.out.println("Student Id: "+ this.id);
		System.out.println("Phone Number: "+ this.phoneNumber);
		System.out.println("Курс: "+ this.курс);
		System.out.println("Факультет: "+ this.факультет);
	}	
	
	public void getIdAndFullName(){
		System.out.println("***ФИО + ID**");
		super.show();		
		System.out.println("Student Id: "+ this.id);
		
	}

}

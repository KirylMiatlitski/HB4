package by.epam.course.basic.classes;

public class Customer extends Person {
	
	// переменные
	private int id;
	private String adress;
	private String номер редитной арточки;
	private String номерЅанковского—чЄта;

	// конструкторы
	public Customer() {
		super();
		this.adress="";
		this.id=0;
		this.номерЅанковского—чЄта="";
		this.номер редитной арточки="";		
	}

	public Customer(String фамили€, String им€, String отчество) {
		super(фамили€, им€, отчество);
		this.adress="";
		this.id=0;
		this.номерЅанковского—чЄта="";
		this.номер редитной арточки="";
	}

	public Customer(String фамили€, String им€, String отчество, int id, String adress, String номер редитной арточки,
					String номерЅанковского—чЄта) {
		super(фамили€, им€, отчество);
		this.id = id;
		this.adress = adress;
		this.номер редитной арточки = номер редитной арточки;
		this.номерЅанковского—чЄта = номерЅанковского—чЄта;
	}
	
	// методы
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

	public String getЌомер редитной арточки() {
		return номер редитной арточки;
	}

	public void setЌомер редитной арточки(String номер редитной арточки) {
		this.номер редитной арточки = номер редитной арточки;
	}

	public String getЌомерЅанковского—чЄта() {
		return номерЅанковского—чЄта;
	}

	public void setЌомерЅанковского—чЄта(String номерЅанковского—чЄта) {
		this.номерЅанковского—чЄта = номерЅанковского—чЄта;
	}
	
	public void show(){
		System.out.println("***»нформаци€ о клиенте***");
		super.show();		
		System.out.println("Adress: "+ this.adress);
		System.out.println("Student Id: "+ this.id);
		System.out.println("Ќомер Ѕанковского —чЄта: "+ this.номерЅанковского—чЄта);
		System.out.println("Ќомер  редитной  арточки: "+ this.номер редитной арточки);		
	}	
	
	public void getIdAndFullName(){
		System.out.println("***‘»ќ + ID**");
		super.show();		
		System.out.println("Student Id: "+ this.id);
		
	}
	
	
}

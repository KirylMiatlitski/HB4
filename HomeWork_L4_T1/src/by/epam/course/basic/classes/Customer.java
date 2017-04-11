package by.epam.course.basic.classes;

public class Customer extends Person {
	
	// ïåðåìåííûå
	private int id;
	private String adress;
	private String íîìåðÊðåäèòíîéÊàðòî÷êè;// называть поля кирилицей не стоит, тем более что без utf-8 их и не прочитать
	private String íîìåðÁàíêîâñêîãîÑ÷¸òà;

	// êîíñòðóêòîðû
	public Customer() {
		super();
		this.adress="";
		this.id=0;
		this.íîìåðÁàíêîâñêîãîÑ÷¸òà="";
		this.íîìåðÊðåäèòíîéÊàðòî÷êè="";		
	}

	public Customer(String ôàìèëèÿ, String èìÿ, String îò÷åñòâî) {
		super(ôàìèëèÿ, èìÿ, îò÷åñòâî);
		this.adress="";
		this.id=0;
		this.íîìåðÁàíêîâñêîãîÑ÷¸òà="";
		this.íîìåðÊðåäèòíîéÊàðòî÷êè="";
	}

	public Customer(String ôàìèëèÿ, String èìÿ, String îò÷åñòâî, int id, String adress, String íîìåðÊðåäèòíîéÊàðòî÷êè,
					String íîìåðÁàíêîâñêîãîÑ÷¸òà) {
		super(ôàìèëèÿ, èìÿ, îò÷åñòâî);
		this.id = id;
		this.adress = adress;
		this.íîìåðÊðåäèòíîéÊàðòî÷êè = íîìåðÊðåäèòíîéÊàðòî÷êè;
		this.íîìåðÁàíêîâñêîãîÑ÷¸òà = íîìåðÁàíêîâñêîãîÑ÷¸òà;
	}
	
	// ìåòîäû
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

	public String getÍîìåðÊðåäèòíîéÊàðòî÷êè() {
		return íîìåðÊðåäèòíîéÊàðòî÷êè;
	}

	public void setÍîìåðÊðåäèòíîéÊàðòî÷êè(String íîìåðÊðåäèòíîéÊàðòî÷êè) {
		this.íîìåðÊðåäèòíîéÊàðòî÷êè = íîìåðÊðåäèòíîéÊàðòî÷êè;
	}

	public String getÍîìåðÁàíêîâñêîãîÑ÷¸òà() {
		return íîìåðÁàíêîâñêîãîÑ÷¸òà;
	}

	public void setÍîìåðÁàíêîâñêîãîÑ÷¸òà(String íîìåðÁàíêîâñêîãîÑ÷¸òà) {
		this.íîìåðÁàíêîâñêîãîÑ÷¸òà = íîìåðÁàíêîâñêîãîÑ÷¸òà;
	}
	
	public void show(){
		System.out.println("***Èíôîðìàöèÿ î êëèåíòå***");
		super.show();		
		System.out.println("Adress: "+ this.adress);
		System.out.println("Student Id: "+ this.id);
		System.out.println("Íîìåð Áàíêîâñêîãî Ñ÷¸òà: "+ this.íîìåðÁàíêîâñêîãîÑ÷¸òà);
		System.out.println("Íîìåð Êðåäèòíîé Êàðòî÷êè: "+ this.íîìåðÊðåäèòíîéÊàðòî÷êè);		
	}	
	
	public void getIdAndFullName(){
		System.out.println("***ÔÈÎ + ID**");
		super.show();		
		System.out.println("Student Id: "+ this.id);
		
	}
	
	
}

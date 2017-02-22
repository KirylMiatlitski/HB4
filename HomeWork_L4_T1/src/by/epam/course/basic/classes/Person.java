package by.epam.course.basic.classes;

public class Person {
	private String фамилия;
	private String имя;
	private String отчество;
	
	public Person() {
		this.имя="";
		this.отчество="";
		this.фамилия="";
	}
	
	public Person(String фамилия, String имя, String отчество) {
		this.фамилия = фамилия;
		this.имя = имя;
		this.отчество = отчество;
	}

	public String getФамилия() {
		return фамилия;
	}

	public void setФамилия(String фамилия) {
		this.фамилия = фамилия;
	}

	public String getИмя() {
		return имя;
	}

	public void setИмя(String имя) {
		this.имя = имя;
	}

	public String getОтчество() {
		return отчество;
	}

	public void setОтчество(String отчество) {
		this.отчество = отчество;
	}
	
	public void show(){
		System.out.println("Имя: "+ this.имя);
		System.out.println("Отчество: "+ this.отчество);
		System.out.println("Фамилия: "+ this.фамилия);
	}

}
